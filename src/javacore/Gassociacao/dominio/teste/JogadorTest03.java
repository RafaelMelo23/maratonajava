package javacore.Gassociacao.dominio.teste;

import javacore.Gassociacao.dominio.dominio.Jogador;
import javacore.Gassociacao.dominio.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};
        jogador2.setTime(time);
        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("------ Jogador -----");
        jogador.imprime();

        System.out.println("------ Time -----");

        time.imprime();
    }
}
