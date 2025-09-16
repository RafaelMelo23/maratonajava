package devdojo.maratona.java.javacore.ZZJcrud.service;

import devdojo.maratona.java.javacore.ZZJcrud.dominio.Anime;
import devdojo.maratona.java.javacore.ZZJcrud.dominio.Producer;
import devdojo.maratona.java.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {

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
        System.out.println("Enter anime name (or empty to obtain all): ");
        String name = SCANNER.nextLine();

        List<Anime> animes = AnimeRepository.findByNamePreparedStatement(name);
        for (int i = 0; i < animes.size(); i++) {

            Anime anime = animes.get(i);
            System.out.printf("[%d] - ID: %d | %s%n", i, anime.getId(), anime.getName());
        }
    }

    private static void delete() {

        System.out.println("Type the ID of the anime to delete: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();

        if ("Y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {

        System.out.println("Type the name of the anime to save: ");
        String name = SCANNER.nextLine();

        System.out.println("Type the number of episodes: ");
        Integer episodes = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println("Type the id of the producer: ");
        Integer producerId = SCANNER.nextInt();
        SCANNER.nextLine();

        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();

        if ("Y".equalsIgnoreCase(choice)) {
            AnimeRepository.save(Anime.builder()
                    .name(name)
                    .episodes(episodes)
                    .producer(Producer.builder().id(producerId).build())
                    .build());
        }
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found " + animeFromDb);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());

        Anime animeToUpdate = Anime.builder()
                .id(animeFromDb.getId())
                .name(name)
                .producer(animeFromDb.getProducer())
                .episodes(episodes)
                .build();

        AnimeRepository.update(animeToUpdate);
    }


}
