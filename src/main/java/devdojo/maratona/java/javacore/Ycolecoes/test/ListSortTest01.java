package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {

        List<String> swLegends = new ArrayList<>(6);
        swLegends.add("Darth Plagueis");
        swLegends.add("Heir To The Empire");
        swLegends.add("Dark Lord");
        swLegends.add("Shatterpoint");
        swLegends.add("Rogue Planet");

        Collections.sort(swLegends);

        for(String swLegend : swLegends) {

            System.out.println(swLegend);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(1.0);
        dinheiros.add(100.21);
        dinheiros.add(23.1);
        dinheiros.add(21.21);

        Collections.sort(dinheiros);

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
    }
}
