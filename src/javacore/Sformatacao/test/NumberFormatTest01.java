package javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {

    public static void main(String[] args) {

        Locale localeBR = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[2];

        nfa[0] = NumberFormat.getInstance(localeBR);
        nfa[1] = NumberFormat.getInstance(localeJP);

        double valor = 1_000_000.583;

        for (NumberFormat nf : nfa) {

            System.out.println(nf.format(valor));
        }
    }
}
