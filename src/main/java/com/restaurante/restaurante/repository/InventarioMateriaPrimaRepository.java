package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.InventarioMateriaPrima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioMateriaPrimaRepository extends JpaRepository<InventarioMateriaPrima, Integer> {
    // Puedes añadir métodos personalizados, por ejemplo:
    // Optional<InventarioMateriaPrima> findByMateriaPrima_IdMateriaPrima(Integer idMateriaPrima);
}