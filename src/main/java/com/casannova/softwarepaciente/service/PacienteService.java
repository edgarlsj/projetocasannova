package com.casannova.softwarepaciente.service;


import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.repositories.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PacienteService {


    private PacienteRepository pacienteRepository;


    //metodo que retorna para o controler a lista de pacientes
    @Transactional(readOnly = true)
    public List<Paciente> findAll (){
        List<Paciente> result = pacienteRepository.findAll();
        return result;
    }


}
