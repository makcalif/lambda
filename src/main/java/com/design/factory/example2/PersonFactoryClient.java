package com.design.factory.example2;

import java.util.function.Supplier;

public class PersonFactoryClient {

    private static void createPersonUsingConstructor () {
        PersonFactory personFactory = Person::new; // lambda function that calls default constructor in Person
        Person person = personFactory.create();    // create calls Person::new as we assigned it in prev line
        // func interface has single method 'create'

        System.out.println("created person :" + person);
    }

    private static void createPersonUsingStaticMethod() {
        PersonFactory personFactory= AnotherEmbeddedPersonCreator::createPerson;
        Person person = personFactory.create();

        System.out.println("created person embedded :" + person);
    }


    public static void main(String[] args) {
        createPersonUsingConstructor();
        createPersonUsingStaticMethod();
    }

    static class AnotherEmbeddedPersonCreator {
        static Person createPerson() {
            return new Person("Embedded", "Person");
        }
    }
}
