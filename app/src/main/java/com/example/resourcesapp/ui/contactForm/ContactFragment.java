package com.example.resourcesapp.ui.contactForm;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.resourcesapp.R;

import java.util.ArrayList;
import java.util.Objects;

public class ContactFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    View view;
    Button bt;
    EditText et;
    EditText et1;
    EditText et2;
    Spinner spin;
    String name;
    String email;
    String message;
    Toast toast1;
    int spinner_num;
    String spinner_identifier;




    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        bt = view.findViewById(R.id.button);
        et = view.findViewById(R.id.textView2);
        et1 = view.findViewById(R.id.editTextText);
        et2 = view.findViewById(R.id.editTextText2);
        spin = view.findViewById(R.id.spinner_contact);

        ArrayList<String> categories = new ArrayList<String>();

        // Spinner click listener
        spin.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        categories.add("--- ---");
        categories.add("Broken Links");
        categories.add("Improvements");
        categories.add("Request Addition");
        categories.add("Report Bugs");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spin.setAdapter(dataAdapter);




        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = et.getText().toString();
                email = et1.getText().toString();
                message = et2.getText().toString();

                if (spinner_num == 0) {
                    Toast.makeText(getContext(), "Please choose a reason", Toast.LENGTH_SHORT).show();
                }else {

                    if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
                        Toast.makeText(getContext(), "Please fill all fields", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getContext(), "Heading to mail app", Toast.LENGTH_SHORT).show();
                        Handler hd = new Handler();
                        hd.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                sendEmail(name, email, message);
                            }
                        },1000);

                    }
                }
            }
        });
        return view;
    }

    public void sendEmail(String name, String email, String message){


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "fortv3457@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT,  spinner_identifier + "Contact Form Submission from " + name);
        intent.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n" + "\nEmail: " + email + "\n" + "\n" + "\nMessage: " + "\n" + "\n" + message);


        startActivity(Intent.createChooser(intent, "Email via..."));



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            // On selecting a spinner item
            String item = parent.getItemAtPosition(position).toString();
            spinner_num = position;
            if (toast1 != null){
                toast1.cancel();
            }
            if (position != 0){
                // Showing selected spinner item
//                toast1 = Toast.makeText(parent.getContext(), "Selected: " + position, Toast.LENGTH_LONG);
//                toast1.show();
                switch (position){
                    case 1 -> {spinner_identifier = "{BrokenLink} ";}
                    case 2 -> {spinner_identifier = "{Improvements} ";}
                    case 3 -> {spinner_identifier = "{AdditionRequest} ";}
                    case 4 -> {spinner_identifier = "{BugReport} ";}
                }
                switch (position){
                    case 0 -> {et2.setHint("choose a reason");
                        setHeight();
                    enable();}
                    case 1 -> {et2.setHint("enter the name of resource whose link is not working \n \nuse format: \n\ncoding > codinggames > z type");
                        setHeight();
                    enable();}
                    case 2 -> {et2.setHint("what do you think i can improve?");
                        setHeight();
                    enable();}
                    case 3 -> {et2.setHint("what would you like me to add? \nadd name, url and a short description \n \nuse format: \n \nname\nhttps://www.example.com\ndescription");
                        setHeight();
                    enable();}
                    case 4 -> {et2.setHint("report bug\n \nuse format: \n\ncoding>codinggames>z type \n \ndescription and trigger of bug");
                        setHeight();
                    enable();}
                }

            }else {
                et2.setHint("choose a option");
                setHeight();
                et2.setEnabled(false);
//                et2.setClickable(false);
            }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    void setHeight(){
        ViewGroup.LayoutParams params  =  et2.getLayoutParams();
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        et2.setLayoutParams(params); /* Gives as much height for multi line*/

        et2.setSingleLine(false); /* Makes it Multi line */
    }

    void enable(){
        et2.setEnabled(true);
    }
}