package com.restaurante.restaurante.model;

public class SedeRegistroDTO {

    private String nombreSede;
    private String direccion;

    public SedeRegistroDTO() {
    }

    public SedeRegistroDTO(String nombreSede, String direccion) {
        this.nombreSede = nombreSede;
        this.direccion = direccion;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}