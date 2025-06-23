package javacore.introducaoclasses.Npolimorfismo.test;

import javacore.introducaoclasses.Npolimorfismo.dominio.Computador;
import javacore.introducaoclasses.Npolimorfismo.dominio.Produto;
import javacore.introducaoclasses.Npolimorfismo.dominio.Tomate;
import javacore.introducaoclasses.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto = new Computador("i5-12400", 3246);

        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2025");

        CalculadoraImposto.calcularImposto(produto);
    }
}
