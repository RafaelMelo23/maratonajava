package devdojo.maratona.java.javacore.ZZEstreams.test;

import devdojo.maratona.java.javacore.ZZEstreams.dominio.Category;
import devdojo.maratona.java.javacore.ZZEstreams.dominio.LightNovel;
import devdojo.maratona.java.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static devdojo.maratona.java.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static devdojo.maratona.java.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest14 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)));

    public static void main(String[] args) {

        Map<Category, DoubleSummaryStatistics> collect = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, Set<Promotion>> collect1 = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest14::getNovelPromotionFunction, toSet())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest14::getNovelPromotionFunction, toCollection(LinkedHashSet::new))));

        System.out.println(collect2);
    }

    private static Promotion getNovelPromotionFunction(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}

