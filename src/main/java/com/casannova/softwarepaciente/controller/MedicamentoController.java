package com.casannova.softwarepaciente.controller;

;
import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/medicamento")

public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoServiceService;

    @GetMapping
    public List<Medicamento> findAll(){
        List<Medicamento> services = medicamentoServiceService.findAll();
        return services;
    }
}
