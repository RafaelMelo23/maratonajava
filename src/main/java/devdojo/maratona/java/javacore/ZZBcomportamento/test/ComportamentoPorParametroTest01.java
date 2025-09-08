package javacore.ZZBcomportamento.test;

import javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> cars = List.of(
            new Car("Isle of Man Green", 2018),
            new Car("Sonoma Green Metallic", 2019),
            new Car("Red", 2019)
    );

    private static List<Car> filterGreenCar(List<Car> cars) {

        List<Car> greenCars = new ArrayList<>();

        for (Car car : cars) {

            if (car.getColor().toLowerCase().contains("green")) {
                greenCars.add(car);
            }
        }

        return greenCars;
    }

    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
    }
}
