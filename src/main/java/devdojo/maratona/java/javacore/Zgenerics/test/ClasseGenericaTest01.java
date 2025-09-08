package devdojo.maratona.java.javacore.Zgenerics.test;

import devdojo.maratona.java.javacore.Zgenerics.dominio.Carro;
import devdojo.maratona.java.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {

    public static void main(String[] args) {

        CarroRentavelService carroRentavelService = new CarroRentavelService();

        Carro carro = carroRentavelService.retrieveAvailableCar();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.returnRentedCar(carro);
    }
}
