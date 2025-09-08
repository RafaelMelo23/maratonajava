package devdojo.maratona.java.javacore.Aintroducaometodos.teste;


import devdojo.maratona.java.javacore.Aintroducaometodos.dominio.Carro;

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();


        carro.marca = "Chevrolet";
        carro.ano = 2005;
        carro.modelo = "Corvete C6";

        carro2.marca = "Ford";
        carro2.ano = 2017;
        carro2.modelo = "Focus RS";

        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro.marca + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);
        System.out.println("");
        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.marca + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

    }
}
