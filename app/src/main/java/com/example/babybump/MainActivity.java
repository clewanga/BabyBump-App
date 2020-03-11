package com.example.babybump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextPassword;
    Button signButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (EditText)findViewById(R.id.loginEmail);
        editTextPassword = (EditText)findViewById(R.id.loginPassword);
        signButton = (Button)findViewById(R.id.signButton);

        signButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button = new Intent(MainActivity.this,DisplayActivity.class);
                startActivity(button);
            }
        });
    }

}
