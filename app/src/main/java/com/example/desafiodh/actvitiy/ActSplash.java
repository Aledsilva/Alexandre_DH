package com.example.desafiodh.actvitiy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.desafiodh.actvitiy.ActLogin;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, ActLogin.class);
        startActivity( intent );
        finish();
    }
}
