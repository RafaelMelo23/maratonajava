package devdojo.maratona.java.javacore.Gassociacao.dominio.teste;

import devdojo.maratona.java.javacore.Gassociacao.dominio.dominio.Jogador;

public class JogadorTest01 {


    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Tiquinho");
        Jogador jogador2 = new Jogador("Tche Tchê");
        Jogador jogador3 = new Jogador("Eduardo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
