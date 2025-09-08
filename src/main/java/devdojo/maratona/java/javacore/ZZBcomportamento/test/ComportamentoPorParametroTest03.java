package devdojo.maratona.java.javacore.ZZBcomportamento.test;

import devdojo.maratona.java.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {

    private static List<Car> cars = List.of(
            new Car("Isle of Man Green", 2018),
            new Car("Sonoma Green Metallic", 2019),
            new Car("Vogue Red Metallic", 2019)
    );

    public static void main(String[] args) {

        //List<Car> greenCars = filter(cars, new CarPredicate() {
        //
        //    @Override
        //    public boolean test(Car car) {
        //
        //        return car.getColor().toLowerCase().contains("green");
        //    }
        //});

        List<Car> greenCars = filter(cars, car -> car.getColor().toLowerCase().contains("green"));
        List<Car> redCars = filter(cars, car -> car.getColor().toLowerCase().contains("red"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);

        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }
}
