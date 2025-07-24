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
        // . 1.3 = 123, 133, 1@3, 1A3
        // ^ utilizado pra encontrar o que se deseja no comeco da string, ex ^\w+ encontra a palavra no comeco da string. se usado com [] vira negacao (tudo que nao for x na string inteira)


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "anakin@gmail.com, 123tyranus@gmail.com, #@!palpatine.senate.com, teste@gmail.com, obitwo@mail ";

        System.out.print("Email valido: ");
        System.out.println("#@!palpatine.senate.com".matches(regex));
        System.out.println(texto.split(",")[2].trim());
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
