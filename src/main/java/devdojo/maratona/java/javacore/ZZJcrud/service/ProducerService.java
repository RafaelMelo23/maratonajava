package devdojo.maratona.java.javacore.ZZJcrud.service;

import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import devdojo.maratona.java.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {


        switch (op) {

            case 1 -> find();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();

            default -> throw new IllegalArgumentException("No such operation");
        }
    }

    private static void find() {
        System.out.println("Enter producer name (or empty to obtain all): ");
        String name = SCANNER.nextLine();

        List<Producer> producers = ProducerRepository.findByNamePreparedStatement(name);
        for (int i = 0; i < producers.size(); i++) {

            Producer producer = producers.get(i);
            System.out.printf("[%d] - ID: %d | %s%n", i, producer.getId(), producer.getName());
        }
    }

    private static void delete() {

        System.out.println("Type the ID of the producer to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();

        if ("Y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {

        System.out.println("Type the name of the producer to save: ");
        String name = SCANNER.nextLine();

        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();

        if ("Y".equalsIgnoreCase(choice)) {
            ProducerRepository.save(Producer.builder().name(name).build());
        }
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found " + producerFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;

        Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();

        ProducerRepository.update(producerToUpdate);
    }


}
