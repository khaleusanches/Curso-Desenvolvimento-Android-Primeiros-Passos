package com.example.pooencapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int paginas;
    private String paginas2;
    private String localizacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPaginas() {
        paginas2 = String.valueOf(paginas);
        return paginas2;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
