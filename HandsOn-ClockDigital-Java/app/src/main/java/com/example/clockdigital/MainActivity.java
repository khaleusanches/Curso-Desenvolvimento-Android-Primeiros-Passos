package com.example.clockdigital;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.TextClock;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtExibirHoraUpdate;
    private TextClock txtHoraAtual, txtHora24PM;
    private Button btnAtualizarHoraAtual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inicializarComponentes();
        capturarHora();
    }

    private void capturarHora() {
        btnAtualizarHoraAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExibirHoraUpdate.setText("Hora: "+txtHora24PM.getText());
            }
        });
    }

    private void inicializarComponentes() {
        txtExibirHoraUpdate = findViewById(R.id.txtExibirHoraUpdate);
        txtHoraAtual = findViewById(R.id.txtHoraAtual);
        txtHora24PM = findViewById(R.id.txtHora24PM);
        btnAtualizarHoraAtual = findViewById(R.id.btnAtualizarHora);
    }
}