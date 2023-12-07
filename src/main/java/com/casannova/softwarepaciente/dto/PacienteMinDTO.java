package com.casannova.softwarepaciente.dto;

import com.casannova.softwarepaciente.entities.Paciente;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor


public class PacienteMinDTO {


    private Long id;
    private String nome;
    private Date dataNascimento;
    private Character genero;
    private String descricaoDoenca;

    public PacienteMinDTO (Paciente entity){
        id = entity.getId();
        nome = entity.getNome();
        dataNascimento = entity.getDataNascimento();
        genero = entity.getGenero();
        descricaoDoenca = entity.getDescricaoDoenca();

    }
}
