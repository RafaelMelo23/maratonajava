package javacore.ZZBcomportamento.interfaces;

import javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {

    // anonimas, funcoes, concisa
    boolean test(Car car);

    // apenas 1 metodo abstrato
    // (parametro) -> <expressao>
    // (Car car) -> car.getColor().equals("green);

}
