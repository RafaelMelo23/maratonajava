package javacore.introducaoclasses.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo pessoa");
    }

    public abstract void calculaBonus();

}
