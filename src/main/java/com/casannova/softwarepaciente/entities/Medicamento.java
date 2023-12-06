package com.casannova.softwarepaciente.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_medicamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicamento_id")
    private Long id;
    @Column(name = "nome_referencia")
    private String nomeReferencia;
    @Column(name = "principio_ativo")
    private String principioAtivo;
    private String concentracao;
    private String fabricante;


}
