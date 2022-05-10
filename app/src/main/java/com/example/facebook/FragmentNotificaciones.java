package com.example.facebook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentNotificaciones#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentNotificaciones extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclernoti;
    ArrayList<notiVo> listanoti;

    public FragmentNotificaciones() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCasita.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentNotificaciones newInstance(String param1, String param2) {
        FragmentNotificaciones fragment = new FragmentNotificaciones();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_notificaciones, container, false);

        listanoti=new ArrayList<>();
        recyclernoti= (RecyclerView) vista.findViewById(R.id.notilist);
        recyclernoti.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        notiAdapter adapter=new notiAdapter(listanoti);
        recyclernoti.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listanoti.add(new notiVo("Humor Informatico",
                "publico una foto nueva",
                R.drawable.avt1));

        listanoti.add(new notiVo("Millonario",
                "publico un video nuevo",
                R.drawable.avt2));
        listanoti.add(new notiVo("Homero Sanchez MX",
                "actualizo su imagen de portada",
                R.drawable.avt3));
        listanoti.add(new notiVo("BlogDigital.es",
                "actualizo su imagen de portada",
                R.drawable.avt4));
        listanoti.add(new notiVo("TeamRocket",
                "publico un articulo nuevo en venta",
                R.drawable.avt5));
        listanoti.add(new notiVo("C O M I C S",
                "Te invita a Realizar un encuesta nueva",
                R.drawable.avt6));
        listanoti.add(new notiVo("Millonario",
                "actualizo su imagen de portada",
                R.drawable.avt2));
        listanoti.add(new notiVo("Dr.Goku",
                "actualizo su imagen de Perfil",
                R.drawable.avt7));
        listanoti.add(new notiVo("El geek TWD",
                "actualizo algo en su pagina",
                R.drawable.avt8));
        listanoti.add(new notiVo("Millonario",
                "te invito a jugar un juego de granjas",
                R.drawable.avt2));
        listanoti.add(new notiVo("Humor Informatico",
                "actualizo sus normas de privacidad",
                R.drawable.avt1));
        listanoti.add(new notiVo("Team Rocket",
                "notificacion de pedido",
                R.drawable.avt5));
        listanoti.add(new notiVo("C O M I C S",
                "ve lo mejor del año",
                R.drawable.avt6));

    }


}