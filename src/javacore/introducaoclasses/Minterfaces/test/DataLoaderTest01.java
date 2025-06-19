package javacore.introducaoclasses.Minterfaces.test;

import javacore.introducaoclasses.Minterfaces.dominio.DataLoader;
import javacore.introducaoclasses.Minterfaces.dominio.DatabaseLoader;
import javacore.introducaoclasses.Minterfaces.dominio.FileLoader;

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
