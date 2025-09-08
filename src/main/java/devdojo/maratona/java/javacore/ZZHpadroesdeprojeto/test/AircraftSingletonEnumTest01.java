package devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;
import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {

    public static void main(String[] args) {

        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {

        System.out.println(AircraftSingletonEnum.INSTANCE);
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
