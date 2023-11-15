package com.tgdev.sistemaweb.controllers;

import com.tgdev.sistemaweb.models.Persona;
import com.tgdev.sistemaweb.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/personas")
@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> listarPersona(){
        return personaService.obtenerPersonas();
    }
}
