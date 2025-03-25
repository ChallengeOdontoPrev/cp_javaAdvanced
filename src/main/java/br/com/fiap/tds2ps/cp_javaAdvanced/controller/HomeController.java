package br.com.fiap.tds2ps.cp_javaAdvanced.controller;

import br.com.fiap.tds2ps.cp_javaAdvanced.dto.PersonDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(Model model) {
        model.addAttribute("user", new PersonDTO());
        return new ModelAndView("index");
    }

    @PostMapping("/add-patient")
    public ModelAndView addPatient(Model model, @ModelAttribute String cpf) {
        model.addAttribute("cpf", cpf);
        return new ModelAndView("add-patient");
    }
}
