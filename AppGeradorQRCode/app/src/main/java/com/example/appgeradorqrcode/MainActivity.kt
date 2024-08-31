package com.example.appgeradorqrcode

import android.location.LocationManager
import android.os.Bundle
import android.Manifest;
import android.content.pm.PackageManager
import android.telephony.CarrierConfigManager.Gps
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appgeradorqrcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var latitude : Double = 0.0;
    var longitude : Double = 0.0;
    var gps_ativo : Boolean = false;
    lateinit var binding : ActivityMainBinding;
    var teste = arrayOf(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
    val APP_PERMISSOES_ID = 2021
    lateinit var locationManager : LocationManager;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        locationManager = application.getSystemService(LOCATION_SERVICE) as LocationManager;
        gps_ativo = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        if (gps_ativo == true){
            obterCordenadas();
        }
        else{
            binding.tvNumberLatitude.text = "COORDENADAS";
            binding.tvNumberLongitude.text = "INDISPONIVEIS";
        }
    }

    private fun obterCordenadas() {
        var permissao_ativa = solicitarPermissao();
        if(permissao_ativa){
            capturarLocalizacao();
        }
    }

    private fun solicitarPermissao() : Boolean{
        var permissoesNegadas : MutableList<String> = mutableListOf()
        var permissao = 0;
        teste.forEach {
            permissao = ContextCompat.checkSelfPermission(this, it);
            if(permissao != PackageManager.PERMISSION_GRANTED){
                permissoesNegadas.add(it)
            }
        }

        if(permissoesNegadas.isEmpty()){
            return true
        }
        else{
            val permissoesArray = permissoesNegadas.toTypedArray() // Converte lista para array
            ActivityCompat.requestPermissions(this, permissoesArray, APP_PERMISSOES_ID)
            return false
        }
    }

    private fun capturarLocalizacao() {
        latitude = 1.23;
        longitude = -50.2;
        binding.tvNumberLatitude.text = latitude.toString();
        binding.tvNumberLongitude.text = longitude.toString()
    }
}