package br.com.fiap.tds2ps.spring_mvc.service;

import br.com.fiap.tds2ps.spring_mvc.domain.Doctor;
import br.com.fiap.tds2ps.spring_mvc.dto.DoctorDTO;
import br.com.fiap.tds2ps.spring_mvc.repositories.DoctorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Transactional
    public DoctorDTO insert(DoctorDTO doctorDTO) {
        Doctor entity = new Doctor();
        entity.setCpf(doctorDTO.getCpf());
        entity = doctorRepository.save(entity);
        return new DoctorDTO(entity);
    }

}
