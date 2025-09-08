package devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

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
