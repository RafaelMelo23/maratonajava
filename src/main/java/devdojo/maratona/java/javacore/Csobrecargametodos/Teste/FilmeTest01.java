package devdojo.maratona.java.javacore.Csobrecargametodos.Teste;

import devdojo.maratona.java.javacore.Csobrecargametodos.Dominio.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {

        Filme filme = new Filme();
        filme.init("Nome do filme", "Tipo do filme", 22);
        filme.init("Nome do filme", "Tipo do filme", 22, "Ação");
        filme.imprime();
    }
}
