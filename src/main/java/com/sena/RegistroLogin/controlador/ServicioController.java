package com.sena.RegistroLogin.controlador;

import com.sena.RegistroLogin.dto.AgendaDTO;
import com.sena.RegistroLogin.dto.ServicioDTO;
import com.sena.RegistroLogin.modelo.Agenda;
import com.sena.RegistroLogin.modelo.Servicio;
import com.sena.RegistroLogin.servicio.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/servicio")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Servicio>> listarServicio() {
        List<Servicio> listarServicio = servicioService.listarServicio();
        return ResponseEntity.ok(listarServicio);
    }

    @PostMapping("/save")
    public String guardarServicio(@RequestBody ServicioDTO servicioDTO) {
        String id = servicioService.addServicio(servicioDTO);
        return id;
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarServicio(@PathVariable Long id) {
        boolean eliminado = servicioService.eliminarServicio(id);
        if (eliminado) {
            return ResponseEntity.ok("Servicio eliminado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servicio no encontrada");
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarServicio(@PathVariable Long id, @RequestBody ServicioDTO servivioDTO) {
        boolean actualizado = servicioService.editarServicio(id, servivioDTO);
        if (actualizado) {
            return ResponseEntity.ok("Servicio actualizado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Servicio no encontrado");
        }
    }

}
