package devdojo.maratona.java.javacore.Npolimorfismo.test;

import devdojo.maratona.java.javacore.Npolimorfismo.repositorio.Repositorio;
import devdojo.maratona.java.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest01 {

    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioBancoDeDados();
        /* Pode ser do tipo das outras implement, a intencao dessa aula e exemplificar a
        * programacao orientada a interfaces*/
        repositorio.salvar();
    }
}
