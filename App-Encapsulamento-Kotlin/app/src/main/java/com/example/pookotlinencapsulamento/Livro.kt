package com.example.pookotlinencapsulamento

class Livro(
    private var _titulo: String,
    private var _autor: String,
    private var _editora: String,
    private var _paginas: String,
    private var _localizacao: String
) {
    var titulo: String
        get() = _titulo
        set(value) {
            _titulo = value
        }
    var autor: String
        get() = _autor
        set(value) {
            _autor = value;
        }
    var editora: String
        get() = _editora
        set(value) {
            _editora = value;
        }
    var paginas: String
        get() = _paginas
        set(value) {
            _paginas = value;
        }
    var localizacao: String
        get() = _localizacao
        set(value) {
            _localizacao = value;
        }
}