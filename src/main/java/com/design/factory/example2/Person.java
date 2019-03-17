package com.design.factory.example2;

public class Person {

    String firstname;
    String lastname;

    public Person() {
        System.out.println("default constr called");
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("properties constr called");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
