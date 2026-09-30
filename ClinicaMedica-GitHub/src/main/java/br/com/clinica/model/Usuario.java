package br.com.clinica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String usuario;

    @Column(nullable = false)
    private String senha;

    private String perfil;

    public Usuario() {
    }

    public Usuario(String usuario, String senha, String perfil) {
        this.usuario = usuario;
        this.senha = senha;
        this.perfil = perfil;
    }

    public Long getId() { return id; }
    public String getUsuario() { return usuario; }
    public String getSenha() { return senha; }
    public String getPerfil() { return perfil; }

    public void setId(Long id) { this.id = id; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setPerfil(String perfil) { this.perfil = perfil; }
}
