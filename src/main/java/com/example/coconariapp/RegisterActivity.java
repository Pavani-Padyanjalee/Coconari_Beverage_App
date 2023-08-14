package com.example.coconariapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText username, password, conpassword, email;
    Button signup;
    DBHelper dbHelper;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.inputUsername);
        email = (EditText) findViewById(R.id.inputEmail);
        password = (EditText) findViewById(R.id.inputPasword);
        conpassword = (EditText) findViewById(R.id.inputConPassword);

        signup = (Button) findViewById(R.id.btnRegister);
        dbHelper = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = conpassword.getText().toString();
                String em = email.getText().toString();


                if(user.equals("")||pass.equals("")||repass.equals("")||em.equals(""))
                    Toast.makeText(getApplicationContext(), "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        boolean checkEmail = dbHelper.checkEmail(em);
                        if(!checkEmail){
                            boolean insert = dbHelper.insertData(user, pass, em);
                            if(insert){
                                Toast.makeText(getApplicationContext(), "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),OrderActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                            }else{
                                Toast.makeText(getApplicationContext(), "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                } }
        });

        TextView btn=findViewById(R.id.alreadyReg);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imgBtnHome);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(RegisterActivity.this,"Back to Dashboard",Toast.LENGTH_SHORT).show();
            }
        });
    }
}


