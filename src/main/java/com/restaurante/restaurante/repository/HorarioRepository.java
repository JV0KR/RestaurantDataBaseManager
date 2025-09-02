package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Long> {
    // Puedes añadir métodos personalizados si los necesitas, por ejemplo:
    List<Horario> findByEmpleadoCedula(String cedulaEmpleado);
}