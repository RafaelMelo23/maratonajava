package devdojo.maratona.java.javacore.ZZKjunit.service;

import devdojo.maratona.java.javacore.ZZKjunit.dominio.Person;

import java.util.Objects;

public class PersonService {

    public boolean isAdult(Person person) {
        Objects.requireNonNull(person, "Person cant be null");

        return person.getAge() >= 18;
    }
}
