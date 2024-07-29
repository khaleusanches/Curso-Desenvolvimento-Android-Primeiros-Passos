package com.example.handson_clockdigital

import android.view.View
import android.widget.TextView
import android.widget.TextClock
import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var txtHoraAtual : TextClock? = null;
    private var txtHora24pm : TextClock? = null;
    private var txtHora : TextView? = null;
    private var btnUpdateHora : Button? = null;


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
    }

    private fun iniciarComponentes() {
        txtHora = findViewById<TextView>(R.id.txtExibirHoraUpdate);
        txtHoraAtual = findViewById(R.id.txtHoraAtual);
        txtHora24pm = findViewById(R.id.txtHora24PM);
        btnUpdateHora = findViewById(R.id.btnAtualizarHora);
    }

    fun atualizarHoraClick(view: View) {
        txtHora!!.text = ("Hora: " + txtHora24pm!!.text);
    }
}