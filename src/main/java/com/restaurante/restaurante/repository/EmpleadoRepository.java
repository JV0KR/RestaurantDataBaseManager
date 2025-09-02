package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {
    // El ID de Empleado es un String (Cédula)

}