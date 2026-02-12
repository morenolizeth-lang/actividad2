package org.example;

public class producto {

    private String tipo;
    private String marca;
    private double precio;

    public producto() {
    }

    public producto(String tipo, String marca, double precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void detalles() {
        System.out.println("Marca: " + marca + " | Precio: " + precio);
    }

    @Override
    public String toString() {
        return "producto{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
