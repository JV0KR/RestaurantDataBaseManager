package com.restaurante.restaurante.model;

import java.math.BigDecimal;

public class CargoRegistroDTO {

    private String nombreCargo;
    private BigDecimal salarioBase; // Asegúrate de que coincida con Cargo.java (double o BigDecimal)

    public CargoRegistroDTO() {
    }

    public CargoRegistroDTO(String nombreCargo, BigDecimal salarioBase) { // O double
        this.nombreCargo = nombreCargo;
        this.salarioBase = salarioBase;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public BigDecimal getSalarioBase() { // O double
        return salarioBase;
    }

    public void setSalarioBase(BigDecimal salarioBase) { // O double
        this.salarioBase = salarioBase;
    }
}