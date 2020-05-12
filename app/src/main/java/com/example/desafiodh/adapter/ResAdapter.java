package com.example.desafiodh.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.desafiodh.OnItemClickListener;
import com.example.desafiodh.R;
import com.example.desafiodh.modelo.Restaurante;

import java.util.List;

public class ResAdapter extends RecyclerView.Adapter<ResAdapter.MyViewHolder> {

    private List<Restaurante> restaurantes;
    private OnItemClickListener onItemClickListener;

    public ResAdapter(List<Restaurante> listaRes ) {
        this.restaurantes = listaRes;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.act_restaurantes_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Restaurante restaurante = restaurantes.get( position );
        holder.imageRes.setImageResource(restaurante.getImagem());
        holder.textNome.setText(restaurante.getNome());
        holder.textEndereco.setText(restaurante.getEndereco());
        holder.textHorario.setText(restaurante.getHorario());


        //holder.itemView.

    }

    @Override
    public int getItemCount() {
        return restaurantes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageRes;
        private TextView textNome;
        private TextView textEndereco;
        private TextView textHorario;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageRes = itemView.findViewById(R.id.imageRes);
            textNome = itemView.findViewById(R.id.textNome);
            textEndereco = itemView.findViewById(R.id.textEndereco);
            textHorario = itemView.findViewById(R.id.textHorario);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onItemClick();
                }
            });
        }
    }

}