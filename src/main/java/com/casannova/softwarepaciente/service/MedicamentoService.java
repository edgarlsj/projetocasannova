package com.casannova.softwarepaciente.service;


import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public List<Medicamento> findAll(){
        List<Medicamento> result = medicamentoRepository.findAll();
        return result;
    }
}
