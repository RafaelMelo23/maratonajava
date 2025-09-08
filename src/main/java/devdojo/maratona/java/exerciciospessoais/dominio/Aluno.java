package exerciciospessoais.dominio;

public class Aluno {

    private String nomeAluno;
    private String matricula;
    private double[] gradeA1 = new double[4];
    private double[] gradeA2 = new double[4];
    private double[] individualAverages;

    public void setNameAluno(String nameAluno) {
        this.nomeAluno = nameAluno;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setGradeA1(double[] gradeA1) {
        this.gradeA1 = gradeA1;
    }

    public void setGradeA2(double[] gradeA2) {
        this.gradeA2 = gradeA2;
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void imprimirNotasA1(double[] notaA1) {
        for (double notasA1 : notaA1) {
            System.out.print(notasA1 + ", ");
        }
    }

    public void imprimirNotasA2(double[] notaA2) {
        for (double gradesA2 : gradeA2) {
            System.out.print(gradesA2 + ", ");
        }
    }

    public void calculoAvg() {
        individualAverages = new double[gradeA1.length];
        for (int i = 0; i < gradeA1.length; i++) {
            individualAverages[i] = (gradeA1[i] + gradeA2[i]);
        }
    }

    public void printAvg(double[] individualAverages) {
        for (double avg : this.individualAverages) {
            System.out.print(avg);
            for (int i = individualAverages.length; i > individualAverages.length - 1; i--) {
                System.out.print(", ");


            }

        }
        System.out.println("");
    }

    public void studentApproval(double[] individualAverages) {
        System.out.println("");
        for (int i = 0; i < individualAverages.length; i++) {
            if (individualAverages[i] < 6) {
                double missingGrade = 6 - individualAverages[i];
                System.out.println("Você está reprovado na matéria: " + (i + 1) + ".\nFaltando " + missingGrade + " para atingir a média.");

            }
            if (individualAverages[i] >= 6) {
                System.out.println("Você está aprovado na matéria: " + (i + 1));

            }

        }
    }

    public void printInfo() {
        System.out.println("Nome Completo: " + getNomeAluno());
        System.out.println("Número de Matrícula: " + getMatricula());
        System.out.print("Notas A1: ");
        imprimirNotasA1(gradeA1);
        System.out.print("\nNotas A2: ");
        imprimirNotasA2(gradeA2);
        System.out.println("");
        System.out.print("Médias Individuais: ");
        printAvg(individualAverages);
        studentApproval(individualAverages);


    }


}

