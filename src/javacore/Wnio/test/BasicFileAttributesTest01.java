package javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {

    public static void main(String[] args) throws IOException {

        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        // Posix pra OS's baseados em unix

        LocalDateTime dt = LocalDateTime.now().minusDays(10);

        File file = new File("pasta2/novo.txt");

        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(dt.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path);

        FileTime fileTime = FileTime.from(dt.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
