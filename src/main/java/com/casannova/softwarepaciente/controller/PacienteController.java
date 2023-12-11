package com.casannova.softwarepaciente.controller;

import com.casannova.softwarepaciente.dto.PacienteDTO;
import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.service.PacienteService;
import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/pacientes")


public class PacienteController {

    private final PacienteService pacienteService;

    //metodo que me retorna toda as lista de pacientes e medicamentos associados
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<PacienteDTO> result = pacienteService.findAll();
        return ResponseEntity.ok(result);
    }
//    metodo que retorna o paciente e medicamento associados a esssa paciente
    @GetMapping("/{id}")
    public ResponseEntity<?> getPacienteById(@PathVariable Long id) {
        Optional<Paciente> pacienteOptional = pacienteService.findById(id);
        return pacienteOptional.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


    //    Método para obter medicamentos por ID do paciente
//    @GetMapping("/{paciente_id}/medicamentos")
//    public ResponseEntity<Set<Medicamento>> getMedicamentosByPaciente(@PathVariable Long paciente_id) {
//        Optional<Paciente> pacienteOptional = pacienteService.findById(paciente_id);
//
//        if (pacienteOptional.isPresent()) {
//            Set<Medicamento> medicamentos = pacienteOptional.get().getMedicamentos();
//            return ResponseEntity.ok(medicamentos);
//        } else {
//            // Retorna 404 Not Found se o paciente não for encontrado.
//            return ResponseEntity.notFound().build();
//        }
//    }


}






