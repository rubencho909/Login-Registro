package com.sena.RegistroLogin.servicio;

import com.sena.RegistroLogin.dto.EmpleadoDTO;
import com.sena.RegistroLogin.dto.LoginDTO;
import com.sena.RegistroLogin.respuestas.LoginRespuestas;

/**
 * @author RUBEN DARIO PEREZ
 * @since 30/07/2024
 * Archivo utilizado para crear los marcos de los metodos
 */
public interface EmpleadoService {

    String addEmpleado(EmpleadoDTO empleadoDTO);
    LoginRespuestas loginEmpleado(LoginDTO loginDTO);

}
