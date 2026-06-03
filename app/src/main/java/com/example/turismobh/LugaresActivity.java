package com.example.turismobh;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LugaresActivity extends AppCompatActivity {

    Button btnHome;
    Button btnPontos;
    Button btnFavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        btnHome = findViewById(R.id.btnHome);
        btnPontos = findViewById(R.id.btnPontos);
        btnFavoritos = findViewById(R.id.btnFavoritos);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, new HomeFragment())
                .commit();

        btnHome.setOnClickListener(v ->
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, new HomeFragment())
                        .commit());

        btnPontos.setOnClickListener(v ->
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, new PontosTuristicosFragment())
                        .commit());

        btnFavoritos.setOnClickListener(v ->
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, new FavoritosFragment())
                        .commit());
    }
}