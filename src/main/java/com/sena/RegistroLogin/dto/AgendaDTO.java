package com.sena.RegistroLogin.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class AgendaDTO {

    private Long id;
    private String numeroPlaca;
    private LocalDate fechaAgenda;
    private String tipoServicio;
    private String numeroTicket;

    public AgendaDTO() {
    }

    public AgendaDTO(Long id, String numeroPlaca, LocalDate fechaAgenda, String tipoServicio, String numeroTicket) {
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
        return "AgendaDTO{" +
                "id=" + id +
                ", numeroPlaca='" + numeroPlaca + '\'' +
                ", fechaAgenda=" + fechaAgenda +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", numeroTicket='" + numeroTicket + '\'' +
                '}';
    }
}
