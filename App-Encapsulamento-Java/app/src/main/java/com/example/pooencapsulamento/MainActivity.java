package com.example.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtTituloLivro;
    TextView txtAutor;
    TextView txtEditora;
    TextView txtPaginas;
    TextView txtLocalizacao;
    Livro objLivro = new Livro();
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
        criarObjetos();
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        txtTituloLivro = findViewById(R.id.txtTituloLivro);
        txtAutor = findViewById(R.id.txtAutor);
        txtEditora = findViewById(R.id.txtEditora);
        txtPaginas = findViewById(R.id.txtPaginas);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);

        txtTituloLivro.setText(objLivro.getTitulo());
        txtAutor.setText(objLivro.getAutor());
        txtEditora.setText(objLivro.getEditora());
        txtPaginas.setText(objLivro.getPaginas());
        txtLocalizacao.setText(objLivro.getLocalizacao());

    }

    public void criarObjetos(){
            objLivro.setTitulo("Meu pé de laranja lima");
            objLivro.setAutor("José Mauro");
            objLivro.setEditora("Aliança");
            objLivro.setPaginas(121);
            objLivro.setLocalizacao("F12");
            Log.i("POO", objLivro.getTitulo());
        }
}