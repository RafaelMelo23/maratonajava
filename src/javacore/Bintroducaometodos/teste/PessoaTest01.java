package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(17);
        // pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
