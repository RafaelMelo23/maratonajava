package javacore.introducaoclasses.Csobrecargametodos.Dominio;

public class Filme {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios) {

        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {

        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
