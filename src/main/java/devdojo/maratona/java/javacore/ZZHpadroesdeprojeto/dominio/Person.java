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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String fatherName;
        private String username;
        private String email;

        public PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

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
            Person person = new Person();
            person.username = this.username;
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            person.email = this.email;
            person.fatherName = this.fatherName;
            return person;
        }
    }
}
