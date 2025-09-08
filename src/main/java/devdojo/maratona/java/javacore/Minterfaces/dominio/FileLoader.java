package devdojo.maratona.java.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from a file");
    }

    @Override
    public void remover() {
        System.out.println("Removing data from a file");
    }
}
