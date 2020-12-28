package com.x.singleton;

public class Person {
    private static Person person = null;

    private Person() {
    }

    public static Person getInstance() {
        if (person == null) {
            synchronized (Person.class) {
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }

}
