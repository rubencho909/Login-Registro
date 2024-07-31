package com.sena.RegistroLogin.repositorio;

import com.sena.RegistroLogin.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author RUBEN DARIO PEREZ
 * @since 30/07/2024
 * Archivo que extiende de JPA con los metodos CRUD
 */
@EnableJpaRepositories
@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

    Optional<Empleado> findOneByEmailAndPassword(String email, String password);
    Empleado findByEmail(String email);

}
