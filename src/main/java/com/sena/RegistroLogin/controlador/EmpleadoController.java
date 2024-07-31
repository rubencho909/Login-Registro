package com.sena.RegistroLogin.controlador;

import com.sena.RegistroLogin.dto.EmpleadoDTO;
import com.sena.RegistroLogin.dto.LoginDTO;
import com.sena.RegistroLogin.respuestas.LoginRespuestas;
import com.sena.RegistroLogin.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/save")
    public String guardarEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
        String id = empleadoService.addEmpleado(empleadoDTO);
        return id;
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginEmpleado(@RequestBody LoginDTO loginDTO) {
        LoginRespuestas loginRespuestas = empleadoService.loginEmpleado(loginDTO);
        return ResponseEntity.ok(loginRespuestas);
    }

}
