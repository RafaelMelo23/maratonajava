package devdojo.maratona.java.javacore.ZZJcrud.service;

import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import devdojo.maratona.java.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {

    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {


        switch (op) {

            case 1 -> find();

            default -> throw new IllegalArgumentException("No such operation");
        }
    }

    private static void find() {
        System.out.println("Enter producer name (or empty to obtain all): ");
        String name = scanner.nextLine();

        List<Producer> producers = ProducerRepository.findByNamePreparedStatement(name);
        for (int i = 0; i < producers.size() ; i++) {

            System.out.printf("[%d] - %s%n", i, producers.get(i).getName());
        }
    }
}
