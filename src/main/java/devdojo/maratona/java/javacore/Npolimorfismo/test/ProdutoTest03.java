package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto = new Computador("i5-12400", 3246);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(produto);
    }
}
