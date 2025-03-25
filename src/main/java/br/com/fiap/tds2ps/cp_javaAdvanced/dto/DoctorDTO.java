package br.com.fiap.tds2ps.cp_javaAdvanced.dto;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Doctor;

public class DoctorDTO {
    private String cpf;

    public DoctorDTO() {
    }

    public DoctorDTO(String cpf) {
        this.cpf = cpf;
    }

    public DoctorDTO(Doctor doctor){
        this.cpf = doctor.getCpf();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
