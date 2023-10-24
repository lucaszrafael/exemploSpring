package br.gov.sp.fatec.springboot3app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_empregado")
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "emp_nome_completo")
    private String nome;

    @Column(name = "emp_ctps")
    private Long ctps;

    @Column(name = "emp_email")
    private String email;

    @Column(name = "emp_data_hora_cadastro")
    private LocalDateTime dataHoraCadastro;

    @Column(name = "emp_carga_horaria")
    private Float cargaHoraria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCtps() {
        return ctps;
    }

    public void setCtps(Long ctps) {
        this.ctps = ctps;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public Float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
}

