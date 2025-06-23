package javacore.introducaoclasses.Npolimorfismo.servico;

import javacore.introducaoclasses.Npolimorfismo.dominio.Produto;
import javacore.introducaoclasses.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Maneira 1
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }

        // Maneira 2
        System.out.println(((Tomate) produto).getDataValidade());

        // Maneira 3
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
        }

    }
}
