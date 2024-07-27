package com.example.pookotlinencapsulamento
import android.widget.TextView;
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var txtTitulolivro : TextView;
    lateinit var txtAutor : TextView;
    lateinit var txtEditora : TextView;
    lateinit var txtPaginas : TextView;
    lateinit var txtLocalizacao : TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        iniciarComponentes();
        criarObjetos();
    }

    private fun iniciarComponentes() {
        txtTitulolivro = findViewById<TextView>(R.id.txtTituloLivro);
        txtAutor = findViewById<TextView>(R.id.txtAutor);
        txtEditora = findViewById<TextView>(R.id.txtEditora);
        txtPaginas = findViewById<TextView>(R.id.txtPaginas);
        txtLocalizacao = findViewById<TextView>(R.id.txtLocalizacao);
    }

    private fun criarObjetos() {
        var livro = Livro(
            "Kotlin",
            "Khaléu Sanches Mancini",
            "Aliança",
            "121",
            "F12");
        txtTitulolivro.setText(livro.titulo);
        txtAutor.setText(livro.autor);
        txtEditora.text = livro.editora;
        txtPaginas.text = livro.paginas;
        txtLocalizacao.text = livro.localizacao;
    }
}