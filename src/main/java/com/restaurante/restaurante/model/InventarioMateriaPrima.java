package com.restaurante.restaurante.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Inventario_Materias_Primas") // Asegúrate de que el nombre de la tabla coincida exactamente con tu DDL
public class InventarioMateriaPrima {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Inventario_Materia_Prima") // Nombre de la columna en la BD
    private Integer idInventarioMateriaPrima;

    @ManyToOne // Muchas entradas de inventario a una MateriaPrima
    @JoinColumn(name = "ID_Materia_Prima", nullable = false) // Columna de la clave foránea en esta tabla
    private MateriaPrima materiaPrima;

    @Column(name = "Cantidad_Disponible", precision = 10, scale = 2, nullable = false) // Ejemplo de precisión y escala
    private BigDecimal cantidadDisponible;

    @Column(name = "Fecha_Ultima_Actualizacion", nullable = false) // Nombre de la columna en la BD
    private LocalDateTime fechaUltimaActualizacion;

    // Constructores
    public InventarioMateriaPrima() {
    }

    public InventarioMateriaPrima(MateriaPrima materiaPrima, BigDecimal cantidadDisponible, LocalDateTime fechaUltimaActualizacion) {
        this.materiaPrima = materiaPrima;
        this.cantidadDisponible = cantidadDisponible;
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    // Getters y Setters
    public Integer getIdInventarioMateriaPrima() {
        return idInventarioMateriaPrima;
    }

    public void setIdInventarioMateriaPrima(Integer idInventarioMateriaPrima) {
        this.idInventarioMateriaPrima = idInventarioMateriaPrima;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public BigDecimal getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(BigDecimal cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public LocalDateTime getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(LocalDateTime fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    @Override
    public String toString() {
        return "InventarioMateriaPrima{" +
                "idInventarioMateriaPrima=" + idInventarioMateriaPrima +
                ", materiaPrima=" + (materiaPrima != null ? materiaPrima.getNombre() : "null") +
                ", cantidadDisponible=" + cantidadDisponible +
                ", fechaUltimaActualizacion=" + fechaUltimaActualizacion +
                '}';
    }
}