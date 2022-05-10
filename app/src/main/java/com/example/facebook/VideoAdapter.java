package com.example.facebook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


/**
 * Created by CHENAO on 13/07/2017.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder>{

    ArrayList<VideoVo> listaVideo;

    public VideoAdapter(ArrayList<VideoVo> listaVideo) {
        this.listaVideo=listaVideo;
    }

    @Override
    public VideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video,null,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VideoViewHolder holder, int position) {
        holder.txtNombre.setText(listaVideo.get(position).getNombre());
        holder.txtInformacion.setText(listaVideo.get(position).getInfo());
        holder.foto.setImageResource(listaVideo.get(position).getAvatar());
        holder.video.setImageResource(listaVideo.get(position).getPublicacion());
        holder.lbi1.setImageResource(listaVideo.get(position).getLbi1());
        holder.lbi2.setImageResource(listaVideo.get(position).getLbi2());
        holder.lbi3.setImageResource(listaVideo.get(position).getLbi3());
    }

    @Override
    public int getItemCount() {
        return listaVideo.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {
        TextView txtNombre,txtInformacion;
        ImageView foto, video;
        ImageButton lbi1, lbi2, lbi3;

        public VideoViewHolder(View itemView) {
            super(itemView);
            txtNombre= (TextView) itemView.findViewById(R.id.precio);
            txtInformacion= (TextView) itemView.findViewById(R.id.descripcion);
            foto= (ImageView) itemView.findViewById(R.id.articulo);
            video= (ImageView) itemView.findViewById(R.id.Publicacion);
            lbi1= (ImageButton) itemView.findViewById(R.id.lbi1);
            lbi2= (ImageButton) itemView.findViewById(R.id.lbi2);
            lbi3= (ImageButton) itemView.findViewById(R.id.lbi3);
        }
    }
}