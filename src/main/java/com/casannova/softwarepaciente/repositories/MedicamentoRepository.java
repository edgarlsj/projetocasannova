package com.casannova.softwarepaciente.repositories;

import com.casannova.softwarepaciente.entities.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
