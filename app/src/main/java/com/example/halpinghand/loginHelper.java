package com.example.halpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.TextView;

public class loginHelper extends AppCompatActivity {
    public TextView textView, textView2;
    public Button button;
=======
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginHelper extends AppCompatActivity {
    public TextView textView, textView2;
    public Button button;
    public EditText TextEmailAddress, TextPassword;
>>>>>>> b5e334c (validation of login)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_helper);
        textView = (TextView) findViewById(R.id.textView5);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),registrationh.class);
                startActivity(intent);
            }
        });
        textView2 = (TextView) findViewById(R.id.textView4);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),forgotpass.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button3);
<<<<<<< HEAD
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),dashboard1.class);
                startActivity(intent);
=======
        TextEmailAddress =(EditText) findViewById(R.id.editTextTextEmailAddress);
        TextPassword =(EditText) findViewById(R.id.editTextTextPassword);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","");
                    PreparedStatement stmt=con.prepareStatement("SELECT * FROM CUSTOMER WHERE Email ID= ? AND Password= ?");
                    stmt.setString(1, String.valueOf(TextEmailAddress));
                    stmt.setString(2, String.valueOf(TextPassword));
                    if (TextEmailAddress.equals("Email ID") && TextPassword.equals("Password")){
                        Intent intent=new Intent(getApplicationContext(),dashboard1.class);
                        startActivity(intent);
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
>>>>>>> b5e334c (validation of login)
            }
        });

    }
}