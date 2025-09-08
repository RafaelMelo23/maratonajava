package javacore.Xserializacao.dominio;

public class Turma {

    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma(String nome) {
        this.nome = nome;
    }
}
