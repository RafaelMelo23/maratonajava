package devdojo.maratona.java.javacore.Ycolecoes.test;

import devdojo.maratona.java.javacore.Ycolecoes.dominio.SWLegends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LegendsBooksById implements Comparator<SWLegends> {

    @Override
    public int compare(SWLegends book1, SWLegends book2) {
        return book1.getId().compareTo(book2.getId());
    }
}
public class LegendsSortTest01 {

    public static void main(String[] args) {

        List<SWLegends> swLegends = new ArrayList<>(6);
        swLegends.add(new SWLegends(5L, "Darth Plagueis", 119.9));
        swLegends.add(new SWLegends(7L, "Heir To The Empire", 124.9));
        swLegends.add(new SWLegends(8L, "Dark Lord", 123));
        swLegends.add(new SWLegends(9L, "Shatterpoint", 140));
        swLegends.add(new SWLegends(1L, "Rogue Planet", 180));
        System.out.println(swLegends);

        for (SWLegends swLegend : swLegends) {
            System.out.println(swLegend);
        }

        Collections.sort(swLegends);
        System.out.println("---------");

        for (SWLegends swLegend : swLegends) {
            System.out.println(swLegend);
        }

        Collections.sort(swLegends, new LegendsBooksById());
        System.out.println("---------");

        for (SWLegends swLegend : swLegends) {
            System.out.println(swLegend);
        }
    }
}
