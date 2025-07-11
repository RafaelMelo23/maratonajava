package javacore.introducaoclasses.Oexception.exception.test;

import javacore.introducaoclasses.Oexception.exception.dominio.Leitor01;
import javacore.introducaoclasses.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {

        lerArquivo();
    }

    // try with resource -> apenas os que implementam close e autoclosable
    // usar catch ou throws na assinatura
    // esse tipo de try fecha as conexoes de forma inversa, ou seja, nesse caso: Leitor02 depois Leitor01
    public static void lerArquivo() {

        try(Leitor01 leitor1 = new Leitor01();
            Leitor02 leitor2 = new Leitor02()) {




        } catch(IOException e) {

        }
    }
    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("filename.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
