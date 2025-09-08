package devdojo.maratona.java.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from the database...");
    }

    @Override
    public void remover() {
        System.out.println("Removing data from the database...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Checando permissoes no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize da classe DatabaseLoader");
    }
}
