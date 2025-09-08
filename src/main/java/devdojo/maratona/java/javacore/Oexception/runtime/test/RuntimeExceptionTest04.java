package devdojo.maratona.java.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {

    public static void main(String[] args) {

        // Nao pode ser a mais generica a frente dos outros, os outros catchs vao se tornar unreachable
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }
        // O caso recomendado acima, tratar as ex que se deseja um tratamento especifico, e abaixo, um mais generico pra se garantir em um caso de erro mais generalista

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        } // sintaxe de colapsar as ex

    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {


    }
}
