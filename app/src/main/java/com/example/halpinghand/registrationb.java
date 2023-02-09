package com.example.halpinghand;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class registrationb extends AppCompatActivity {
    public Button button;
    private EditText name,email,contact,pass,city,college,medium;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationb);
        name = (EditText) findViewById(R.id.nameb);
        email = (EditText) findViewById(R.id.emailb);
        contact=(EditText) findViewById(R.id.contactb);
        pass = (EditText) findViewById(R.id.passwordb);
        city=(EditText) findViewById(R.id.cityb);
        college=(EditText) findViewById(R.id.collegeb);
        medium =(EditText) findViewById(R.id.mediumb);
        button=(Button) findViewById(R.id.buttonb);
        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameB = name.getText().toString();
                String emailB = email.getText().toString();
                String contactB = contact.getText().toString();
                String passB = pass.getText().toString();
                String cityB = city.getText().toString();
                String collegeB = college.getText().toString();
                String mediumB = medium.getText().toString();

                databaseHelper.blinduserdbDao().addUser(
                        new blinduserdb(nameB,emailB,Integer.parseInt(contactB),passB,cityB,collegeB,mediumB)
                );
                ArrayList<blinduserdb> arrBlindUser =(ArrayList<blinduserdb>) databaseHelper.blinduserdbDao().selectAll();
                for(int i = 0; i <arrBlindUser.size(); i++){
                    Log.d("data", "Name:"+arrBlindUser.get(i).getName() + "    email:"+arrBlindUser.get(i).getEmail());
                }
                Intent intent=new Intent(getApplicationContext(),dashboard2.class);
                startActivity(intent);
            }
        });

}}

