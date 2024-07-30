package com.example.applistavip.Model

class Pessoa(
    private var _name : String,
    private var _password : String,
    var email : String
) {
    var name : String
        get() = _name;
        set(value) {
            _name = value;
        }

    var password : String
        get() = _password;
        set(value) {
            _password = value;
        }
}