package com.example.coconariapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    private Button button;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        button = (Button) findViewById(R.id.btnSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this,AfterOrderActivity.class);
                startActivity(intent);
                Toast.makeText(OrderActivity.this, "Order Successfull", Toast.LENGTH_LONG).show();

            }
        });

        imageButton = (ImageButton) findViewById(R.id.imgBtnHome);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this,DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(OrderActivity.this,"Back to Dashboard",Toast.LENGTH_SHORT).show();
            }
        });

    }

}