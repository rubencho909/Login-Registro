package com.sena.RegistroLogin.respuestas;

public class LoginRespuestas {

    String mensaje;
    Boolean estado;

    public LoginRespuestas() {
    }

    public LoginRespuestas(String mensaje, Boolean estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "LoginRespuestas{" +
                "mensaje='" + mensaje + '\'' +
                ", estado=" + estado +
                '}';
    }
}
