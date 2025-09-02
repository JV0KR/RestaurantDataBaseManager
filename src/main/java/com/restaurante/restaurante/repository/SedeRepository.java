package com.restaurante.restaurante.repository;

import com.restaurante.restaurante.model.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer> {
    // JpaRepository<TipoDeEntidad, TipoDelIdDeEntidad>
}