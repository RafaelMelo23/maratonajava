package devdojo.maratona.java.javacore.ZZJcrud.test;

import devdojo.maratona.java.javacore.ZZJcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            producerMenu();
            op = Integer.parseInt(SCANNER.nextLine());

            if (op == 0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void producerMenu() {

        System.out.println("Type the number of your operation");
        System.out.println("1. Search for a producer");
        System.out.println("2. Delete a producer");
        System.out.println("3. Save a producer");
        System.out.println("4. Edit a producer");
        System.out.println(("0. Exit"));
    }
}
