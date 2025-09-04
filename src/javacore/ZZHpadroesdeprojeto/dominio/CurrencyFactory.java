package javacore.ZZHpadroesdeprojeto.dominio;

public class CurrencyFactory {

    public static Currency newCurrency(Country country) {

        return switch (country) {

            case USA -> new UsDollar();
            case BRAZIL -> new Real();
            default -> throw new IllegalArgumentException("Invalid country");
        };
    }
}
