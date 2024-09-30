package javacore.introducaoclasses.Bintroducaometodos.teste;

import javacore.introducaoclasses.Bintroducaometodos.dominio.Estudante;
import javacore.introducaoclasses.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Rafael";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "João";
        estudante02.idade = 19;
        estudante02.sexo = 'M';
        System.out.println("");
        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
        System.out.println("");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}

