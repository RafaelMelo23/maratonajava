package javacore.introducaoclasses.orientacaoobjetos71.dominio;

public class Funcionario extends Pessoa {
    static {
        System.out.println("Dentro do bloco estático de funcionário");
    }

    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");

    }

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
