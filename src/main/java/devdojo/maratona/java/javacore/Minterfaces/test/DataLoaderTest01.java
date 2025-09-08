package devdojo.maratona.java.javacore.Minterfaces.test;

import devdojo.maratona.java.javacore.Minterfaces.dominio.DataLoader;
import devdojo.maratona.java.javacore.Minterfaces.dominio.DatabaseLoader;
import devdojo.maratona.java.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remover();
        fileLoader.remover();

        databaseLoader.checkPermissions();
        fileLoader.checkPermissions();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
