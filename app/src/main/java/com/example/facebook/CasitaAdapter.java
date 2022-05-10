package com.example.facebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


/**
 * Created by CHENAO on 13/07/2017.
 */

public class CasitaAdapter extends RecyclerView.Adapter<CasitaAdapter.CasitaViewHolder>{

    ArrayList<CasitaVo> listaCasita;

    public CasitaAdapter(ArrayList<CasitaVo> listaCasita) {
        this.listaCasita=listaCasita;
    }

    @Override
    public CasitaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_casita,null,false);
        return new CasitaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CasitaViewHolder holder, int position) {
        holder.txtNombre.setText(listaCasita.get(position).getNombre());
        holder.txtInformacion.setText(listaCasita.get(position).getInfo());
        holder.foto.setImageResource(listaCasita.get(position).getAvatar());
        holder.foto2.setImageResource(listaCasita.get(position).getPublicacion());
        holder.lbi1.setImageResource(listaCasita.get(position).getLbi1());
        holder.lbi2.setImageResource(listaCasita.get(position).getLbi2());
        holder.lbi3.setImageResource(listaCasita.get(position).getLbi3());
    }

    @Override
    public int getItemCount() {
        return listaCasita.size();
    }

    public class CasitaViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtInformacion;
        ImageView foto,foto2;
        ImageButton lbi1, lbi2, lbi3;

        public CasitaViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.precio);
            txtInformacion= (TextView) itemView.findViewById(R.id.descripcion);
            foto= (ImageView) itemView.findViewById(R.id.articulo);
            foto2= (ImageView) itemView.findViewById(R.id.Publicacion);
            lbi1= (ImageButton) itemView.findViewById(R.id.lbi1);
            lbi2= (ImageButton) itemView.findViewById(R.id.lbi2);
            lbi3= (ImageButton) itemView.findViewById(R.id.lbi3);
        }
    }
}