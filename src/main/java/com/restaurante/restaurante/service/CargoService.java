package com.restaurante.restaurante.service;

import com.restaurante.restaurante.model.Cargo;
import com.restaurante.restaurante.model.CargoRegistroDTO;
import com.restaurante.restaurante.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    private final CargoRepository cargoRepository; // El repositorio ya es de Cargo1

    @Autowired
    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public Cargo registrarNuevoCargo(CargoRegistroDTO datosRegistro) { // Retorna Cargo
        Cargo nuevoCargo = new Cargo(); // Crea una instancia de Cargo
        nuevoCargo.setNombre_Cargo(datosRegistro.getNombreCargo());
        nuevoCargo.setSalario_Base(datosRegistro.getSalarioBase());
        return cargoRepository.save(nuevoCargo);
    }

    public List<Cargo> obtenerTodosLosCargos() { // Retorna List de Cargo1
        return cargoRepository.findAll();
    }

    public Optional<Cargo> obtenerCargoPorId(Long id) { // Retorna Optional de Cargo1
        return cargoRepository.findById(id);
    }

    public boolean eliminarCargoPorId(Long id) {
        if (cargoRepository.existsById(id)) {
            cargoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Cargo actualizarCargo(Long id, CargoRegistroDTO datosActualizacion) { // Retorna Cargo
        Optional<Cargo> cargoExistenteOptional = cargoRepository.findById(id); // Optional de Cargo1

        if (cargoExistenteOptional.isPresent()) {
            Cargo cargoExistente = cargoExistenteOptional.get(); // Instancia de Cargo
            cargoExistente.setNombre_Cargo(datosActualizacion.getNombreCargo());
            cargoExistente.setSalario_Base(datosActualizacion.getSalarioBase());
            return cargoRepository.save(cargoExistente);
        } else {
            return null; // O lanzar una excepción
        }
    }
}