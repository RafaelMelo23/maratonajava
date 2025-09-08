package devdojo.maratona.java.javacore.Npolimorfismo.test;

import devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import devdojo.maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador computador = new Computador("Alienware i9", 12000);
        Tomate tomate = new Tomate("Tomate", 10);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
