package javacore.introducaoclasses.Oexception.runtime.test;

public class RuntimeException02 {

    public static void main(String[] args) {

        divisao(1, 0);

        System.out.println("Codigo finalizado");
    }

    /**
     *
     * @param a
     * @param b -- nao pode ser zero
     * @return
     */
    private static int divisao(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal. b nao pode ser 0");
        }

        return a / b;
    }
}
