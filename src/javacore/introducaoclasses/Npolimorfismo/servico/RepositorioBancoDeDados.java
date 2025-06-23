package javacore.introducaoclasses.Npolimorfismo.servico;

import javacore.introducaoclasses.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
