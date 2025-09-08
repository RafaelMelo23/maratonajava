package javacore.Qstring.test;

public class StringPerformanceTest {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(130_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto (String): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(130_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto (String Builder): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(130_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto (String Buffer): " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {

        String textoRecebe = "";
        for (int i = 0; i < tamanho; i++) {

            textoRecebe += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {

        StringBuilder sb = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {

            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {

        StringBuffer sb = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {

            sb.append(i);
        }
    }
}
