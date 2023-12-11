package com.casannova.softwarepaciente.controller;

;
import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.service.MedicamentoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/medicamentos")
@AllArgsConstructor

public class MedicamentoController {

    private MedicamentoService medicamentoServiceService;


//    metodo que retorna a lista de medicamentos
    @GetMapping
    public ResponseEntity<List<Medicamento>>findAll(){
        List<Medicamento> services = medicamentoServiceService.findAll();
        return ResponseEntity.ok(services);
    }
}
