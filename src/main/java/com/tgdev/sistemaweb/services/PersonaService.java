package com.tgdev.sistemaweb.services;

import com.tgdev.sistemaweb.models.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> obtenerPersonas();
    Persona obtenerPorId(Long id);
    Persona crearPersona(Persona persona);
    Persona actualizarPersona(Persona persona);
    void eliminarPersona(Long id);

}
