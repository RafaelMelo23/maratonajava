package exerciciospessoais.teste;

import exerciciospessoais.dominio.AlunoSem;
import exerciciospessoais.dominio.Local;
import exerciciospessoais.dominio.Professor;
import exerciciospessoais.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("UDF");
        Professor professor = new Professor("Eliel", "Programação Web");
        AlunoSem aluno = new AlunoSem("Rafael", 19);
        AlunoSem aluno1 = new AlunoSem("raphaeu", 20);
        AlunoSem[] alunosParaSeminario = {aluno, aluno1};
        Seminario seminario = new Seminario("Desenvolvimento Web", local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
