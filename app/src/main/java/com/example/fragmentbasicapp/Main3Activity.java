package com.example.fragmentbasicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main3Activity extends AppCompatActivity {
    ToggleButton moodtbtn,choicetbtn;
    Button subbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        moodtbtn=findViewById(R.id.togglemood);
        choicetbtn=findViewById(R.id.togglechoice);
        subbtn=findViewById(R.id.submitbtn);

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String status="Mood"+moodtbtn.getText()+"\n Choice"+choicetbtn.getText();
                Toast.makeText(Main3Activity.this,status, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
