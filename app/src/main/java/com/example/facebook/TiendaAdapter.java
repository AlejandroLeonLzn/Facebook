package com.example.facebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class TiendaAdapter extends RecyclerView.Adapter<TiendaAdapter.tiendaViewHolder>{

    ArrayList<TiendaVo> listatienda;

    public TiendaAdapter(ArrayList<TiendaVo> listatienda) {
        this.listatienda=listatienda;
    }

    @Override
    public TiendaAdapter.tiendaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tienda,null,false);
        return new TiendaAdapter.tiendaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TiendaAdapter.tiendaViewHolder holder, int position) {
        holder.txtNombre.setText(listatienda.get(position).getNombre());
        holder.txtInformacion.setText(listatienda.get(position).getInfo());
        holder.foto.setImageResource(listatienda.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return listatienda.size();
    }

    public class tiendaViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtInformacion;
        ImageView foto;

        public tiendaViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.Pagina);
            txtInformacion= (TextView) itemView.findViewById(R.id.descripcion);
            foto= (ImageView) itemView.findViewById(R.id.avatar);
        }
    }
}
