package javacore.introducaoclasses.Npolimorfismo.test;

import javacore.introducaoclasses.Npolimorfismo.dominio.Computador;
import javacore.introducaoclasses.Npolimorfismo.dominio.Tomate;
import javacore.introducaoclasses.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {

        Computador computador = new Computador("Alienware i9", 12000);
        Tomate tomate = new Tomate("Tomate", 10);

        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
