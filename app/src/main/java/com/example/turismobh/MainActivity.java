
package com.example.turismobh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editNome;
    Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editNome);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {

            // 🔹 Salva o nome digitado
            String nome = editNome.getText().toString();

            SharedPreferences prefs = getSharedPreferences("app", MODE_PRIVATE);
            prefs.edit().putString("nome", nome).apply();

            // 🔹 Abre a HomeActivity
            startActivity(new Intent(this, HomeActivity.class));
        });
    }
}
