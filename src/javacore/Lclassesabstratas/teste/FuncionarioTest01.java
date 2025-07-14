package javacore.Lclassesabstratas.teste;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Joel", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Anakin", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
    }
}
