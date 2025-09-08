package devdojo.maratona.java.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {

    public static void main(String[] args) {

        File file = new File("file.txt");
        boolean append = true;

        try (FileWriter fw = new FileWriter(file, append)) { // <- pode ser passado um boolean como param pra dar append no file, e adicionar o conteudo inves de apagar e criar um novo

            fw.write("Its over anakin, i have the highground");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
