package devdojo.maratona.java.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {

    public static void main(String[] args) {

        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher("abababa");
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " +regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }
}
