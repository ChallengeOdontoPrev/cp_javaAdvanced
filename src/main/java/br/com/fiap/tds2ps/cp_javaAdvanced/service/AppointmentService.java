package br.com.fiap.tds2ps.cp_javaAdvanced.service;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Appointment;
import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Doctor;
import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Patient;
import br.com.fiap.tds2ps.cp_javaAdvanced.dto.AppointmentDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.repositories.AppointmentRepository;
import br.com.fiap.tds2ps.cp_javaAdvanced.repositories.DoctorRepository;
import br.com.fiap.tds2ps.cp_javaAdvanced.repositories.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    public AppointmentService(AppointmentRepository appointmentRepository, DoctorRepository doctorRepository, PatientRepository patientRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
    }

    @Transactional
    public AppointmentDTO insert(AppointmentDTO appointmentDTO) {
        Appointment entity = new Appointment();
        entity.setAnamnesis(appointmentDTO.getAnamnesis());
        entity.setPrescription(appointmentDTO.getPrescription());
        Doctor doctor = doctorRepository.findById(appointmentDTO.getDoctorCpf()).get();
        Patient patient = patientRepository.findById(appointmentDTO.getPatientCpf()).get();
        entity.setDoctor(doctor);
        entity.setPatient(patient);
        entity = appointmentRepository.save(entity);
        return new AppointmentDTO(entity);
    }

}
