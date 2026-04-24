package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person person1 = new Person("Arsema", "Yifter", (short) 16);
        people.add(person1);

        Person person2 = new Person("Kiz", "Lor", (short) 6);
        people.add(person2);



    }
}
