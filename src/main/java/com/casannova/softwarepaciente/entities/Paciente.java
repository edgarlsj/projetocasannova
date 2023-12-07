package com.casannova.softwarepaciente.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_pacientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

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

    @ManyToMany(fetch = FetchType.EAGER)//Essa anotação indica uma relação muitos para muitos entre as entidades

    /*Esta anotação é usada para configurar a tabela de junção que será criada no banco de dados
    para representar a relação muitos para muitos. Neste caso, a tabela de junção é nomeada como
    paciente_medicamento. Os atributos joinColumns e inverseJoinColumns especificam as colunas
    nas tabelas Paciente e Medicamento que serão usadas como chaves estrangeiras na tabela de junção.*/

    @JoinTable(name = "paciente_medicamento", joinColumns = @JoinColumn(name = "paciente_id"), inverseJoinColumns = @JoinColumn(name = "medicamento_id"))

    /*
     Este é o campo que representa a relação muitos para muitos entre Paciente e Medicamento.
     É uma coleção Set que será preenchida com os medicamentos associados a um paciente.
     O uso de um Set garante que não haverá duplicatas na coleção.
     A inicialização com new HashSet<>() ajuda a evitar problemas com referências nulas.
     */


    private Set<Medicamento> medicamentos = new HashSet<>();


}



