package com.example.facebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


/**
 * Created by CHENAO on 13/07/2017.
 */

public class notiAdapter extends RecyclerView.Adapter<notiAdapter.notiViewHolder>{

    ArrayList<notiVo> listanoti;

    public notiAdapter(ArrayList<notiVo> listanoti) {
        this.listanoti=listanoti;
    }

    @Override
    public notiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noti,null,false);
        return new notiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(notiViewHolder holder, int position) {
        holder.txtNombre.setText(listanoti.get(position).getNombre());
        holder.txtInformacion.setText(listanoti.get(position).getInfo());
        holder.foto.setImageResource(listanoti.get(position).getAvatar());
    }

    @Override
    public int getItemCount() {
        return listanoti.size();
    }

    public class notiViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtInformacion;
        ImageView foto;

        public notiViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.precio);
            txtInformacion= (TextView) itemView.findViewById(R.id.descripcion);
            foto= (ImageView) itemView.findViewById(R.id.articulo);
        }
    }
}