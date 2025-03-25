package br.com.fiap.tds2ps.spring_mvc.repositories;

import br.com.fiap.tds2ps.spring_mvc.domain.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
