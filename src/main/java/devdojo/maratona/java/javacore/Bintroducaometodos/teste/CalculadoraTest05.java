package devdojo.maratona.java.javacore.Bintroducaometodos.teste;

import devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(numeros);
        System.out.println("Outra possível sintaxe:");
        calculadora.somaArray(new int[]{1,2,3,4,5});

        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
