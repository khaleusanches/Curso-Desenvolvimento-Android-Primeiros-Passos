package com.example.applistavip.View

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applistavip.Controller.PessoaController
import com.example.applistavip.Model.Pessoa
import com.example.applistavip.R

class MainActivity : AppCompatActivity() {

    var tb_name : EditText? = null
    var tb_password : EditText? = null
    var tb_email : EditText? = null
    var btn_save : Button? = null
    var user : Pessoa? = null

    var pessoa_controller = PessoaController();
    var preferences : SharedPreferences? = null;
    companion object{
        val preferences: SharedPreferences? = null;
        final val NOME_PREFENCES : String = "pref_lista";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        preferences = getSharedPreferences(NOME_PREFENCES, 0);
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        inicializarComponentes();
    }

    private fun inicializarComponentes() {
        tb_name = findViewById(R.id.tb_name);
        tb_password = findViewById(R.id.tb_password);
        tb_email = findViewById(R.id.tb_email);
        btn_save = findViewById(R.id.btn_save);
        tb_name!!.setText(preferences!!.getString("nome", ""));
    }

    fun cadastrarPessoa(view: View) {
        user = Pessoa(tb_name!!.text.toString(), tb_password!!.text.toString(), tb_email!!.text.toString());
        pessoa_controller.salvar(user!!);
       // tb_name!!.text = null;
    }
}