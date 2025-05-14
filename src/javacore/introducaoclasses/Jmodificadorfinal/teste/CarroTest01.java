package javacore.introducaoclasses.Jmodificadorfinal.teste;

import javacore.introducaoclasses.Jmodificadorfinal.dominio.Carro;
import javacore.introducaoclasses.Jmodificadorfinal.dominio.Subaru;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.getCOMPRADOR());
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.getCOMPRADOR());

        Subaru subaru = new Subaru();
        subaru.setNome("WRX STi 22b");
        subaru.imprime();
    }
}
