package com.example.turismobh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PontoAdapter extends RecyclerView.Adapter<PontoAdapter.ViewHolder> {

    private List<PontoTuristico> lista;

    public PontoAdapter(List<PontoTuristico> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_ponto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PontoTuristico ponto = lista.get(position);

        holder.txtNome.setText(ponto.getNome());
        holder.txtDescricao.setText(ponto.getDescricao());
    }

    @Override
    public int getItemCount() {
        return lista != null ? lista.size() : 0;
    }

    public void atualizarLista(List<PontoTuristico> novaLista) {
        this.lista = novaLista;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNome, txtDescricao;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);
        }
    }
}