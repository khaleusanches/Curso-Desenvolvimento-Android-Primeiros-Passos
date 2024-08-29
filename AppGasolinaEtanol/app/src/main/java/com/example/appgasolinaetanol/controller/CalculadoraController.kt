package com.example.appgasolinaetanol.controller

class CalculadoraController {
   fun result(preco_etanol: Int, preco_gasolina: Int) : String{
       if(preco_etanol <= preco_gasolina*70/100){return "COMPRE ETANOL: R$$preco_etanol/Litro"}
       else{return "COMPRE GASOLINA: R$$preco_gasolina/Litro"}
    }
}