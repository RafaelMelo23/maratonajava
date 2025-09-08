package javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy"; // pattern da data, onde as aspas simples cobrem texto literal, que nao faz parte do pattern

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("15 de Fevereiro de 2025")); // interpreta a string em busca da data presente nela
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
