package com.example.halpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginBstudent extends AppCompatActivity {
    public TextView textView, textView2;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_bstudent);
        textView = (TextView) findViewById(R.id.textView18);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),registrationh.class);
                startActivity(intent);
            }
        });
        textView2 = (TextView) findViewById(R.id.textView19);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),forgotpass.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),dashboard2.class);
                startActivity(intent);
            }
        });

    }
}