package com.example.resourcesapp.ui.contactForm;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.resourcesapp.R;

import java.util.Objects;

public class ContactFragment extends Fragment {
    View view;
    Button bt;
    EditText et;
    EditText et1;
    EditText et2;

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
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et.getText().toString();
                String email = et1.getText().toString();
                String message = et2.getText().toString();

                if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
                    Toast.makeText(getContext(), "Please check", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(),"mail sent", Toast.LENGTH_SHORT).show();
                    sendEmail(name, email, message);
                }

            }
        });
        return view;
    }

    public void sendEmail(String name, String email, String message){


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "fortv3457@gmail.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact Form Submission from " + name);
        intent.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n" + "\nEmail: " + email + "\n" + "\n" + "\nMessage: " + message);


        startActivity(Intent.createChooser(intent, "Email via..."));



    }

}

/*
when option chosen on spinner display the corresponding fields to enter data
* broken links
*improvement
*problematic stuff

 */