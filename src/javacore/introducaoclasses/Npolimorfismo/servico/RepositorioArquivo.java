package javacore.introducaoclasses.Npolimorfismo.servico;

import javacore.introducaoclasses.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
