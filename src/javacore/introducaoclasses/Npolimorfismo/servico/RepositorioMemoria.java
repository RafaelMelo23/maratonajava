package javacore.introducaoclasses.Npolimorfismo.servico;

import javacore.introducaoclasses.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
