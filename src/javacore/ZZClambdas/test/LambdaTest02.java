package javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {

    public static void main(String[] args) {

        List<String> listaNomes = List.of("William", "Sidious", "Tenebrous", "Venamis");
        List<Integer> integers = map(listaNomes, String::length);
        System.out.println(integers);

        List<String> map = map(listaNomes, (String s) -> s.toUpperCase());
        System.out.println(map);
    }


    private static <T, R>List<R> map(List<T> list, Function<T, R> function) {

        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }
}


