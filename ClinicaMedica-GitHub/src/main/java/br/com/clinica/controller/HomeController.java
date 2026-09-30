package br.com.clinica.controller;

import br.com.clinica.repository.ConsultaRepository;
import br.com.clinica.repository.MedicoRepository;
import br.com.clinica.repository.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PacienteRepository pacienteRepository;
    private final MedicoRepository medicoRepository;
    private final ConsultaRepository consultaRepository;

    public HomeController(PacienteRepository pacienteRepository,
                          MedicoRepository medicoRepository,
                          ConsultaRepository consultaRepository) {
        this.pacienteRepository = pacienteRepository;
        this.medicoRepository = medicoRepository;
        this.consultaRepository = consultaRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("totalPacientes", pacienteRepository.count());
        model.addAttribute("totalMedicos", medicoRepository.count());
        model.addAttribute("totalConsultas", consultaRepository.count());
        model.addAttribute("consultas", consultaRepository.findTop5ByOrderByDataHoraAsc());
        return "home";
    }
}
