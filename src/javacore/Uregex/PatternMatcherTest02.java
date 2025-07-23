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
        // [] range
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n ate m ocorrencias
        // () agrupamento
        // | pipe (ou)
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
