package com.restaurante.restaurante.repository;

    import com.restaurante.restaurante.model.Restaurante;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface RestauranteRepository extends JpaRepository<Restaurante, String> {
        // JpaRepository<TipoDeEntidad, TipoDelIdDeEntidad>
        // El ID de Restaurante es un String (RUT)
    }