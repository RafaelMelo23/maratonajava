package devdojo.maratona.java.javacore.Fmodificadorestatico.teste;

import devdojo.maratona.java.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);
        Carro c1 = new Carro("BMW M3 Touring", 289);
        Carro c2 = new Carro("Mercedes-Benz E63 Estate", 278);
        Carro c3 = new Carro("Audi RS6", 290);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
