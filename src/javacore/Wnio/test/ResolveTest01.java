package javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {

    public static void main(String[] args) {

        Path dir = Paths.get("/home/teste");
        Path arquivo = Paths.get("/test/arquivo.txt");

        Path resolve = dir.resolve(arquivo);

        System.out.println(resolve);

        Path absoluto = Paths.get("/home/teste");
        Path relativo = Paths.get("test");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("6 " + file.resolve(relativo));
        // voce nao pode resolver do relativo pro absoluto, ele vai entregar apenas o absoluto
    }
}
