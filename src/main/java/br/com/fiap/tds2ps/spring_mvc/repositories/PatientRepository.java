package br.com.fiap.tds2ps.spring_mvc.repositories;

import br.com.fiap.tds2ps.spring_mvc.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
