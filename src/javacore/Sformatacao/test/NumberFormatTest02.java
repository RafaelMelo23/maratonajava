package javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {

    public static void main(String[] args) {

        Locale localeBR = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[2];

        nfa[0] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1_000_000.583;

        for (NumberFormat numberFormat : nfa) {

            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1,000";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
