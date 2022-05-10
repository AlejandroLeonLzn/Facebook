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
 * Use the {@link FragmentCasita#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCasita extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerCasita;
    ArrayList<CasitaVo> listaCasita;

    public FragmentCasita() {
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
    public static FragmentCasita newInstance(String param1, String param2) {
        FragmentCasita fragment = new FragmentCasita();
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
        View vista=inflater.inflate(R.layout.fragment_casita, container, false);

        listaCasita=new ArrayList<>();
        recyclerCasita= (RecyclerView) vista.findViewById(R.id.casitalist);
        recyclerCasita.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        CasitaAdapter adapter=new CasitaAdapter(listaCasita);
        recyclerCasita.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listaCasita.add(new CasitaVo("Humor Informatico",
                "kha",
                R.drawable.avt1,
                R.drawable.pb1,
                R.drawable.l1,
                R.drawable.l2a,
                R.drawable.l3));

        listaCasita.add(new CasitaVo("Pato Millonario",
                "Tipico error de no saber trabajar en equipo :c",
                R.drawable.avt2,
                R.drawable.pb2,
                R.drawable.l1a,
                R.drawable.l2,
                R.drawable.l3));
        listaCasita.add(new CasitaVo("Homero Sanchez MX",
                "pollos el brayan",
                R.drawable.avt3,
                R.drawable.pb3,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3a));
        listaCasita.add(new CasitaVo("BlogDigital.es",
                "😨😨😨😨",
                R.drawable.avt4,
                R.drawable.pb4,
                R.drawable.l1,
                R.drawable.l2a,
                R.drawable.l3));
        listaCasita.add(new CasitaVo("Team Rocket",
                "Best custom t-shirts for Pokemon Lovers",
                R.drawable.avt5,
                R.drawable.pb5,
                R.drawable.l1a,
                R.drawable.l2,
                R.drawable.l3));

        listaCasita.add(new CasitaVo("C O M I C S",
                "😎",
                R.drawable.avt6,
                R.drawable.pb6,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3a));
        listaCasita.add(new CasitaVo("Dr.Goku",
                "si estaba bueno",
                R.drawable.avt7,
                R.drawable.pb7,
                R.drawable.l1,
                R.drawable.l2a,
                R.drawable.l3));
        listaCasita.add(new CasitaVo("El geek TWD",
                "Nuevo vistazo a Elizabeth Olsen como Bruja Escarlata en Doctor Strange In The Multiverse Of Madness. 🥰🥰🥰🥰",
                R.drawable.avt8,
                R.drawable.pb8,
                R.drawable.l1a,
                R.drawable.l2,
                R.drawable.l3));

    }


}