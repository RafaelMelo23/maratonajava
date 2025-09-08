package devdojo.maratona.java.javacore.Zgenerics.test;


import java.util.List;

public class WildcardTest02 {

    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        // printConsulta(cachorros);
    }

    // Type erasure
    // Apenas permite a leitura
    private static void printConsulta(List<? extends Animal> listaAnimais) {

        for (Animal animal : listaAnimais) {
            animal.consulta();
        }

    }

    // Apenas permite a escrita
    private static void printConsultaAnimal(List<? super Animal> animals) {

        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
