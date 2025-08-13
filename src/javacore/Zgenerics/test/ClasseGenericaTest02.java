package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.Barco;
import javacore.Zgenerics.dominio.Carro;
import javacore.Zgenerics.service.BarcoRentavelService;
import javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {

    public static void main(String[] args) {

        BarcoRentavelService carroRentavelService = new BarcoRentavelService();

        Barco carro = carroRentavelService.retrieveAvailableBoat();
        System.out.println("Usando o barco por um mes...");
        carroRentavelService.returnRentedBoat(carro);
    }
}
