package br.com.fiap.tds2ps.cp_javaAdvanced.controller;

import br.com.fiap.tds2ps.cp_javaAdvanced.dto.AppointmentDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.service.AppointmentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;
    
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ModelAndView insert(@ModelAttribute AppointmentDTO appointmentDTO, Model model) {
        appointmentService.insert(appointmentDTO);
        model.addAttribute("loggedAs", appointmentDTO.getDoctorCpf());
        return new ModelAndView("home");
    }

}
