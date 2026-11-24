package com.pluralsight.stream;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //*creating my scanner for inputs
        Scanner input = new Scanner(System.in);
        //?Creating my list of people
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", "Smith", 25),
                new Person("Sarah", "Johnson", 32),
                new Person("Michael", "Williams", 18),
                new Person("Emily", "Brown", 45),
                new Person("David", "Jones", 29),
                new Person("Jessica", "Garcia", 21),
                new Person("James", "Miller", 55),
                new Person("Ashley", "Davis", 37),
                new Person("Robert", "Wilson", 16),
                new Person("Amanda", "Taylor", 42)
        ));

        System.out.println("Search for a users first name");

        String firstName = input.nextLine();
        //?Starting the looping process
        people.stream()
                //*Filtering out any names that don't match given name
                .filter(person -> person.getFirstName().equalsIgnoreCase(firstName))
                //*Printing out the names
                .forEach(person -> System.out.println(person.getFirstName()));

        System.out.println("Search for a users last name");
        String lastName = input.nextLine();
        //?Starting the looping process
        people.stream()
                //*Filtering out any names that don't match given name
                .filter(person -> person.getLastName().equalsIgnoreCase(lastName))
                //*Printing out the names
                .forEach(person -> System.out.println(person.getLastName()));


        //?Looping through people's ages to calculate the average with a stream
       double averageAge =  people.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println(averageAge);


        //?Looping through the ages to calculate the max with a stream
        double maxAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .orElse(0);
        System.out.println(maxAge);

        //?Looping through the ages to calculate the min with a stream
        double minAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .orElse(0);
        System.out.println(minAge);






    }

}
