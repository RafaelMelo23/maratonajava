package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.StarWars;
import javacore.ZZClambdas.service.SWComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {

    public static void main(String[] args) {

        SWComparators comparator = new SWComparators();
        List<StarWars> starWarsShowList = new ArrayList<>(List.of(new StarWars("The Mandalorian", 24), new StarWars("Andor", 25), new StarWars("The Clone Wars", 220)));

        starWarsShowList.sort(comparator::compareByEpisodesNonStatic);
        starWarsShowList.sort((sw1, sw2) -> comparator.compareByEpisodesNonStatic(sw1, sw2));
        System.out.println(starWarsShowList);
    }
}
