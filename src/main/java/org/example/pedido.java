package org.example;

import java.util.ArrayList;
import java.util.List;

public class pedido {
    private String Nmbre;
    private String Direccion;

    List<producto> productos =new ArrayList<>();

    public pedido() {
    }

    public pedido(String nmbre, String direccion) {
        Nmbre = nmbre;
        Direccion = direccion;
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
                '}';
    }
    public void detalles(producto productos){
        this.productos.add(productos);
    }

}
