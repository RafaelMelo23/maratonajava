package exerciciospessoais.teste;

import exerciciospessoais.dominio.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro car = new Carro();

        car.setCarBrand("Chevrolet");
        car.setCarModel("Corvette C6 Z01");
        car.setCarSpeed(267);
        car.printCarInfos();
        car.setBrake(143);
        car.carBrake();
        car.setGas(120);
        car.carGas();




    }
}
