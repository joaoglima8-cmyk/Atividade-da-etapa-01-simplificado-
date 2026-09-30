package br.com.clinica.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dataHora;

    @Column(nullable = false)
    private String status;

    private String observacoes;

    @ManyToOne(optional = false)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "medico_id")
    private Medico medico;

    public Consulta() {
    }

    public Consulta(LocalDateTime dataHora, String status, String observacoes,
                    Paciente paciente, Medico medico) {
        this.dataHora = dataHora;
        this.status = status;
        this.observacoes = observacoes;
        this.paciente = paciente;
        this.medico = medico;
    }

    public Long getId() { return id; }
    public LocalDateTime getDataHora() { return dataHora; }
    public String getStatus() { return status; }
    public String getObservacoes() { return observacoes; }
    public Paciente getPaciente() { return paciente; }
    public Medico getMedico() { return medico; }

    public void setId(Long id) { this.id = id; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public void setStatus(String status) { this.status = status; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setMedico(Medico medico) { this.medico = medico; }
}
