package exerciciospessoais.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void imprime() {
        System.out.println("-----------");
        System.out.println("Professor: " + nome);
        System.out.println("Especialidade: "+especialidade+ "\n");
        if (seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("#### Seminários Cadastrados ####");
            System.out.println("Título: "+seminario.getTitulo());
            System.out.println("Local: "+seminario.getLocal().getEndereco()+ "\n");
            if(seminario.getAlunosSem() == null || seminario.getAlunosSem().length == 0) continue;
            System.out.println("### Alunos Cadastrados ###");
            for(AlunoSem aluno : seminario.getAlunosSem()) {
                System.out.println("Nome: "+aluno.getNomeAluno() +" Idade: "+aluno.getIdade());
            }
        }



    }
}
