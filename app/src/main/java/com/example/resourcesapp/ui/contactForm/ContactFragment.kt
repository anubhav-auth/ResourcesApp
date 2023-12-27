package com.example.resourcesapp.ui.contactForm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.resourcesapp.R

class ContactFragment : Fragment(), AdapterView.OnItemSelectedListener {
    var fragmentView: View? = null
    var bt: Button? = null
    var et: EditText? = null
    var et1: EditText? = null
    var et2: EditText? = null
    var spin: Spinner? = null
    var name: String? = null
    var email: String? = null
    var message: String? = null
    var toast1: Toast? = null
    var spinner_num = 0
    var spinner_identifier: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentView = inflater.inflate(R.layout.fragment_contact, container, false)
        bt = fragmentView?.findViewById(R.id.button)
        et = fragmentView?.findViewById(R.id.textView2)
        et1 = fragmentView?.findViewById(R.id.editTextText)
        et2 = fragmentView?.findViewById(R.id.editTextText2)
        spin = fragmentView?.findViewById(R.id.spinner_contact)
        val categories = ArrayList<String>()

        // Spinner click listener
        spin?.setOnItemSelectedListener(this)

        // Spinner Drop down elements
        categories.add("--- ---")
        categories.add("Broken Links")
        categories.add("Improvements")
        categories.add("Request Addition")
        categories.add("Report Bugs")

        // Creating adapter for spinner
        val dataAdapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, categories)

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // attaching data adapter to spinner
        spin?.setAdapter(dataAdapter)
        bt?.setOnClickListener(View.OnClickListener {
            name = et?.getText().toString()
            email = et1?.getText().toString()
            message = et2?.getText().toString()
            if (spinner_num == 0) {
                Toast.makeText(context, "Please choose a reason", Toast.LENGTH_SHORT).show()
            } else {
                if (name!!.isEmpty() || email!!.isEmpty() || message!!.isEmpty()) {
                    Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "Heading to mail app", Toast.LENGTH_SHORT).show()
                    val hd = Handler()
                    hd.postDelayed({ sendEmail(name!!, email!!, message!!) }, 1000)
                }
            }
        })
        return fragmentView
    }

    fun sendEmail(name: String, email: String, message: String) {
        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:")
        intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("fortv3457@gmail.com"))
        intent.putExtra(
            Intent.EXTRA_SUBJECT,
            spinner_identifier + "Contact Form Submission from " + name
        )
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Name: $name\n\nEmail: $email\n\n\nMessage: \n\n$message"
        )
        startActivity(Intent.createChooser(intent, "Email via..."))
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

        // On selecting a spinner item
        val item = parent.getItemAtPosition(position).toString()
        spinner_num = position
        if (toast1 != null) {
            toast1!!.cancel()
        }
        if (position != 0) {
            // Showing selected spinner item
//                toast1 = Toast.makeText(parent.getContext(), "Selected: " + position, Toast.LENGTH_LONG);
//                toast1.show();
            when (position) {
                1 -> {
                    spinner_identifier = "{BrokenLink} "
                }

                2 -> {
                    spinner_identifier = "{Improvements} "
                }

                3 -> {
                    spinner_identifier = "{AdditionRequest} "
                }

                4 -> {
                    spinner_identifier = "{BugReport} "
                }
            }
            when (position) {
                0 -> {
                    et2!!.hint = "choose a reason"
                    setHeight()
                    enable()
                }

                1 -> {
                    et2!!.hint =
                        "enter the name of resource whose link is not working \n \nuse format: \n\ncoding > codinggames > z type"
                    setHeight()
                    enable()
                }

                2 -> {
                    et2!!.hint = "what do you think i can improve?"
                    setHeight()
                    enable()
                }

                3 -> {
                    et2!!.hint =
                        "what would you like me to add? \nadd name, url and a short description \n \nuse format: \n \nname\nhttps://www.example.com\ndescription"
                    setHeight()
                    enable()
                }

                4 -> {
                    et2!!.hint =
                        "report bug\n \nuse format: \n\ncoding>codinggames>z type \n \ndescription and trigger of bug"
                    setHeight()
                    enable()
                }
            }
        } else {
            et2!!.hint = "choose a option"
            setHeight()
            et2!!.isEnabled = false
            //                et2.setClickable(false);
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}
    fun setHeight() {
        val params = et2!!.layoutParams
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT
        et2!!.layoutParams = params /* Gives as much height for multi line*/
        et2!!.isSingleLine = false /* Makes it Multi line */
    }

    fun enable() {
        et2!!.isEnabled = true
    }

    companion object {
        fun newInstance(): ContactFragment {
            return ContactFragment()
        }
    }
}