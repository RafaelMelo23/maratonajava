package devdojo.maratona.java.javacore.ZZClambdas.service;

import devdojo.maratona.java.javacore.ZZClambdas.dominio.StarWars;

public class SWComparators {

    public static int compareByTitle(StarWars s1, StarWars s2) {

        return s1.getTitle().compareTo(s2.getTitle());
    }

    public static int compareByEpisodes(StarWars s1, StarWars s2) {

        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(StarWars s1, StarWars s2) {

        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }
}
