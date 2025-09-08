package devdojo.maratona.java.javacore.ZZBcomportamento.test;

import devdojo.maratona.java.javacore.ZZBcomportamento.dominio.Car;
import devdojo.maratona.java.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    private static List<Car> cars = List.of(
            new Car("Isle of Man Green", 2018),
            new Car("Sonoma Green Metallic", 2019),
            new Car("Red", 2019)
    );

    private static List<Car> filter(List<Car> cars, CarPredicate predicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {

            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }

        return filteredCars;
    }

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
}
