package com.example.halpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class askexam extends AppCompatActivity {
    public Button button;
    public CheckBox checkBox;
    public EditText textdate, texttime,location,language, contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_askexam);
        button = (Button) findViewById(R.id.button8);
        checkBox = (CheckBox) findViewById(R.id.checkBox2);
        textdate = (EditText) findViewById(R.id.editTextDate);
        texttime = (EditText) findViewById(R.id.editTextTime);
        location = (EditText) findViewById(R.id.editText);
        language = (EditText) findViewById(R.id.editText2);
        contact = (EditText) findViewById(R.id.editTextPhone2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(askexam.this, "Data Submitted to Helpers", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Data Submitted to Helpers",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(getApplicationContext(),dashboard2.class);
                startActivity(intent);
            }
        });
    }
}