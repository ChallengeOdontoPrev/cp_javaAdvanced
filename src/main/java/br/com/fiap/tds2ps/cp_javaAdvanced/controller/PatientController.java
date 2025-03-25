package br.com.fiap.tds2ps.cp_javaAdvanced.controller;

import br.com.fiap.tds2ps.cp_javaAdvanced.dto.PatientDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/patient")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ModelAndView insert(@ModelAttribute PatientDTO patientDTO, Model model) {
        patientService.insert(patientDTO);
        return new ModelAndView("add-consultation");
    }

}
