package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;
import javacore.Ycolecoes.dominio.SWLegends;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest02 {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        System.out.println(consumidor1);

        SWLegends legendsBook1 = new SWLegends(5L, "Darth Plagueis", 119.9);
        SWLegends legendsBook2 = new SWLegends(7L, "Heir To The Empire", 124.9);
        SWLegends legendsBook3 = new SWLegends(8L, "Dark Lord", 123);
        SWLegends legendsBook4 = new SWLegends(9L, "Shatterpoint", 140);
        SWLegends legendsBook5 = new SWLegends(1L, "Rogue Planet", 180);

        List<SWLegends> legendsConsumidor1 = List.of(legendsBook1, legendsBook2, legendsBook3);
        List<SWLegends> legendsConsumidor2 = List.of(legendsBook4, legendsBook5);

        Map<Consumidor, List<SWLegends>> consumidorLegendsBooksMap = new HashMap<>();
        consumidorLegendsBooksMap.put(consumidor1, legendsConsumidor1);
        consumidorLegendsBooksMap.put(consumidor2, legendsConsumidor2);

        for (Map.Entry<Consumidor, List<SWLegends>> entry : consumidorLegendsBooksMap.entrySet()) {

            System.out.println();
            System.out.println(entry.getKey().getNome());

            for (SWLegends swLegends : entry.getValue()) {
                System.out.println(swLegends.getNome());
            }
        }

    }
}
