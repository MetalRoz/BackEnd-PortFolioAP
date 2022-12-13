package com.portfolio.crud.dto;

public class AboutMeDto {

    private String nombre;
    private String ocupacion;
    private String descripcion;

    public AboutMeDto() {
    }

    public AboutMeDto(String nombre, String ocupacion, String descripcion) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
