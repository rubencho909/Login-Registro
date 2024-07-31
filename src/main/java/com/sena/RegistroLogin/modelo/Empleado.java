package com.sena.RegistroLogin.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @Column(name = "id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", length = 255)
    private String nombre;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
