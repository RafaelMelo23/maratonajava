package devdojo.maratona.java.javacore.ZZKjunit.service;

import devdojo.maratona.java.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonServiceTest {

    Person adult;
    Person notAdult;
    PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService();
        adult = new Person(18);
        notAdult = new Person(15);
    }

    @Test
    @DisplayName("A person should not be considered adult when age is lower than 18")
    void isAduld_ReturnFalseWhenAgeIsLowerThan18() {

        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be considered adult when age is 18 or more")
    void isAduld_ReturnTrueWhenAgeIs18OrMore() {

        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void isAduld_ThrowNullPointerExceptionWhenPersonIsNull() {

        Assertions.assertThrows(NullPointerException.class, () -> personService.isAdult(null), "Person cant be null");
    }

    @Test
    @DisplayName("Should return List only with adults")
    void filterRemovingNotAdult_ReturnListWithAdultOnly_WhenListOfAdultIsPassed() {
        Person p1 = new Person(18);
        Person p2 = new Person(18);
        Person p3 = new Person(15);
        Person p4 = new Person(13);
        List<Person> personList = List.of(p1, p2, p3, p4);

        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}