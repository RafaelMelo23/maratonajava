package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.imprimeDivisaoDoisNumeros(20, 2);
        System.out.println("--------------------");
        double result = calculadora.divisaoDoisNumeros(20, 10);
        System.out.println(result);



    }
}
