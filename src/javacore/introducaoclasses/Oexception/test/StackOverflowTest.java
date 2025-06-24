package javacore.introducaoclasses.Oexception.test;

public class StackOverflowTest {

    public static void main(String[] args) {

        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
