package com.example.desafiodh.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafiodh.OnItemClickListener;
import com.example.desafiodh.R;
import com.example.desafiodh.modelo.Prato;

import java.util.List;

public class PratosAdapter extends RecyclerView.Adapter<PratosAdapter.PratosViewHolder> {

    private List<Prato> pratosCadapio;

    public PratosAdapter(List<Prato> listaPratos) {
        this.pratosCadapio = listaPratos;
    }

    @NonNull
    @Override
    public PratosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View pratoLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.act_pratos_detalhe, parent, false);

        return new PratosViewHolder(pratoLista);
    }

    @Override
    public void onBindViewHolder(@NonNull PratosViewHolder holder, int position) {

        Prato pratoes = pratosCadapio.get( position);

        holder.imageClicada.setImageResource( pratoes.getImagem());
        holder.nomeRestaurante.setText( pratoes.getPrato());

    }

    @Override
    public int getItemCount() {
        return pratosCadapio.size();
    }

    public class PratosViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageClicada;
        private TextView nomeRestaurante;

        public PratosViewHolder(@NonNull View itemView) {
            super(itemView);

            imageClicada = itemView.findViewById(R.id.imagePrato);
            nomeRestaurante = itemView.findViewById(R.id.textPrato);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Fui clicado!",Toast.LENGTH_LONG).show();
                }
            });
        }

    }
}
