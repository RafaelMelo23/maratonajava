package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.StarWars;
import javacore.ZZClambdas.service.SWComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {

    public static void main(String[] args) {

        Supplier<SWComparators> newSwComparators = SWComparators::new;
        SWComparators swComparators = newSwComparators.get();

        List<StarWars> swList = new ArrayList<>(List.of(
                new StarWars("The Mandalorian", 24),
                new StarWars("Andor", 25),
                new StarWars("The Clone Wars", 220)));


        swList.sort(swComparators::compareByEpisodesNonStatic);
        System.out.println(swList);

        BiFunction<String, Integer, StarWars> swBiFunction = (name, ep) -> new StarWars(name, ep);
        BiFunction<String, Integer, StarWars> swBiFunction2 = StarWars::new;

        System.out.println(swBiFunction.apply("Son Of Dathomir", 23));

    }
}
