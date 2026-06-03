package com.example.turismobh;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class PontoViewHolder extends RecyclerView.ViewHolder {

    TextView txtNome;
    TextView txtDescricao;

    public PontoViewHolder(View itemView) {
        super(itemView);

        txtNome = itemView.findViewById(R.id.txtNome);
        txtDescricao = itemView.findViewById(R.id.txtDescricao);
    }
}