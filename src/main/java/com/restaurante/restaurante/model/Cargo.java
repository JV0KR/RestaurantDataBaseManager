package com.restaurante.restaurante.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Cargo { // <-- ¡IMPORTANTE! El nombre de la clase debe ser Cargo

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Cargo;

    @Column(name = "nombre_Cargo", nullable = false, length = 50)
    private String nombre_Cargo;

    @Column(name = "salario_Base", precision = 10, scale = 2, nullable = false)
    private BigDecimal salario_Base; // O double, según tu decisión

    // Constructores
    public Cargo() { // Constructor vacío
    }

    public Cargo(String nombre_Cargo, BigDecimal salario_Base) { // O double
        this.nombre_Cargo = nombre_Cargo;
        this.salario_Base = salario_Base;
    }

    // Getters y Setters
    public Long getId_Cargo() {
        return id_Cargo;
    }

    public void setId_Cargo(Long id_Cargo) {
        this.id_Cargo = id_Cargo;
    }

    public String getNombre_Cargo() {
        return nombre_Cargo;
    }

    public void setNombre_Cargo(String nombre_Cargo) {
        this.nombre_Cargo = nombre_Cargo;
    }

    public BigDecimal getSalario_Base() { // O double
        return salario_Base;
    }

    public void setSalario_Base(BigDecimal salario_Base) { // O double
        this.salario_Base = salario_Base;
    }

    @Override
    public String toString() {
        return "Cargo{" + // También en el toString
                "id_Cargo=" + id_Cargo +
                ", nombre_Cargo='" + nombre_Cargo + '\'' +
                ", salario_Base=" + salario_Base +
                '}';
    }
}