package com.sena.RegistroLogin.servicio.impl;

import com.sena.RegistroLogin.dto.AgendaDTO;
import com.sena.RegistroLogin.modelo.Agenda;
import com.sena.RegistroLogin.repositorio.AgendaRepositorio;
import com.sena.RegistroLogin.servicio.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    private AgendaRepositorio agendaRepositorio;

    @Override
    public String addAgenda(AgendaDTO agendaDTO) {
        Agenda agenda = new Agenda(
                agendaDTO.getId(),
                agendaDTO.getNumeroPlaca(),
                agendaDTO.getFechaAgenda(),
                agendaDTO.getTipoServicio(),
                agendaDTO.getNumeroTicket()
        );
        agendaRepositorio.save(agenda);
        return agenda.getNumeroTicket() + " Agenda Creada Exitosamente";
    }

    @Override
    public List<Agenda> listarAgenda() {
        return agendaRepositorio.findAll();
    }

    @Override
    public boolean eliminarAgenda(Long id) {
        Optional<Agenda> agenda = agendaRepositorio.findById(id);
        if(agenda.isPresent()) {
            agendaRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean editarAgenda(Long id, AgendaDTO agendaDTO) {
        Optional<Agenda> agenda = agendaRepositorio.findById(id);
        if(agenda.isPresent()) {
            Agenda agendaExistente = agenda.get();
            agendaExistente.setNumeroPlaca(agendaDTO.getNumeroPlaca());
            agendaExistente.setFechaAgenda(agendaDTO.getFechaAgenda());
            agendaExistente.setTipoServicio(agendaDTO.getTipoServicio());
            agendaExistente.setNumeroTicket(agendaDTO.getNumeroTicket());
            agendaRepositorio.save(agendaExistente);
            return true;
        } else {
            return false;
        }
    }
}
