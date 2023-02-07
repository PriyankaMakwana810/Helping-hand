package com.example.halpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Rfc822Token;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;*/

public class registrationh extends AppCompatActivity {
    public Button button;
    private EditText name,email,contact,pass,city,language,qualification;
    /*FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationh);
        name = (EditText) findViewById(R.id.editTextTextPersonName2);
        email = (EditText) findViewById(R.id.editTextTextPersonName3);
        contact=(EditText) findViewById(R.id.editTextPhone);
        pass = (EditText) findViewById(R.id.editTextTextPassword2);
        city=(EditText) findViewById(R.id.editTextTextPersonName4);
        language=(EditText) findViewById(R.id.editTextTextPersonName5);
        qualification=(EditText) findViewById(R.id.editTextTextPersonName6);
//        firebaseDatabase=firebaseDatabase.getInstance();
        button=(Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=name.getText().toString();
                String e=email.getText().toString();
                String c=contact.getText().toString();
                String p=pass.getText().toString();
            }
        });
    }
}