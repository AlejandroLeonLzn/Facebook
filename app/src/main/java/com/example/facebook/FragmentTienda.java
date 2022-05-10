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
 * Use the {@link FragmentTienda#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTienda extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclertienda;
    ArrayList<TiendaVo> listatienda;

    public FragmentTienda() {
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
    public static FragmentTienda newInstance(String param1, String param2) {
        FragmentTienda fragment = new FragmentTienda();
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
        View vista=inflater.inflate(R.layout.fragment_tienda, container, false);

        listatienda=new ArrayList<>();
        recyclertienda= (RecyclerView) vista.findViewById(R.id.notilist);
        recyclertienda.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        TiendaAdapter adapter=new TiendaAdapter(listatienda);
        recyclertienda.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listatienda.add(new TiendaVo("$1,500",
                "iphone 7 plus",
                "Cuauthemoc, CDMX",
                R.drawable.t1));

        listatienda.add(new TiendaVo("$12,000/mes",
                "Departamentos / Loft´s Amueblados en Renta (servicios Incluidos) Sobre AV. Comonfort Entre Tollocan",
                "Toluca Lerdo, EDO.MEX",
                R.drawable.t2));

        listatienda.add(new TiendaVo("$2,200",
                "Laptop HP 14",
                "Iztacalco CDMX",
                R.drawable.t3));

        listatienda.add(new TiendaVo("$2,000",
                "Mesa de Pacman",
                "ecatepec de morelos, EDO.MEX",
                R.drawable.t4));

    }


}