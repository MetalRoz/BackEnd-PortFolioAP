package com.portfolio.crud.dto;

public class EducacionDto {

    private String titulo;
    private String institucion;
    private String descripcion;

    public EducacionDto() {
    }

    public EducacionDto(String titulo, String institucion, String descripcion) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}