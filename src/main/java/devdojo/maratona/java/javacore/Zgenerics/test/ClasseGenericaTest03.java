package devdojo.maratona.java.javacore.Zgenerics.test;

import devdojo.maratona.java.javacore.Zgenerics.dominio.Barco;
import devdojo.maratona.java.javacore.Zgenerics.dominio.Carro;
import devdojo.maratona.java.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {

    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW M3 E92"), new Carro("Audi RS6 Avant")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.retrieveAvailableObject();
        System.out.println("Usando o carro por um mes...");
        rentalService.returnRentedObject(carro);

        System.out.println("--------");

        RentalService<Barco> rentalServiceBoat = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBoat.retrieveAvailableObject();
        System.out.println("Usando o barco por um mes...");
        rentalServiceBoat.returnRentedObject(barco);
    }
}
