package com.example.coconariapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AfterOrderActivity extends AppCompatActivity {

    private Button button;

    Button exitbtn;

    ImageButton imageButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_order);

        button=(Button)findViewById(R.id.btnShop);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AfterOrderActivity.this,ProductActivity.class);
                startActivity(intent);
                Toast.makeText(AfterOrderActivity.this, "Let's Shop!!!", Toast.LENGTH_LONG).show();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.imgBtnHome);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AfterOrderActivity.this,DashboardActivity.class);
                startActivity(intent);
                Toast.makeText(AfterOrderActivity.this,"Back to Dashboard",Toast.LENGTH_SHORT).show();
            }
        });

        exitbtn = (Button) findViewById(R.id.btnExit);
        exitbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

//                new AlertDialog.Builder(this)
//                        .setMessage("Are you sure to exit?")
//                        .setCancelable(false)
//                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                finish();
//                            }
//                        })
//                        .setNegativeButton("No",null)
//                        .show();

            }
        });

    }
}