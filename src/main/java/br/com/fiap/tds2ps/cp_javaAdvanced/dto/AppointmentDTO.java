package br.com.fiap.tds2ps.cp_javaAdvanced.dto;

import br.com.fiap.tds2ps.cp_javaAdvanced.domain.Appointment;

public class AppointmentDTO {
    private Long id;
    private String anamnesis;
    private String prescription;
    private String patientCpf;
    private String doctorCpf;

    public AppointmentDTO(Long id, String anamnesis, String prescription, String patientCpf, String doctorCpf) {
        this.id = id;
        this.anamnesis = anamnesis;
        this.prescription = prescription;
        this.patientCpf = patientCpf;
        this.doctorCpf = doctorCpf;
    }

    public AppointmentDTO(Appointment appointment){
        this.id = appointment.getId();
        this.anamnesis = appointment.getAnamnesis();
        this.prescription = appointment.getPrescription();
        this.patientCpf = appointment.getPatient().getCpf();
        this.doctorCpf = appointment.getDoctor().getCpf();
    }

    public AppointmentDTO() {
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

    public String getPatientCpf() {
        return patientCpf;
    }

    public void setPatientCpf(String patientCpf) {
        this.patientCpf = patientCpf;
    }

    public String getDoctorCpf() {
        return doctorCpf;
    }

    public void setDoctorCpf(String doctorCpf) {
        this.doctorCpf = doctorCpf;
    }
}
