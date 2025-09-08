package devdojo.maratona.java.javacore.Bintroducaometodos.teste;

import devdojo.maratona.java.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercise {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();




        funcionario.setNome("José");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{987, 1289, 1760});

        funcionario.imprime();
        System.out.println("");
        funcionario.imprimeMediaSalario();
        System.out.println("Média "+funcionario.getMedia());



    }



}

