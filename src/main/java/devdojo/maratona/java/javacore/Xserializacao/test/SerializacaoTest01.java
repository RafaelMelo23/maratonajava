package devdojo.maratona.java.javacore.Xserializacao.test;

import devdojo.maratona.java.javacore.Xserializacao.dominio.Aluno;
import devdojo.maratona.java.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {

    public static void main(String[] args) {

         Aluno aluno = new Aluno(1L, "Anakin Skywalker", "123456789");
         Turma turma = new Turma("Maratona Java DevDojo");
         aluno.setTurma(turma);

        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {

        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {

            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() { // Ao deserializar, ele nao utiliza o construtor

        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {

            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
