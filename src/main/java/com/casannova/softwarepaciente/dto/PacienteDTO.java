package com.casannova.softwarepaciente.dto;

import com.casannova.softwarepaciente.entities.Medicamento;
import com.casannova.softwarepaciente.entities.Paciente;
import com.fasterxml.jackson.databind.util.BeanUtil;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//classe DTO que retorna todos os atributos do paciente.
public class PacienteDTO {

    private Long id;
    private String nome;
    private Date dataNascimento;
    private Character genero;
    private String endereco;
    private String telefone;
    private String email;
    private String descricaoDoenca;

    private Set<Medicamento> medicamentos;



    //Contrutor personalizado que retorna todos os atributos
    public PacienteDTO(Paciente entity) {
        //esse metodo permite copiar as propriedade do objeto GAME para esse onjeto GameDTO automaticamente
        // obs: obrigatorio gerar os getter e setter
        BeanUtils.copyProperties(entity,this);
    }
}
