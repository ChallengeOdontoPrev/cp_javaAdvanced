package br.com.fiap.tds2ps.cp_javaAdvanced.repositories;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
