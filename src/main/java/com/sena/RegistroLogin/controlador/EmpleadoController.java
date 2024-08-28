package com.sena.RegistroLogin.controlador;

import com.sena.RegistroLogin.dto.EmpleadoDTO;
import com.sena.RegistroLogin.dto.LoginDTO;
import com.sena.RegistroLogin.modelo.Empleado;
import com.sena.RegistroLogin.respuestas.LoginRespuestas;
import com.sena.RegistroLogin.servicio.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author RUBEN DARIO PEREZ
 * @since 30/07/2024
 * Archivo que contiene los metodos HTTP
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    /**
     * @author RUBEN DARIO PEREZ
     * @since 30/07/2024
     * Metodo que permite registrar un Empleado en BD
     * @param empleadoDTO
     * @return
     */
    @PostMapping("/save")
    public String guardarEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
        String id = empleadoService.addEmpleado(empleadoDTO);
        return id;
    }

    /**
     * @author RUBEN DARIO PEREZ
     * @since 30/07/2024
     * Metodo POST que permite validar un Empleado
     * @param loginDTO
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity<?> loginEmpleado(@RequestBody LoginDTO loginDTO) {
        LoginRespuestas loginRespuestas = empleadoService.loginEmpleado(loginDTO);
        return ResponseEntity.ok(loginRespuestas);
    }

    /**
     * @author RUBEN DARIO PEREZ
     * @since 22/08/2024
     * Metodo que permite listar todos los empleados.
     * @return
     */
    @GetMapping("/listar")
    public ResponseEntity<List<Empleado>> listarEmpleados() {
        List<Empleado> listaEmpleados = empleadoService.listarEmpleados();
        return ResponseEntity.ok(listaEmpleados);
    }

    /**
     * @author RUBEN DARIO PEREZ
     * @since 22/08/2024
     * Metodo que permite eliminar un empleado por ID.
     * @return
     */
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarEmpleado(@PathVariable Integer id) {
        boolean eliminado = empleadoService.eliminarEmpleado(id);
        if (eliminado) {
            return ResponseEntity.ok("Empleado eliminado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empleado no encontrado");
        }
    }

    /**
     * @author RUBEN DARIO PEREZ
     * @since 22/08/2024
     * Metodo que edita un empleado
     * @param id
     * @param empleadoDTO
     * @return
     */
    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarEmpleado(@PathVariable Integer id, @RequestBody EmpleadoDTO empleadoDTO) {
        boolean actualizado = empleadoService.editarEmpleado(id, empleadoDTO);
        if (actualizado) {
            return ResponseEntity.ok("Empleado actualizado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empleado no encontrado");
        }
    }



}
