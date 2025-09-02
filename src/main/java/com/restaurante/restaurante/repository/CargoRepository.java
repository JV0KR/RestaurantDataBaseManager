package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> { // <-- Usa Cargo aquí
    // JpaRepository<TipoDeEntidad, TipoDelIdDeEntidad>
}