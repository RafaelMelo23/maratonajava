package devdojo.maratona.java.javacore.Uregex;

public class ScannerTest01 {

    public static void main(String[] args) {

        String texto = "Anakin, Obi-Wan, Tyranus";
        String nomes[] = texto.split(",");

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
