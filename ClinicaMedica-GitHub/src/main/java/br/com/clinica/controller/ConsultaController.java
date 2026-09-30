package br.com.clinica.controller;

import br.com.clinica.repository.ConsultaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsultaController {

    private final ConsultaRepository consultaRepository;

    public ConsultaController(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @GetMapping("/consultas")
    public String listar(Model model) {
        model.addAttribute("consultas", consultaRepository.findAll());
        return "consultas";
    }
}
