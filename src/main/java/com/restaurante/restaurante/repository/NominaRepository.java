package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Nomina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NominaRepository extends JpaRepository<Nomina, Integer> {
    // Puedes añadir métodos de consulta personalizados si los necesitas,
    // por ejemplo, List<Nomina> findByEmpleadoCedula(String cedulaEmpleado);
}