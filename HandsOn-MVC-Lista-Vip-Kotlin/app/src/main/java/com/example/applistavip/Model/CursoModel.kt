package com.example.applistavip.Model

class CursoModel(
    private var _nome_curso: String
) {
    var nome_curso : String
        get() = _nome_curso;
        set(value) {
            _nome_curso = value;
        }
}