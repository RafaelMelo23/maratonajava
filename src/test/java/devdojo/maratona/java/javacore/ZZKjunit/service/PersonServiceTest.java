package devdojo.maratona.java.javacore.ZZKjunit.service;

import devdojo.maratona.java.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonServiceTest {

    @Test
    @DisplayName("A person should not be considered adult when age is lower than 18")
    void isAduld_ReturnFalseWhenAgeIsLowerThan18() {
        Person person = new Person(15);
        PersonService personService = new PersonService();

        Assertions.assertFalse(personService.isAdult(person));
    }
}