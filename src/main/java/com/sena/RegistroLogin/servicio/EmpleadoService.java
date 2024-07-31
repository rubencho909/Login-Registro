package com.sena.RegistroLogin.servicio;

import com.sena.RegistroLogin.dto.EmpleadoDTO;
import com.sena.RegistroLogin.dto.LoginDTO;
import com.sena.RegistroLogin.respuestas.LoginRespuestas;

public interface EmpleadoService {

    String addEmpleado(EmpleadoDTO empleadoDTO);
    LoginRespuestas loginEmpleado(LoginDTO loginDTO);

}
