package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.Category;
import javacore.ZZEstreams.dominio.LightNovel;
import javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest12 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)));

    public static void main(String[] args) {

        Map<Promotion, List<LightNovel>> promotionLightNovel = lightNovelList.stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));

        System.out.println(promotionLightNovel);
        System.out.println();
        System.out.println("----------");
        System.out.println();

        Map<Category, Map<Promotion, List<LightNovel>>> collection = lightNovelList.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE)));

        System.out.println(collection);
    }
}
