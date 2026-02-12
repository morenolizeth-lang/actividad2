package org.example;

import java.util.ArrayList;
import java.util.List;

public class pedido {

    private String Nmbre;
    private String Direccion;

    List<producto> productos = new ArrayList<>();

    public pedido() {
    }

    public pedido(String nmbre, String direccion, List<producto> productos) {
        Nmbre = nmbre;
        Direccion = direccion;
        this.productos = productos;
    }

    public String getNmbre() {
        return Nmbre;
    }

    public void setNmbre(String nmbre) {
        Nmbre = nmbre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "pedido{" +
                "Nmbre='" + Nmbre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", productos=" + productos +
                '}';
    }

    public void detalles(producto producto){
        this.productos.add(producto);
    }
}
