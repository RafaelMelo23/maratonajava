package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

    public static void main(String[] args) throws IOException {

        Path pastaPath = Paths.get("pasta");

        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath); // lanca ex caso ja exista
        }

        Path subPastaPath = Paths.get("pasta/subpasta/subpasta");

        Path pastaDirectory = Files.createDirectories(subPastaPath);
        // caso os foldes parent nao existam, ele os cria. Alem disso, nao lanca ex caso ja exista

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
        Path fileFromPathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        // sem replace existing ele lanca ex caso ja exista
    }
}
