package javacore.introducaoclasses.Oexception.runtime.test;

import javacore.introducaoclasses.Oexception.exception.dominio.Funcionario;
import javacore.introducaoclasses.Oexception.exception.dominio.LoginInvalidoException;
import javacore.introducaoclasses.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaExceptionTest01 {

    public static void main(String[] args) throws FileNotFoundException {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario(); // Nao se pode declarar uma ex mais generica do que a da super

        pessoa.salvar();
        funcionario.salvar(); // Nao pode colocar uma checked que nao foi declarada no metodo original
    }
}
