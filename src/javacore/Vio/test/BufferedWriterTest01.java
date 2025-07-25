package javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {

    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fr = new FileWriter(file)) {
            BufferedWriter br = new BufferedWriter(fr);

            br.write("Always two there are, a master and an apprentice");
            br.newLine();
            br.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
