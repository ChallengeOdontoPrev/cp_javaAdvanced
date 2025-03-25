package br.com.fiap.tds2ps.cp_javaAdvanced.dto;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Patient;

public class PatientDTO {
    private String cpf;
    private String name;
    private String email;
    private String phone;
    private String cep;
    private String address;
    private String gender;

    public PatientDTO() {
    }

    public PatientDTO(String cpf, String name, String email, String phone, String cep, String address, String gender) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.address = address;
        this.gender = gender;
    }

    public PatientDTO(Patient patient) {
        this.cpf = patient.getCpf();
        this.name = patient.getName();
        this.email = patient.getEmail();
        this.phone = patient.getPhone();
        this.cep = patient.getCep();
        this.address = patient.getAddress();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
