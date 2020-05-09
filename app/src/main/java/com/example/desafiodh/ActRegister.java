package com.example.desafiodh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class ActRegister extends AppCompatActivity {

    private Button btnRegister;
    private ImageView imageVoltar;

    private TextInputLayout regName, regEmail, regPass, regRepeatPass;
    private EditText editRegName, editRegEmail, editRegPass, editRepeatPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_register);

        regName = findViewById(R.id.regName);
        regEmail = findViewById(R.id.regEmail);
        regPass = findViewById(R.id.regPass);
        regRepeatPass = findViewById(R.id.regRepeatPass);

        editRegName = findViewById(R.id.editRegName);
        editRegEmail = findViewById(R.id.editRegEmail);
        editRegPass = findViewById(R.id.editRegPass);
        editRepeatPass = findViewById(R.id.editRepeatPass);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                registraSim();
            }
        });
    }

    private void registraSim() {
        boolean taCerto = true;
        if (editRegName.getText().toString().isEmpty()) {
            regName.setError("Escreva seu nome");
            taCerto = false;
        } else {
            regName.setErrorEnabled(false);
        }

        if (editRegEmail.getText().toString().isEmpty()) {
            regEmail.setError("Preencha com o seu Email");
            taCerto = false;
        } else {
            regEmail.setErrorEnabled(false);
        }

        if (editRegPass.getText().toString().trim().length() < 8) {
            regPass.setError("Senha de no minimo 8 caracteres");
            taCerto = false;
        } else {
            regPass.setErrorEnabled(false);
        }

        if (editRepeatPass.getText().toString().trim().length() < 8) {
            regRepeatPass.setError("Senha de no minimo 8 caracteres igual");
            taCerto = false;
        } else {
            regRepeatPass.setErrorEnabled(false);

            if (taCerto) {
                Intent intent = new Intent(this, ActHome.class);
                startActivity(intent);
            }
        }
    }
}
