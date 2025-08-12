package javacore.Zgenerics.test;


import java.util.List;

public class WildcardTest02 {

    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        // printConsulta(cachorros);
    }

    // Type erasure
    private static void printConsulta(List<Animal> listaAnimais) {

        for (Animal animal : listaAnimais) {
            animal.consulta();
        }

        listaAnimais.add(new Cachorro());
    }
}
