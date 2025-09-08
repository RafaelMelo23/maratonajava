package devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.Country;
import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {

    public static void main(String[] args) {

        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
