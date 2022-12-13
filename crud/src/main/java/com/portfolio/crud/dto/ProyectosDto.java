package com.portfolio.crud.dto;

public class ProyectosDto {
    private String urlimagen;
    private String nombre;

    public ProyectosDto() {
    }

    public ProyectosDto(String urlimagen, String nombre) {
        this.urlimagen = urlimagen;
        this.nombre = nombre;
    }

    public String getUrlimagen() { return urlimagen; }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

