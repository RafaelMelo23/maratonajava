package exerciciospessoais.dominio;

// Implemente uma classe chamada “ContaBancária”
// que possua atributos para armazenar o número da conta,
// nome do titular e saldo. Adicione métodos para realizar depósitos e saques.

public class ContaBancaria {
    private String numConta;
    private String nomeCliente;
    private float saldo = 0;
    public float valor = 0;
    public float saque = 0;
    public float deposito = 0;

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    public String getNumConta() {
        return this.numConta;
    }

    public void realizarSaque(){
            if(valor <= getSaldo()) {
                saque = getSaldo() - valor;
                System.out.println("Saldo após o saque: "+ this.saque);
            } else {
                return;
            }
    }
    public void realizarDeposito(){
        deposito = getSaldo() + valor;
        System.out.println("Saldo após o depósito: "+ this.deposito);
    }


    public float getSaldo() {
        return this.saldo;
    }

    public void imprimirInfoConta() {
        System.out.println("Informações da Conta:");
        System.out.println("Nome Completo: "+getNomeCliente());
        System.out.println("Número da Conta: "+getNumConta());
        System.out.println("Saldo: "+getSaldo());
    }
}
