package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);

        /*
        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);
        Files.setAttribute(path, "dos:hidden", false);
        Files.setAttribute(path, "dos:readonly", false);
        */

        DosFileAttributeView fileAttributesView = Files.getFileAttributeView(path, DosFileAttributeView.class);

        fileAttributesView.setHidden(true);
        fileAttributesView.setReadOnly(true);

        System.out.println(fileAttributesView.readAttributes().isHidden());
        System.out.println(fileAttributesView.readAttributes().isReadOnly());


    }
}
