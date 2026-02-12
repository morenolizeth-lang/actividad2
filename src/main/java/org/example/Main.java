package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<producto> lstVacia = new ArrayList<>();

        producto pr1 = new producto("jabon");
        producto pr2 = new producto("shampoo");
        producto pr3 = new producto("crema");

        pedido p1 = new pedido("jhon", "141414", lstVacia);

        p1.detalles(pr1);
        p1.detalles(pr2);
        p1.detalles(pr3);

        System.out.println(p1.toString());
    }
}
