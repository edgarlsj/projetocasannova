package com.casannova.softwarepaciente.repositories;

import com.casannova.softwarepaciente.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
