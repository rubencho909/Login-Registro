package com.sena.RegistroLogin.controlador;

import com.sena.RegistroLogin.dto.AgendaDTO;
import com.sena.RegistroLogin.modelo.Agenda;
import com.sena.RegistroLogin.servicio.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador para manejar las peticiones HTTP de Agendar Servicio
 */
@RestController
@CrossOrigin
@RequestMapping("api/v1/agenda")
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Agenda>> listarAgenda() {
        List<Agenda> listarAgenda = agendaService.listarAgenda();
        return ResponseEntity.ok(listarAgenda);
    }

    @PostMapping("/save")
    public String guardarAgenda(@RequestBody AgendaDTO agendaDTO) {
        String id = agendaService.addAgenda(agendaDTO);
        return id;
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarAgenda(@PathVariable Long id) {
        boolean eliminado = agendaService.eliminarAgenda(id);
        if (eliminado) {
            return ResponseEntity.ok("Agenda eliminada exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Agenda no encontrada");
        }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<String> editarAgenda(@PathVariable Long id, @RequestBody AgendaDTO agendaDTO) {
        boolean actualizado = agendaService.editarAgenda(id, agendaDTO);
        if (actualizado) {
            return ResponseEntity.ok("Agenda actualizada exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Agenda no encontrada");
        }
    }

}
