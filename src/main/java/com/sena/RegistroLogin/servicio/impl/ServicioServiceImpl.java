package com.sena.RegistroLogin.servicio.impl;

import com.sena.RegistroLogin.dto.ServicioDTO;
import com.sena.RegistroLogin.modelo.Servicio;
import com.sena.RegistroLogin.repositorio.ServicioRepositorio;
import com.sena.RegistroLogin.servicio.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepositorio servicioRepositorio;

    @Override
    public String addServicio(ServicioDTO servicioDTO) {
        Servicio servicio = new Servicio(
                servicioDTO.getId(),
                servicioDTO.getTitulo(),
                servicioDTO.getDescripcion(),
                servicioDTO.getValor(),
                servicioDTO.getFechaCreacion()
        );
        servicioRepositorio.save(servicio);
        return servicio.getTitulo() + " Servicio Creado Exitosamente";
    }

    @Override
    public List<Servicio> listarServicio() {
        return servicioRepositorio.findAll();
    }

    @Override
    public boolean eliminarServicio(Long id) {
        Optional<Servicio> servicio = servicioRepositorio.findById(id);
        if(servicio.isPresent()) {
            servicioRepositorio.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean editarServicio(Long id, ServicioDTO servicioDTO) {
        Optional<Servicio> servicio = servicioRepositorio.findById(id);
        if(servicio.isPresent()) {
            Servicio servicioExistente = servicio.get();
            servicioExistente.setTitulo(servicioDTO.getTitulo());
            servicioExistente.setDescripcion(servicioDTO.getDescripcion());
            servicioExistente.setValor(servicioDTO.getValor());
            servicioExistente.setFechaCreacion(servicioDTO.getFechaCreacion());
            servicioRepositorio.save(servicioExistente);
            return true;
        } else {
            return false;
        }
    }
}
