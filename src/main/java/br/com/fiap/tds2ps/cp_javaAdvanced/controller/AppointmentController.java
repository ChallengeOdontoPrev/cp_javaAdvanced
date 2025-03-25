package br.com.fiap.tds2ps.cp_javaAdvanced.controller;

import br.com.fiap.tds2ps.cp_javaAdvanced.dto.AppointmentDTO;
import br.com.fiap.tds2ps.cp_javaAdvanced.service.AppointmentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @GetMapping
    public List<AppointmentDTO> findAll(){
        return appointmentService.findAll();
    }

}
