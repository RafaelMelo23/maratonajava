package javacore.Zgenerics;

import javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {

    public static void main(String[] args) {

        // Type erasure
        List<String> lista = new ArrayList<>();

        lista.add("Fives");
        lista.add("Fives");

        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Ventress"));

        for (Object s : lista) {
            System.out.println(s);
        }
    }

    private static void add(List lista, Consumidor consumidor) {

        lista.add(consumidor);
    }
}
