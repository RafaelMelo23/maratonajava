package exerciciospessoais.teste;

import exerciciospessoais.dominio.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {

        ContaBancaria contabancaria = new ContaBancaria();

        contabancaria.setNomeCliente("Rafael Melo");
        contabancaria.setNumConta("123456789012");
        contabancaria.setSaldo(12000);

        contabancaria.valor = 1384;

        contabancaria.imprimirInfoConta();
        contabancaria.realizarSaque();

    }
}
