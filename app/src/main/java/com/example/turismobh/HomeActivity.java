package com.example.turismobh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtNome;
    Button btnLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txtNome = findViewById(R.id.txtNome);
        btnLugares = findViewById(R.id.btnLugares);

        SharedPreferences prefs = getSharedPreferences("app", MODE_PRIVATE);
        String nome = prefs.getString("nome", "Usuário");

        txtNome.setText("Bem-vindo, " + nome + "!");

        btnLugares.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, LugaresActivity.class);
            startActivity(intent);
        });
    }
}