package br.com.fiap.tds2ps.cp_javaAdvanced.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cp_tb_appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String anamnesis;
    private String prescription;

    @ManyToOne
    @JoinColumn(name = "patient_cpf")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_cpf")
    private Doctor doctor;

    public Appointment(Long id, String anamnesis, String prescription) {
        this.id = id;
        this.anamnesis = anamnesis;
        this.prescription = prescription;
    }

    public Appointment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
