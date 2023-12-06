package com.casannova.softwarepaciente.controller;

import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/paciente")

public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> findAll(){
        List<Paciente> services = pacienteService.findAll();
        return services;
    }
}
