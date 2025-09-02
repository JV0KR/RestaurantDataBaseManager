package com.restaurante.restaurante.service;

import com.restaurante.restaurante.model.Espacio;
import com.restaurante.restaurante.model.EspacioRegistroDTO;
import com.restaurante.restaurante.model.Sede;
import com.restaurante.restaurante.repository.EspacioRepository;
import com.restaurante.restaurante.repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioService {

    private final EspacioRepository espacioRepository;
    private final SedeRepository sedeRepository; // Inyectamos SedeRepository

    @Autowired
    public EspacioService(EspacioRepository espacioRepository, SedeRepository sedeRepository) {
        this.espacioRepository = espacioRepository;
        this.sedeRepository = sedeRepository;
    }

    public Espacio registrarNuevoEspacio(EspacioRegistroDTO datosRegistro) {
        Optional<Sede> sedeOptional = sedeRepository.findById(datosRegistro.getIdSede());
        if (sedeOptional.isPresent()) {
            Sede sede = sedeOptional.get();
            Espacio nuevoEspacio = new Espacio();
            nuevoEspacio.setSede(sede); // Establecer la Sede
            nuevoEspacio.setNombre_Espacio(datosRegistro.getNombreEspacio());
            nuevoEspacio.setTipo_Espacio(datosRegistro.getTipoEspacio());
            nuevoEspacio.setCapacidad(datosRegistro.getCapacidad());
            return espacioRepository.save(nuevoEspacio);
        }
        return null; // O lanzar una excepción si la Sede no existe
    }

    public List<Espacio> obtenerTodosLosEspacios() {
        return espacioRepository.findAll();
    }

    public Optional<Espacio> obtenerEspacioPorId(Integer id) {
        return espacioRepository.findById(id);
    }

    public boolean eliminarEspacioPorId(Integer id) {
        if (espacioRepository.existsById(id)) {
            espacioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Espacio actualizarEspacio(Integer id, EspacioRegistroDTO datosActualizacion) {
        Optional<Espacio> espacioExistenteOptional = espacioRepository.findById(id);

        if (espacioExistenteOptional.isPresent()) {
            Espacio espacioExistente = espacioExistenteOptional.get();

            // Actualizar Sede si se proporciona un nuevo ID de Sede y es válido
            if (datosActualizacion.getIdSede() != null) {
                Optional<Sede> sedeOptional = sedeRepository.findById(datosActualizacion.getIdSede());
                if (sedeOptional.isPresent()) {
                    espacioExistente.setSede(sedeOptional.get());
                } else {
                    // Manejar el caso donde el ID de Sede no es válido
                    return null;
                }
            }

            espacioExistente.setNombre_Espacio(datosActualizacion.getNombreEspacio());
            espacioExistente.setTipo_Espacio(datosActualizacion.getTipoEspacio());
            espacioExistente.setCapacidad(datosActualizacion.getCapacidad());
            return espacioRepository.save(espacioExistente);
        }
        return null;
    }
}