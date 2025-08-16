package javacore.ZZClambdas.test;

import javacore.ZZClambdas.dominio.StarWars;
import javacore.ZZClambdas.service.SWComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {

    public static void main(String[] args) {
        List<StarWars> starWarsShowList = new ArrayList<>(List.of(new StarWars("The Mandalorian", 24), new StarWars("Andor", 25), new StarWars("The Clone Wars", 220)));

        // Collections.sort(starWarsShowList, (sw1,sw2) -> sw1.getTitle().compareTo(sw2.getTitle()));
        starWarsShowList.sort(SWComparators::compareByTitle);
        System.out.println(starWarsShowList);

        starWarsShowList.sort(SWComparators::compareByEpisodes);
        System.out.println(starWarsShowList);
    }
}
