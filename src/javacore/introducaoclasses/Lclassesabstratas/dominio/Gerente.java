package javacore.introducaoclasses.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
