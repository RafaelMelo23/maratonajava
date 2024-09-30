package javacore.introducaoclasses.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoCliente tipoPagamento;


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;

    }

    public Cliente(String nome, TipoCliente tipoPagamento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
    }
}



