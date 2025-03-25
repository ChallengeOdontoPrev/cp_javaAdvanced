package br.com.fiap.tds2ps.spring_mvc.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cp_tb_patient")
public class Patient extends Person {

    private String name;
    private String email;
    private String phone;
    private String cep;
    private String address;
    private String gender;

    public Patient() {
    }

    public Patient(String name, String email, String phone, String cep, String address, String gender) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cep = cep;
        this.address = address;
        this.gender = gender;
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
