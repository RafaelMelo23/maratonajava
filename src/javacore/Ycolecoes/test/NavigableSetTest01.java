package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.SWLegends;
import javacore.Ycolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {

        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {

        NavigableSet<SmartPhone> smartphone = new TreeSet<>(new SmartPhoneComparator());
        smartphone.add(new SmartPhone("123", "Nokia"));

        NavigableSet<SWLegends> legendsBooks = new TreeSet<>(); // a cada insercao o treeset reordena a colecao baseado ou no compareTo, ou no compare passado como param
        legendsBooks.add(new SWLegends(5L, "Darth Plagueis", 119.9, 0));
        legendsBooks.add(new SWLegends(1L, "Heir To The Empire", 124.9, 2));
        legendsBooks.add(new SWLegends(4L, "Dark Lord", 123, 3));
        legendsBooks.add(new SWLegends(3L, "Shatterpoint", 140, 0));
        legendsBooks.add(new SWLegends(2L, "Rogue Planet", 180, 5));

        for (SWLegends legends : legendsBooks) {
            System.out.println(legends);
        }
    }
}
