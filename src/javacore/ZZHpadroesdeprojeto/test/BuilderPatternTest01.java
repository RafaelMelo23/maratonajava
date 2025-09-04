package javacore.ZZHpadroesdeprojeto.test;

import javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder()
                .firstName("William")
                .lastName("Suane")
                .username("viradonojiraya")
                .email("william.suane@devdojo.academy")
                .build();

        System.out.println(person);
    }
}
