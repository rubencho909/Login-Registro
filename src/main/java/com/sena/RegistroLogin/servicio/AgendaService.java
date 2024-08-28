package com.sena.RegistroLogin.servicio;


import com.sena.RegistroLogin.dto.AgendaDTO;
import com.sena.RegistroLogin.modelo.Agenda;

import java.util.List;

public interface AgendaService {

    String addAgenda(AgendaDTO agendaDTO);
    List<Agenda> listarAgenda();
    boolean eliminarAgenda(Long id);
    boolean editarAgenda(Long id, AgendaDTO agendaDTO);

}
