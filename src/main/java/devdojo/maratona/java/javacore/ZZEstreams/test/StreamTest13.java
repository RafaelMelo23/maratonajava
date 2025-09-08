package devdojo.maratona.java.javacore.ZZEstreams.test;

import devdojo.maratona.java.javacore.ZZEstreams.dominio.Category;
import devdojo.maratona.java.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest13 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)));

    public static void main(String[] args) {

        Map<Category, Long> collect = lightNovelList.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen((Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))), Optional::get)));

        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovelList.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect3);
    }
}
