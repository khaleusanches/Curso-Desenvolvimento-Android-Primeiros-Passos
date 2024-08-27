package com.example.appgasolinaetanol.view

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appgasolinaetanol.R
import android.widget.TextView;
import com.example.appgasolinaetanol.controller.CalculadoraController
import com.example.appgasolinaetanol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding;
    var calculadoraController = CalculadoraController();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun calcularGasolinaEtanol(view: View){
        var etanol = binding.etEtanol.text.toString().toInt()
        var gasolina = binding.etGasolina.text.toString().toInt()
        var conta = calculadoraController.result(etanol, gasolina);
        binding.txtResult.text = conta.toString()
    }
}