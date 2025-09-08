package devdojo.maratona.java.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {

    public static void main(String[] args) {

        Path dir = Paths.get(".");

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir)){

            for (Path path: directoryStream){

                System.out.println(path.getFileName());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
