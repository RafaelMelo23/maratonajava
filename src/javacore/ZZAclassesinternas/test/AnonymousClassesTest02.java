package javacore.ZZAclassesinternas.test;

import javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {

    public static void main(String[] args) {

        List<Carro> carroList = new ArrayList<>(List.of(new Carro("VW Golf R32 2004"), new Carro("Ford Focus RS 2017")));

        carroList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));

        carroList.sort(new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(carroList);
    }
}