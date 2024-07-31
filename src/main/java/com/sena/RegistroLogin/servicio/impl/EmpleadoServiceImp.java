package com.sena.RegistroLogin.servicio.impl;

import com.sena.RegistroLogin.dto.EmpleadoDTO;
import com.sena.RegistroLogin.dto.LoginDTO;
import com.sena.RegistroLogin.modelo.Empleado;
import com.sena.RegistroLogin.repositorio.EmpleadoRepositorio;
import com.sena.RegistroLogin.respuestas.LoginRespuestas;
import com.sena.RegistroLogin.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author RUBEN DARIO PEREZ
 * Archivo que implementa los metodos del servicio
 */
@Service
public class EmpleadoServiceImp implements EmpleadoService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public String addEmpleado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = new Empleado(
                empleadoDTO.getId(),
                empleadoDTO.getNombre(),
                empleadoDTO.getEmail(),
                this.passwordEncoder.encode(empleadoDTO.getPassword())
        );
        empleadoRepositorio.save(empleado);
        return  empleado.getNombre();
    }

    @Override
    public LoginRespuestas loginEmpleado(LoginDTO loginDTO) {
        String msg;
        Empleado empleado = empleadoRepositorio.findByEmail(loginDTO.getEmail());
        if(empleado != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = empleado.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if(isPwdRight) {
                Optional<Empleado> emp = empleadoRepositorio.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (emp.isPresent()) {
                    return new LoginRespuestas("Login Success", true);
                } else {
                    return new LoginRespuestas("Login Failed", false);
                }
            } else {
                return new LoginRespuestas("password Not Match", false);
            }
        } else {
            return new LoginRespuestas("Email not exits", false);
        }
    }

}
