package com.valdosm.crudspring.entities;

public class Curso {
    private Integer id;
    private String cursos;
    private String category;
  
    public Curso(){

    }
    public Curso(Integer id, String cursos, String category) {
        this.id = id;
        this.cursos = cursos;
        this.category = category;
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
    public String getCategory() {
        return category;
    }
    public void setCategiry(String category) {
        this.category = category;
    }
    
}
