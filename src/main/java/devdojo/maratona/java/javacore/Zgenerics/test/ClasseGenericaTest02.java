package devdojo.maratona.java.javacore.Zgenerics.test;

import devdojo.maratona.java.javacore.Zgenerics.dominio.Barco;
import devdojo.maratona.java.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {

    public static void main(String[] args) {

        BarcoRentavelService carroRentavelService = new BarcoRentavelService();

        Barco carro = carroRentavelService.retrieveAvailableBoat();
        System.out.println("Usando o barco por um mes...");
        carroRentavelService.returnRentedBoat(carro);
    }
}
