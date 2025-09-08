package devdojo.maratona.java.javacore.Ycolecoes.test;

import devdojo.maratona.java.javacore.Ycolecoes.dominio.SWLegends;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {

    public static void main(String[] args) {

        LegendsBooksById legendsBooksByIdComparator = new LegendsBooksById();
        List<SWLegends> swLegends = new ArrayList<>(6);
        swLegends.add(new SWLegends(5L, "Darth Plagueis", 119.9));
        swLegends.add(new SWLegends(7L, "Heir To The Empire", 124.9));
        swLegends.add(new SWLegends(8L, "Dark Lord", 123));
        swLegends.add(new SWLegends(9L, "Shatterpoint", 140));
        swLegends.add(new SWLegends(1L, "Rogue Planet", 180));
        System.out.println(swLegends);

//        Collections.sort(swLegends);

        swLegends.sort(new LegendsBooksById());
        for (SWLegends swLegend : swLegends) {
            System.out.println(swLegend);
        }

        SWLegends darthPlagueis = new SWLegends(5L, "Darth Plagueis", 119.9);
        // Ele nao esta usando o equals pra encontrar

        System.out.println(Collections.binarySearch(swLegends, darthPlagueis, legendsBooksByIdComparator));
    }
}
