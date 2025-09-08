package devdojo.maratona.java.javacore.ZZEstreams.test;

import devdojo.maratona.java.javacore.ZZEstreams.dominio.Category;
import devdojo.maratona.java.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest11 {

    private static List<LightNovel> lightNovelList = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game No Life", 2.99, Category.FANTASY),
            new LightNovel("Full Metal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo Desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE)));

    public static void main(String[] args) {

        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();

        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovelList) {
            switch (lightNovel.getCategory()) {

                case FANTASY -> fantasy.add(lightNovel);
                case DRAMA -> drama.add(lightNovel);
                case ROMANCE -> romance.add(lightNovel);
            }
        }

        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        System.out.println(categoryLightNovelMap);


        Map<Category, List<LightNovel>> categoryNovelMap = lightNovelList.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(categoryNovelMap);
    }
}
