package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<producto> lstVacia = new ArrayList<>();

        producto pr1 = new producto("jabon", "Colgate", 3500);

        pedido p1 = new pedido("jhon", "141414", lstVacia);

        p1.detalles(pr1);

        // Primero el pedido
        System.out.println(p1);

        // Luego los productos
        for (producto e : p1.getProductos()) {
            System.out.println(e);
        }
    }
}
