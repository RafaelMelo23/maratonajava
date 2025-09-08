package devdojo.maratona.java.javacore.Oexception.runtime.test;

import devdojo.maratona.java.javacore.Oexception.exception.dominio.Funcionario;
import devdojo.maratona.java.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {

    public static void main(String[] args) throws FileNotFoundException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario(); // Nao se pode declarar uma ex mais generica do que a da super

        pessoa.salvar();
        funcionario.salvar(); // Nao pode colocar uma checked que nao foi declarada no metodo original
    }
}
