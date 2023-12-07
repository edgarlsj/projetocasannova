package com.casannova.softwarepaciente.controller;

import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.service.PacienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(value = "/pacientes")


public class PacienteController {

  private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Paciente> result = pacienteService.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{pacienteId}/medicamentos")
    public ResponseEntity<Set<Medicamento>> getMedicamentosByPaciente (@PathVariable Long pacienteId){
        Optional<Paciente> pacienteOptional =


    }





}
