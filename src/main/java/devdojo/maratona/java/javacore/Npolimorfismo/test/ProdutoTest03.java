package devdojo.maratona.java.javacore.Npolimorfismo.test;

import devdojo.maratona.java.javacore.Npolimorfismo.dominio.Computador;
import devdojo.maratona.java.javacore.Npolimorfismo.dominio.Produto;
import devdojo.maratona.java.javacore.Npolimorfismo.dominio.Tomate;
import devdojo.maratona.java.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto = new Computador("i5-12400", 3246);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(produto);
    }
}
