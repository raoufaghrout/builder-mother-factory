package io.ra.testingjava.builder;

import io.ra.testingjava.Person;

public class PersonBuilder {

    private String firstName = "Alice";
    private String surname = "Jones";
    private int age = 25;

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(firstName, surname, age);
    }
}
