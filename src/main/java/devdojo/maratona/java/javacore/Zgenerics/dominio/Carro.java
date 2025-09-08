package devdojo.maratona.java.javacore.Zgenerics.dominio;

public class Carro {

    private String nome;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
