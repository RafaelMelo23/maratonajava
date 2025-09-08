package devdojo.maratona.java.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllJavaFiles extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        if (file.getFileName().toString().endsWith(".java")) {
        System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitorTest02 {

    public static void main(String[] args) throws IOException {

        Path dirRoot = Paths.get(".");
        Files.walkFileTree(dirRoot, new ListAllFiles());
    }
}
