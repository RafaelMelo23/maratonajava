package javacore.introducaoclasses.Fmodificadorestatico.dominio;

public class Filme {
    private String nome;
    private static int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public Filme() {
        this.nome = nome;
        System.out.println(episodios);
        for (int episodios : Filme.episodios) {
            System.out.print(episodios + " ");

        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}

