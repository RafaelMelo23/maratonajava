package devdojo.maratona.java.javacore.ZZJcrud.test;

import devdojo.maratona.java.javacore.ZZJcrud.service.AnimeService;
import devdojo.maratona.java.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            switch (op) {
                case 1 ->  {
                    producerMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.buildMenu(op);
                }
                case 2 -> {
                    animeMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.buildMenu(op);
                }
            }
            if (op == 0) break;
        }
    }

    private static void menu() {

        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Anime");
        System.out.println(("0. Exit"));
        System.out.println();
    }

    private static void producerMenu() {

        System.out.println("Type the number of your operation");
        System.out.println("1. Search for a producer");
        System.out.println("2. Delete a producer");
        System.out.println("3. Save a producer");
        System.out.println("4. Edit a producer");
        System.out.println(("9. Go Back"));
        System.out.println();
    }

    private static void animeMenu() {

        System.out.println("Type the number of your operation");
        System.out.println("1. Search for an anime");
        System.out.println("2. Delete an anime");
        System.out.println("3. Save a anime");
        System.out.println("4. Edit an anime");
        System.out.println(("9. Go Back"));
        System.out.println();
    }
}
