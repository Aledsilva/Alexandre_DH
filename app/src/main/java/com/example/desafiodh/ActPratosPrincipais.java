package com.example.desafiodh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ActPratosPrincipais extends AppCompatActivity {

    private RecyclerView recyclerPratos;
    private List<Prato> pratosCadapio = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pratos_principais);

        recyclerPratos = findViewById(R.id.recyclerPratos);

        //Define layout
        //RecyclerView.LayoutManager layoutMan = new LinearLayoutManager(this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPratos.setLayoutManager( layoutManager );

        //define adapter
        prepararPratos();
        PratosAdapter adapterPratos = new PratosAdapter(pratosCadapio);
        recyclerPratos.setAdapter( adapterPratos );
    }

    public void prepararPratos(){

        this.pratosCadapio.add( new Prato(R.drawable.tony_romas, "Filé"));

    }
}
