package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.SWLegends;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        Set<SWLegends> swLegends = new HashSet<>(); // Nao permite elementos duplicados, nem mantem a ordem de insercao
        //  new LinkedHashSet<>(); <- mantem a ordem de insercao.

        swLegends.add(new SWLegends(5L, "Darth Plagueis", 119.9, 0));
        swLegends.add(new SWLegends(1L, "Heir To The Empire", 124.9, 2));
        swLegends.add(new SWLegends(4L, "Dark Lord", 123, 3));
        swLegends.add(new SWLegends(3L, "Shatterpoint", 140, 0));
        swLegends.add(new SWLegends(2L, "Rogue Planet", 180, 5));
    }
}
