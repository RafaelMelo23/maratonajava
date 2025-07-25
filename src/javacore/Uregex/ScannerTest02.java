package javacore.Uregex;

import java.util.Scanner;

public class ScannerTest02 {

    public static void main(String[] args) {

        String texto = "Anakin,Obi-Wan,Tyranus,true,200";

        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
