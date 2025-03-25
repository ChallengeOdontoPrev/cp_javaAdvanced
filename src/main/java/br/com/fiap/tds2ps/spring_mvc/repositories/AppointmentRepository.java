package br.com.fiap.tds2ps.spring_mvc.repositories;

import br.com.fiap.tds2ps.spring_mvc.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
