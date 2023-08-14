package com.example.coconariapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.cardview.widget.CardView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.card1:
                i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;

            case R.id.card2:
                i = new Intent(this, ProductActivity.class);
                startActivity(i);
                break;

            case R.id.card3:
                i = new Intent(this, AboutActivity.class);
                startActivity(i);
                break;

            case R.id.card4:
                i = new Intent(this, ContactActivity.class);
                startActivity(i);
                break;

        }
    }
}