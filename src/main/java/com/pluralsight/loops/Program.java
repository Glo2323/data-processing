package com.pluralsight.loops;

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
        //?Looping through the list of people using the users answer to find matching names
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println(person.getFirstName());
            }
        }

        System.out.println("Search for a users last name");
        String lastName = input.nextLine();
        //?Looping through the list of people using the users answer to find matching names
        for (Person person : people) {
            if (person.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(person.getLastName());
            }
        }

        //?Looping through people's ages to calculate the avarage
        int avarageAge = 0;
        for (Person person : people) {

            avarageAge += person.getAge();


        }
            avarageAge = avarageAge / people.size();
        System.out.println(avarageAge);


        //?Looping through the ages to calculate the min
        int minimumAge = people.get(0).getAge();
        for (Person person : people) {

            if (person.getAge() < minimumAge) {
                minimumAge = person.getAge();

            }
        }
        System.out.println(minimumAge);

        //?Looping through the ages to calculate the max
        int maxAge = people.get(0).getAge();
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }

        System.out.println(maxAge);
    }
}
