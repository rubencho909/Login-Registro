package com.sena.RegistroLogin.repositorio;

import com.sena.RegistroLogin.modelo.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepositorio extends JpaRepository<Agenda, Long> {
}
