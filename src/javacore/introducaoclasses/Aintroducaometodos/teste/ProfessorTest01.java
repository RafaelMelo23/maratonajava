package javacore.introducaoclasses.Aintroducaometodos.teste;

import javacore.introducaoclasses.Aintroducaometodos.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre";
        professor.idade = 40;
        professor.sexo = 'M';

        System.out.println("Nome: " +professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
