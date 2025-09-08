package devdojo.maratona.java.javacore.ZZEstreams.test;

import devdojo.maratona.java.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest10 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99), new LightNovel("Overlord", 3.99), new LightNovel("Violet Evergarden", 5.99), new LightNovel("No Game No Life", 2.99), new LightNovel("Full Metal Alchemist", 5.99), new LightNovel("Kumo Desuga", 1.99), new LightNovel("Monogatari", 4.99)));

    public static void main(String[] args) {

        System.out.println(lightNovelList.stream().count());
        System.out.println(lightNovelList.stream().collect(Collectors.counting()));

        lightNovelList.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovelList.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovelList.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovelList.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovelList.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovelList.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = lightNovelList.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String string = lightNovelList.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(string);

    }
}
