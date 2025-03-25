package br.com.fiap.tds2ps.cp_javaAdvanced.controller;

import br.com.fiap.tds2ps.cp_javaAdvanced.dto.DoctorDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.service.DoctorService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/doctor")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    public ModelAndView insert(@ModelAttribute DoctorDTO doctorDTO, Model model) {
        doctorService.insert(doctorDTO);
        model.addAttribute("loggedAs", "Logged as " + doctorDTO.getCpf());
        return new ModelAndView("home");
    }

}
