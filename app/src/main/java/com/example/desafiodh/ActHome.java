package com.example.desafiodh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ActHome extends AppCompatActivity {

    private RecyclerView recyclerRest;
    private List<Restaurante> restaurantes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_home);
        recyclerRest = findViewById(R.id.recyclerRest);

        //define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerRest.setLayoutManager( layoutManager );

        recyclerRest.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        //define adapter
        prepararRestaurantes();
        ResAdapter adapter = new ResAdapter(restaurantes);
        recyclerRest.setAdapter( adapter );

    }

    public void prepararRestaurantes() {

        this.restaurantes.add (new Restaurante(R.drawable.tony_romas,"Tony Roma's","Av. Lavandisca, 717 - Indianópolis, São Paulo", "Fecha às 22:00"));

        this.restaurantes.add (new Restaurante(R.drawable.ayoama,"Aoyama - Moema","Alameda dos Arapanés, 532 - Moema", "Fecha às 00:00"));

        this.restaurantes.add (new Restaurante(R.drawable.outback,"Outback - Moema","Av. Moaci, 187, 187 - Moema, São Paulo", "Fecha às 00:00"));

        this.restaurantes.add (new Restaurante(R.drawable.sim_sim_sim,"Sí Señor!","Alameda Jauaperi, 626 - Moema", "Fecha às 01:00"));

    }
}
