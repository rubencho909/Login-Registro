package com.sena.RegistroLogin.dto;

/**
 * @author RUBEN DARIO PEREZ
 * @since 30/07/2024
 * Archivo utilizado para manejar la informacion del Empleado
 */
public class EmpleadoDTO {

    private int id;
    private String nombre;
    private String email;
    private String password;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int id, String password, String email, String nombre) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
