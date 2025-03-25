package br.com.fiap.tds2ps.cp_javaAdvanced.service;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Patient;
import br.com.fiap.tds2ps.cp_javaAdvanced.dto.PatientDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.repositories.PatientRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Transactional
    public PatientDTO insert(PatientDTO patientDTO) {
        Patient entity = new Patient();
        entity.setCpf(patientDTO.getCpf());
        entity.setAddress(patientDTO.getAddress());
        entity.setGender(patientDTO.getGender());
        entity.setName(patientDTO.getName());
        entity.setPhone(patientDTO.getPhone());
        entity.setCep(patientDTO.getCep());
        entity.setEmail(patientDTO.getEmail());
        entity = patientRepository.save(entity);
        return new PatientDTO(entity);
    }

}
