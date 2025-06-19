package javacore.introducaoclasses.Minterfaces.dominio;

public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void checkPermissions() {
        System.out.println("Fazendo checagem de permissoes");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize da interface DataLoader");
    }
}
