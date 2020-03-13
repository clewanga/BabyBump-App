package com.example.babybump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView homeTextView;
    Button medicalButton;
    Button dateButton;
    Button preparationButton;
    Button messageButton;
    Button shoppingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        homeTextView = findViewById(R.id.home);
        medicalButton = findViewById(R.id.medicalButton);
        preparationButton = findViewById(R.id.preparationButton);
        dateButton = findViewById(R.id.dueButton);
        shoppingButton = findViewById(R.id.shoppingButton);
        messageButton =findViewById(R.id.smsButton);


        medicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent medical = new Intent(DisplayActivity.this,medicalActivity.class);
                startActivity(medical);
            }
        });


        preparationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent preparation = new Intent(DisplayActivity.this,preparationActivity.class);
                startActivity(preparation);
            }
        });
    }

}
