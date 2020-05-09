package com.example.desafiodh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class ActLogin extends AppCompatActivity {

    private Button btnRegisterLogin, btnLogin;
    private TextInputLayout loginEmail, loginPass;
    private EditText editEmail, editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_login);

        loginEmail = findViewById(R.id.loginEmail);
        loginPass = findViewById(R.id.loginPass);

        editEmail = findViewById(R.id.editEmail);
        editPass = findViewById(R.id.editPass);

        btnRegisterLogin =findViewById(R.id.btnRegisterLogin);
        btnLogin = findViewById(R.id.btnLogin);


        btnRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActRegister.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });

    }

    private void logar () {
        boolean logaSim = true;
        if (editEmail.getText().toString().isEmpty()){
            loginEmail.setError("Email é obrigatório");
            logaSim = false;
        } else {
            loginEmail.setErrorEnabled(false);
        }

        if (editPass.getText().toString().trim().length() <8) {
            loginPass.setError("Minimo 8 caracteres");
            logaSim = false;
        } else {
            loginPass.setErrorEnabled(false);
        }
        if (logaSim){
            Intent intent = new Intent(this, ActHome.class);
            startActivity(intent);
        }

    }

}

