package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Espacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspacioRepository extends JpaRepository<Espacio, Integer> {
    // JpaRepository<TipoDeEntidad, TipoDelIdDeEntidad>
}