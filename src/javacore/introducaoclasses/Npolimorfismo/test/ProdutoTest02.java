package javacore.introducaoclasses.Npolimorfismo.test;

import javacore.introducaoclasses.Npolimorfismo.dominio.Computador;
import javacore.introducaoclasses.Npolimorfismo.dominio.Produto;
import javacore.introducaoclasses.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto = new Computador("i5-12400", 3246);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        Produto produto2 = new Tomate("Tomate Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
