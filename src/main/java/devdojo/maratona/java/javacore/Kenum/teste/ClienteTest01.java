package devdojo.maratona.java.javacore.Kenum.teste;

import devdojo.maratona.java.javacore.Kenum.dominio.Cliente;
import devdojo.maratona.java.javacore.Kenum.dominio.TipoCliente;
import devdojo.maratona.java.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Davi", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
