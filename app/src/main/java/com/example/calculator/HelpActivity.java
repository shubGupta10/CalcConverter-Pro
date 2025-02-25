package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HelpActivity extends AppCompatActivity {

     Button github_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        github_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/shubGupta10/CalcConverter/tree/master";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }


    public void Calculator_btn(View v){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.setType("message/rfc822");
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{"shubhamkgupta720@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Bugs and Feedback");
        Toast.makeText(this, "Send Your Valuable Feedback to the developer!!", Toast.LENGTH_SHORT).show();
        email.putExtra(Intent.EXTRA_TEXT, "Hello User, Send your bugs and Feedback here!!");
        startActivity(Intent.createChooser(email, "Email Via"));
    }
}
