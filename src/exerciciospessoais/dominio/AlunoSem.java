package exerciciospessoais.dominio;

public class AlunoSem {
    private String nomeAluno;
    private int idade;

    public AlunoSem(String nomeAluno, int idade) {
        this.nomeAluno = nomeAluno;
        this.idade = idade;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
