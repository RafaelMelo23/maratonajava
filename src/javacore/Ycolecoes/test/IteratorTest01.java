package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.SWLegends;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {

        List<SWLegends> swLegends = new ArrayList<>(6);
        swLegends.add(new SWLegends(5L, "Darth Plagueis", 119.9, 0));
        swLegends.add(new SWLegends(1L, "Heir To The Empire", 124.9, 2));
        swLegends.add(new SWLegends(4L, "Dark Lord", 123, 3));
        swLegends.add(new SWLegends(3L, "Shatterpoint", 140, 0));
        swLegends.add(new SWLegends(2L, "Rogue Planet", 180, 5));

        Iterator<SWLegends> booksIterator = swLegends.iterator(); // ele "checa" antes de fazer

        // Imperativo
        while (booksIterator.hasNext()) {

            if (booksIterator.next().getQuantidade() == 0) {
                booksIterator.remove();
            }
        }
        System.out.println(swLegends);

        // Funcional
        // swLegends.removeIf();
    }
}
