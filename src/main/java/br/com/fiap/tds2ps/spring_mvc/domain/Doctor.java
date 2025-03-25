package br.com.fiap.tds2ps.spring_mvc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cp_tb_doctor")
public class Doctor extends Person {
    public Doctor() {
    }
}
