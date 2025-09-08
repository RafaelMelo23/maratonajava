package javacore.ZZHpadroesdeprojeto.test;

import javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {

    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {

        Aircraft aircraft = new Aircraft("787");
        System.out.println(aircraft.bookSeat(seat));
    }
}
