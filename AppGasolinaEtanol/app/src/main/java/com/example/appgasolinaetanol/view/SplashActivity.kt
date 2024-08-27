package com.example.appgasolinaetanol.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appgasolinaetanol.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private var timeoutsplash : Long = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mostrarSplash()
    }

    private fun mostrarSplash() {
        Handler().postAtTime({
            val novatela = Intent(this, MainActivity::class.java)
            startActivity(novatela)
            finish()
        }, timeoutsplash)
    }
}