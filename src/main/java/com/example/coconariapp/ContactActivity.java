package com.example.coconariapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        imageButton = (ImageButton) findViewById(R.id.imgBtnHome);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactActivity.this,DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(ContactActivity.this,"Back to Dashboard",Toast.LENGTH_SHORT).show();
            }
        });
    }
}