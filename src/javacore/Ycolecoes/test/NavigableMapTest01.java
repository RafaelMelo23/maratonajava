package javacore.Ycolecoes.test;


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {

    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("D", "Letra D");
        map.put("C", "Letra C");
        map.put("E", "Letra E");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("C").remove("A")); // modifica a fonte original
        System.out.println(map);
        System.out.println();

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.ceilingKey("C"));
    }
}
