package javacore.Gassociacao.dominio.teste;

import javacore.Gassociacao.dominio.dominio.Jogador;
import javacore.Gassociacao.dominio.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Luis Henrique");

        Time time = new Time("Botafogo");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
