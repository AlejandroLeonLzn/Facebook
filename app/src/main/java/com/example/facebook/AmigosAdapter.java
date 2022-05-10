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

public class AmigosAdapter extends RecyclerView.Adapter<AmigosAdapter.amigosViewHolder>{

    ArrayList<AmigosVo> listaamigos;

    public AmigosAdapter(ArrayList<AmigosVo> listaamigos) {
        this.listaamigos=listaamigos;
    }

    @Override
    public amigosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_amigos,null,false);
        return new amigosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(amigosViewHolder holder, int position) {
        holder.txtNombre.setText(listaamigos.get(position).getNombre());
        holder.foto.setImageResource(listaamigos.get(position).getAvatar());
        holder.foto2.setImageResource(listaamigos.get(position).getConfi());
    }

    @Override
    public int getItemCount() {
        return listaamigos.size();
    }

    public class amigosViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre;
        ImageView foto, foto2;

        public amigosViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.nombre);
            foto= (ImageView) itemView.findViewById(R.id.avatar);
            foto2= (ImageView) itemView.findViewById(R.id.confirmar);
        }
    }
}