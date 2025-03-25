package br.com.fiap.tds2ps.cp_javaAdvanced.repositories;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
