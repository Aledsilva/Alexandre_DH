package com.example.desafiodh.actvitiy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.desafiodh.adapter.PratosAdapter;
import com.example.desafiodh.R;
import com.example.desafiodh.modelo.Prato;

import java.util.ArrayList;
import java.util.List;

public class ActPratosPrincipais extends AppCompatActivity {

    private RecyclerView recyclerPratos;
    private List<Prato> pratosCadapio = new ArrayList<>();

    ImageView imageVoltarRestaurantes;
    ImageView imagePrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pratos_principais);


        recyclerPratos = findViewById(R.id.recyclerPratos);

        //Define layout
        //RecyclerView.LayoutManager layoutMan = new LinearLayoutManager(this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPratos.setLayoutManager(layoutManager);

        //define adapter
        prepararPratos();
        PratosAdapter adapterPratos = new PratosAdapter(pratosCadapio);
        recyclerPratos.setAdapter(adapterPratos);



        imageVoltarRestaurantes = findViewById(R.id.imageVoltarRestaurantes);
        imageVoltarRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public void prepararPratos() {

        pratosCadapio.add(new Prato(R.drawable.prato_master, "Filé miúdo"));
        pratosCadapio.add(new Prato(R.drawable.dogao_osasco, "Dogão de Osasco"));
        pratosCadapio.add(new Prato(R.drawable.yakisoba_veneno, "Yakisoba veneno do China"));
        pratosCadapio.add(new Prato(R.drawable.pastel_gulliver, "Pastel do Gulliver"));
        pratosCadapio.add(new Prato(R.drawable.pizza_augusta_10reais, "Pizza R.Augusta/ Praça Roosevelt"));
        pratosCadapio.add(new Prato(R.drawable.mini_churro_minus, "Porção Churros-Churruminos"));

    }
}
