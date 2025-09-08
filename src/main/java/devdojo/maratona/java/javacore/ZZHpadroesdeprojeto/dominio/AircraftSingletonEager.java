package javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {

    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private String name;
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
