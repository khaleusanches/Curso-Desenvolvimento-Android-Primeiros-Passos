package com.example.applistavip.View

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applistavip.R

class SplashActivity : AppCompatActivity() {
    public final var TIME_OUT_SPLASH : Int = 2000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cumutarTelaSplash();
    }

    private fun cumutarTelaSplash() {
        Handler().postDelayed({
            var telaPrincipal : Intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(telaPrincipal);
            finish();
        }, TIME_OUT_SPLASH.toLong())
    }
}