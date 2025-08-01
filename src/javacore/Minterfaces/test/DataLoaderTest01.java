package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DataLoader;
import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

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
