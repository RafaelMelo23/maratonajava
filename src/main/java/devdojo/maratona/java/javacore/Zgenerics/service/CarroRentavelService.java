package devdojo.maratona.java.javacore.Zgenerics.service;

import devdojo.maratona.java.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {

    private List<Carro> carrosDisponiveis = new ArrayList<Carro>(List.of(new Carro("BMW M3 E92"), new Carro("Audi RS6 Avant")));

    public Carro retrieveAvailableCar() {
        System.out.println("Buscando carro disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros dsponiveis para alugar");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void returnRentedCar(Carro carro) {

        System.out.println("Devolvendo carro: " + carro);
        carrosDisponiveis.add(carro);

        System.out.println("Carros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
    }
}
