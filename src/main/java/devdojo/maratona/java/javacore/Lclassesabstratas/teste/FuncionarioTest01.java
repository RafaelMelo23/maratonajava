package devdojo.maratona.java.javacore.Lclassesabstratas.teste;

import devdojo.maratona.java.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import devdojo.maratona.java.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Joel", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Anakin", 12000);
        System.out.println(desenvolvedor);
        gerente.imprime();
    }
}
