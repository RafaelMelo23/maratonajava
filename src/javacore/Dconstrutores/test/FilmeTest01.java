package javacore.Dconstrutores.test;

import javacore.Dconstrutores.Dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {

        Filme filme = new Filme("Nome do filme", "TV", 22, "Heróis", "DC Comics");
        filme.imprime();

    }
}
