package org.collection.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age ;
    }

    static class AgeComparator implements Comparator<Person> {
        public int compare(Person p1, Person p2) {

            int ageComparison = p1.getAge() - p2.getAge();

            if (ageComparison == 0) {
                return p1.getName().compareTo(p2.getName());
            }

            return ageComparison;
        }
    }

    public static void main(String[] args) {
        List<Person> per = new ArrayList<>();
        per.add(new Person("Rahul", 24));
        per.add(new Person("Siddh", 20));
        per.add(new Person("Rohit", 24));
        per.add(new Person("Balu", 22));

        Collections.sort(per, new AgeComparator());

        System.out.println("Sorted list by age, then name: ");
       // System.out.println(people);
        for (Person person : per) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
