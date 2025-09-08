package devdojo.maratona.java.javacore.Ycolecoes.test;

import devdojo.maratona.java.javacore.Ycolecoes.dominio.SWLegends;
import devdojo.maratona.java.javacore.Ycolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneComparator implements Comparator<SmartPhone> {

    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {

        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class SWLegendsPrecoComparator implements Comparator<SWLegends> {

    @Override
    public int compare(SWLegends o1, SWLegends o2) {

        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {

        NavigableSet<SmartPhone> smartphone = new TreeSet<>(new SmartPhoneComparator());
        smartphone.add(new SmartPhone("123", "Nokia"));

        NavigableSet<SWLegends> legendsBooks = new TreeSet<>(new SWLegendsPrecoComparator()); // a cada insercao o treeset reordena a colecao baseado ou no compareTo, ou no compare passado como param
        legendsBooks.add(new SWLegends(5L, "Darth Plagueis", 119.9, 0));
        legendsBooks.add(new SWLegends(1L, "Heir To The Empire", 124.9, 2));
        legendsBooks.add(new SWLegends(4L, "Dark Lord", 123, 3));
        legendsBooks.add(new SWLegends(3L, "Shatterpoint", 140, 0));
        legendsBooks.add(new SWLegends(2L, "Rogue Planet", 180, 5));

        for (SWLegends legends : legendsBooks) {
            System.out.println(legends);
        }

        SWLegends heirToTheEmpire = new SWLegends(1L, "Heir To The Empire", 120, 2);

        System.out.println("----------");
        System.out.println(legendsBooks.lower(heirToTheEmpire)); // 120 reais
        System.out.println(legendsBooks.floor(heirToTheEmpire));
        System.out.println(legendsBooks.higher(heirToTheEmpire));
        System.out.println(legendsBooks.ceiling(heirToTheEmpire));
        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("-----");
        System.out.println(legendsBooks.size());
        System.out.println(legendsBooks.pollFirst()); // encontra e remove logo o primeiro (tem tambem o pollLast)
        System.out.println(legendsBooks.size());
    }
}
