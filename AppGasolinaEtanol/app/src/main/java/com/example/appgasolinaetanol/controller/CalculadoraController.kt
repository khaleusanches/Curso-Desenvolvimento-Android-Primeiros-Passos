package com.example.appgasolinaetanol.controller

class CalculadoraController {
   fun result(preco_etanol: Int, preco_gasolina: Int) : Int{
        return preco_gasolina / preco_etanol;
    }
}