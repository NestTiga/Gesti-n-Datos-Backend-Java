package com.tgdev.sistemaweb.services;

import com.tgdev.sistemaweb.models.Persona;
import com.tgdev.sistemaweb.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
        Persona personaEncontrada= personaRepository.findById(persona.getId()).orElse(null);
        if (personaEncontrada!=null){
            personaEncontrada.setNombre(persona.getNombre());
            personaEncontrada.setApellido(persona.getApellido());
            return personaRepository.save(personaEncontrada);
        }
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}
