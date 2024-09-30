package javacore.introducaoclasses.orientacaoobjetos71.teste;

import javacore.introducaoclasses.orientacaoobjetos71.dominio.Endereco;
import javacore.introducaoclasses.orientacaoobjetos71.dominio.Funcionario;
import javacore.introducaoclasses.orientacaoobjetos71.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Nome");
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Nome");
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------");
        funcionario.imprime();
    }
}
