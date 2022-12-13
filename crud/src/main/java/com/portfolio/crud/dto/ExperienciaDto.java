package com.portfolio.crud.dto;

public class ExperienciaDto {

    private String titulo;
    private String descripcion;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
