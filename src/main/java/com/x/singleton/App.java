package com.x.singleton;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Person person = Person.getInstance();
            System.out.println(person);
            Elf elf = new Elf();
            System.out.println(elf);
        }
    }
}
