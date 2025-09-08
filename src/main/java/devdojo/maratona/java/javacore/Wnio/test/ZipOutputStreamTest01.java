package javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {

    public static void main(String[] args) {

        Path arquivo = Paths.get("pasta/arquivo.zip");
        Path arquivosPraZipar = Paths.get("pasta/subpasta");
    }

    private static void zip(Path arquivoZip, Path arquivoPraZipar) {

        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivoPraZipar)) {

            for (Path file : directoryStream) {

                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
