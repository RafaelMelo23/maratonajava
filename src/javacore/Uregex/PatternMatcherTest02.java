package javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {

    public static void main(String[] args) {

        // \d tudo o que nao for digito
        // \D tudo o que for digito
        // \s espacos em branco \t \n \f \r
        // \S todos os caracteres excluido os brancos
        // \w a-z A-Z, digitos, _
        // \W tudo o que nao estiver em \w
        String regex = "\\w";
        String texto = "ajskasiau12_ ";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789123");
        System.out.println("regex " +regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
