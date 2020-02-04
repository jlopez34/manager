package com.globallogic.manager.model;

public class UserError {
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "UserError{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
