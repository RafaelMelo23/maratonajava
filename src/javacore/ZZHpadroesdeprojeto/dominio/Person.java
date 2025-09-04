package javacore.ZZHpadroesdeprojeto.dominio;

public class Person {

    private String firstName;
    private String lastName;
    private String fatherName;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Person(String firstName, String lastName, String fatherName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.username = username;
        this.email = email;
    }

    public static class PersonBuilder {

        private String firstName;
        private String lastName;
        private String fatherName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public PersonBuilder fatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }
        public PersonBuilder username(String username) {
            this.username = username;
            return this;
        }
        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, fatherName, username, email);
        }
    }
}
