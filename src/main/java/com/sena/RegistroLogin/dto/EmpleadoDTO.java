package com.sena.RegistroLogin.dto;

/**
 * @author RUBEN DARIO PEREZ
 * @since 30/07/2024
 * Archivo utilizado para manejar la informacion del Empleado
 */
public class EmpleadoDTO {

    private int id;
    private String nombre;
    private String tipoIdentificacion;
    private String identificacion;
    private String email;
    private String password;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(int id, String nombre, String tipoIdentificacion, String identificacion, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.email = email;
        this.password = password;
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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
