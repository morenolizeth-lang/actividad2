package org.example;

public class producto {

    private String tipo;

    public producto() {
    }

    public producto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "producto{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
