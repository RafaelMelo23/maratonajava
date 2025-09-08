package devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.test;

import devdojo.maratona.java.javacore.ZZHpadroesdeprojeto.dominio.*;
import javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {

    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("William")
                .lastName("Suane")
                .build();

        ReportDTO report = ReportDTO.ReportDTOBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(report);
    }
}
