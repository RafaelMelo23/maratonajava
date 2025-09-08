package javacore.Dconstrutores.Dominio;

public class Filme {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    public Filme(String nome, String tipo, int episodios, String genero) {

        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Filme(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Filme() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
}
