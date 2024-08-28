package com.sena.RegistroLogin.servicio;

import com.sena.RegistroLogin.dto.ServicioDTO;
import com.sena.RegistroLogin.modelo.Servicio;

import java.util.List;

public interface ServicioService {

    String addServicio(ServicioDTO servicioDTO);
    List<Servicio> listarServicio();
    boolean eliminarServicio(Long id);
    boolean editarServicio(Long id, ServicioDTO servicioDTO);

}
