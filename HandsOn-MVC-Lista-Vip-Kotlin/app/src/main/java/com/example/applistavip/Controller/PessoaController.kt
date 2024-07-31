package com.example.applistavip.Controller


import android.content.SharedPreferences
import com.example.applistavip.Model.Pessoa
import com.example.applistavip.View.MainActivity
import com.example.applistavip.View.MainActivity.Companion

class PessoaController {
    var listaVip : SharedPreferences.Editor? = null;

    public fun salvar(user : Pessoa) {
        listaVip = MainActivity.preferences!!.edit();
        listaVip!!.putString("nome", user.name);
        listaVip!!.apply();
    }
    public fun carregar(){

    }

}