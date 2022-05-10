package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton ib1, ib2, ib3, ib4, ib5, ib6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new FragmentCasita())
                .commit();

        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.lbi2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
    }
    //metodos para reemplazar fragments
    public void mostrarCa(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentCasita()).commit();
        ib1.setImageResource(R.drawable.a1);
        ib2.setImageResource(R.drawable.b);
        ib3.setImageResource(R.drawable.c);
        ib4.setImageResource(R.drawable.g);
        ib5.setImageResource(R.drawable.e);
        ib6.setImageResource(R.drawable.f);
    }
    public void mostrarVi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentVideo()).commit();
        ib1.setImageResource(R.drawable.a);
        ib2.setImageResource(R.drawable.b1);
        ib3.setImageResource(R.drawable.c);
        ib4.setImageResource(R.drawable.g);
        ib5.setImageResource(R.drawable.e);
        ib6.setImageResource(R.drawable.f);
    }
    public void mostrarTi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentTienda()).commit();
        ib1.setImageResource(R.drawable.a);
        ib2.setImageResource(R.drawable.b);
        ib3.setImageResource(R.drawable.c1);
        ib4.setImageResource(R.drawable.g);
        ib5.setImageResource(R.drawable.e);
        ib6.setImageResource(R.drawable.f);
    }
    public void mostrarAm(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentAmigos()).commit();
        ib1.setImageResource(R.drawable.a);
        ib2.setImageResource(R.drawable.b);
        ib3.setImageResource(R.drawable.c);
        ib4.setImageResource(R.drawable.g1);
        ib5.setImageResource(R.drawable.e);
        ib6.setImageResource(R.drawable.f);
    }
    public void mostrarCm(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentNotificaciones()).commit();
        ib1.setImageResource(R.drawable.a);
        ib2.setImageResource(R.drawable.b);
        ib3.setImageResource(R.drawable.c);
        ib4.setImageResource(R.drawable.g);
        ib5.setImageResource(R.drawable.e1);
        ib6.setImageResource(R.drawable.f);
    }
    public void mostrarMe(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new FragmentMenu()).commit();
        ib1.setImageResource(R.drawable.a);
        ib2.setImageResource(R.drawable.b);
        ib3.setImageResource(R.drawable.c);
        ib4.setImageResource(R.drawable.g);
        ib5.setImageResource(R.drawable.e);
        ib6.setImageResource(R.drawable.f1);
    }
}