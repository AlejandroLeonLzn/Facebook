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
 * Use the {@link FragmentAmigos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentAmigos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recycleramigos;
    ArrayList<AmigosVo> listaamigos;

    public FragmentAmigos() {
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
    public static FragmentAmigos newInstance(String param1, String param2) {
        FragmentAmigos fragment = new FragmentAmigos();
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
        View vista=inflater.inflate(R.layout.fragment_amigos, container, false);

        listaamigos=new ArrayList<>();
        recycleramigos= (RecyclerView) vista.findViewById(R.id.amigosist);
        recycleramigos.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        AmigosAdapter adapter=new AmigosAdapter(listaamigos);
        recycleramigos.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listaamigos.add(new AmigosVo("Humor Informatico",
                R.drawable.avt1,
                R.drawable.confielim));

        listaamigos.add(new AmigosVo("Millonario",
                R.drawable.avt2,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("Homero",
                R.drawable.avt3,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("Blog Digital",
                R.drawable.avt4,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("Team Rocket",
                R.drawable.avt5,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("C O M I C S",
                R.drawable.avt6,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("Dr Goku",
                R.drawable.avt7,
                R.drawable.confielim));
        listaamigos.add(new AmigosVo("El Geek",
                R.drawable.avt8,
                R.drawable.confielim));

    }


}