package com.example.applistavip.Controller

import com.example.applistavip.Model.CursoModel

class CursoController {
    public fun getListaCursos() : List<CursoModel> {
        val lista_cursos: MutableList<CursoModel>
        = mutableListOf(
            CursoModel("Penis"),
            CursoModel("PenisPenis")
        )
        lista_cursos.add(CursoModel("PenisPenisPenis"))
        return lista_cursos;
    }
    fun getNomesCursos() : ArrayList<String>{
        val listaNomes : ArrayList<String> = arrayListOf()
        getListaCursos().forEach(){
            listaNomes.add(it.nome_curso)
        }
        return listaNomes;
    }
}