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
 * Use the {@link FragmentVideo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentVideo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerVideo;
    ArrayList<VideoVo> listaVideo;

    public FragmentVideo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentVideo.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentVideo newInstance(String param1, String param2) {
        FragmentVideo fragment = new FragmentVideo();
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
        View vista=inflater.inflate(R.layout.fragment_video, container, false);

        listaVideo=new ArrayList<>();
        recyclerVideo= (RecyclerView) vista.findViewById(R.id.videolist);
        recyclerVideo.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        VideoAdapter adapter=new VideoAdapter(listaVideo);
        recyclerVideo.setAdapter(adapter);

        return vista;
    }

    private void llenarLista() {
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));
        listaVideo.add(new VideoVo("video no found",
                "kha",
                R.drawable.avv,
                R.drawable.video,
                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3));



    }


}