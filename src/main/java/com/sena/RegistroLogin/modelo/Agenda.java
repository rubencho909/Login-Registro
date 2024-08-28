package com.sena.RegistroLogin.modelo;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "agendas")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numeroPlaca;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaAgenda;

    private String tipoServicio;

    private String numeroTicket;

    public Agenda() {
    }

    public Agenda(Long id, String numeroPlaca, LocalDate fechaAgenda, String tipoServicio, String numeroTicket) {
        this.id = id;
        this.numeroPlaca = numeroPlaca;
        this.fechaAgenda = fechaAgenda;
        this.tipoServicio = tipoServicio;
        this.numeroTicket = numeroTicket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public LocalDate getFechaAgenda() {
        return fechaAgenda;
    }

    public void setFechaAgenda(LocalDate fechaAgenda) {
        this.fechaAgenda = fechaAgenda;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(String numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", numeroPlaca='" + numeroPlaca + '\'' +
                ", fechaAgenda=" + fechaAgenda +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", numeroTicket='" + numeroTicket + '\'' +
                '}';
    }
}
