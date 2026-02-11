package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<pedido> lstVacia = new ArrayList<>();

        pedido p1 = new pedido("jhon", "141414");

        producto pr1 = new producto("jhon","11111","jabon". lstVacia );
        p1.detalles(pr1);

        System.out.println(p1.toString());

    }
}