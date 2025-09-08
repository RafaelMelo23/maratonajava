package devdojo.maratona.java.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {

        // formatar -> de obj pra string
        // parse -> de str pra obj

        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250721", DateTimeFormatter.BASIC_ISO_DATE); // as ISOs que contem a zona, podem entrar no parse
        System.out.println("parse1: " + parse1);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-07-21T16:02:26.9910491", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("parse4: " + parse4);

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); // Adicionar MMMM inves de MM adiciona o mes por extenso
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);

        LocalDate parseBR = LocalDate.parse("2025-07-21", formatterBr);



    }
}
