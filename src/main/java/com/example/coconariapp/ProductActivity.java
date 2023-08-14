package com.example.coconariapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ProductActivity extends AppCompatActivity {

    ImageButton imageButton;

    CardView card1, card2, card3, card4, card5, card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);
        card5 = findViewById(R.id.card5);
        card6 = findViewById(R.id.card6);

        CardView[] cards = {card1, card2, card3, card4, card5, card6};

        for (CardView cardView : cards) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ProductActivity.this,OrderActivity.class);
                    startActivity(intent);
                    Toast.makeText(ProductActivity.this, "Let's place an Order", Toast.LENGTH_LONG).show();
                }
            });

        }

        imageButton = (ImageButton) findViewById(R.id.imgBtnHome);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductActivity.this,DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(ProductActivity.this,"Back to Dashboard",Toast.LENGTH_SHORT).show();
            }
        });


    }
}