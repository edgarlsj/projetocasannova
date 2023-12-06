package com.casannova.softwarepaciente.service;


import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Transactional(readOnly = true)
    public List<Paciente> findAll (){
        List<Paciente> result = pacienteRepository.findAll();
        return result;
    }


}
