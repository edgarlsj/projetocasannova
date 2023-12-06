package com.casannova.softwarepaciente.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "tb_pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paciente_id")
    private Long id;
    private String nome;
    @Column(name = "data_nascimento")
    private Date dataNascimento;
    private Character genero;
    private String endereco;
    private String telefone;
    private String email;
    private String descricaoDoenca;


}
