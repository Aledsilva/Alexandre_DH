package com.example.desafiodh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class ActLogin extends AppCompatActivity {

    private Button btnRegisterLogin;
    private Button btnLogin;
    private TextInputLayout loginEmail;
    private TextInputLayout loginPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_login);


        btnLogin = findViewById(R.id.btnLogin);
        loginEmail = findViewById(R.id.loginEmail);
        loginPass = findViewById(R.id.loginPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ActHome.class);
                startActivity(intent);
            }
        });


        btnRegisterLogin = findViewById(R.id.btnRegisterLogin);
        btnRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ActRegister.class);
                startActivity(intent);
            }
        });
    }
}

