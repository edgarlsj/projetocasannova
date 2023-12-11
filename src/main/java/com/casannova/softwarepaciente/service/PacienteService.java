package com.casannova.softwarepaciente.service;


import com.casannova.softwarepaciente.dto.PacienteDTO;
import com.casannova.softwarepaciente.entities.Paciente;
import com.casannova.softwarepaciente.repositories.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PacienteService {


    private PacienteRepository pacienteRepository;


//    metodo que retorna todas as lista de atributos de pacientes
    @Transactional(readOnly = true)
    public List<PacienteDTO> findAll (){
        List<Paciente> result = pacienteRepository.findAll();
        List<PacienteDTO> dto = result.stream().map(x -> new PacienteDTO(x)).toList();
        return  dto;
    }

    @Transactional(readOnly = true) //usada p demarcar um limite transacional, garante que o metodo executado dentro de uma unica transação.
// metodo que retorna p/ controller a lista de pacientes do banco pelo ID
    public Optional<Paciente> findById(Long id) {
        return pacienteRepository.findById(id);
    }


    }




