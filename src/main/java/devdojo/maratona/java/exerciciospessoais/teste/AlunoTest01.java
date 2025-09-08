package exerciciospessoais.teste;

import exerciciospessoais.dominio.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {

    Aluno aluno01 = new Aluno();

        aluno01.setNameAluno("Rafael Melo");
        aluno01.setMatricula("4718319");
        aluno01.setGradeA1(new double[]{3.8, 3.5, 5.0, 5.0});
        aluno01.setGradeA2(new double[]{4.3, 5.0, 4.0, 5.0});

        aluno01.calculoAvg();
        aluno01.printInfo();




    }

}
