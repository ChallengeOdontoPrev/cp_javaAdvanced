package br.com.fiap.tds2ps.cp_javaAdvanced.repositories;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
