package com.example.turismobh;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class ConfigActivity extends AppCompatActivity {

    CheckBox checkNotificacoes;
    RadioGroup radioTema;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        checkNotificacoes = findViewById(R.id.checkNotificacoes);
        radioTema = findViewById(R.id.radioTema);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences("app", MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();

            editor.putBoolean("notificacoes", checkNotificacoes.isChecked());

            int selectedId = radioTema.getCheckedRadioButtonId();
            if (selectedId != -1) {
                RadioButton radioSelecionado = findViewById(selectedId);
                editor.putString("tema", radioSelecionado.getText().toString());
            }

            editor.apply();
        });
    }
}