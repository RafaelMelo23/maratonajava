package devdojo.maratona.java.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {

    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("folder");

        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);

        File arquivoDiretorio = new File(fileDiretorio, "file.txt"); // <- pode ser isso, ou o caminho absoluto por ex

        boolean isFileCriado = arquivoDiretorio.createNewFile();
        System.out.println(isFileCriado);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = arquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isFileRenamed);

        File diretorioRenamed = new File("folder2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomeado);


    }
}
