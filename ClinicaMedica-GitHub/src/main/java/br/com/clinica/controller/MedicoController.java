package br.com.clinica.controller;

import br.com.clinica.repository.MedicoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MedicoController {

    private final MedicoRepository medicoRepository;

    public MedicoController(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @GetMapping("/medicos")
    public String listar(Model model) {
        model.addAttribute("medicos", medicoRepository.findAll());
        return "medicos";
    }
}
