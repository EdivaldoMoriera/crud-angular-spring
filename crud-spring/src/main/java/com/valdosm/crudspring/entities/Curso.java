package com.valdosm.crudspring.entities;

public class Curso {
    private Integer id;
    private String cursos;
    public Curso(){

    }
    public Curso(Integer id, String cursos) {
        this.id = id;
        this.cursos = cursos;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCursos() {
        return cursos;
    }
    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
    
}
