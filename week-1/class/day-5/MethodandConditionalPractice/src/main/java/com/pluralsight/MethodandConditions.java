package com.pluralsight;

import java.util.Scanner;

public class MethodandConditions {

    public static void main(String[] args) {

        /**
         * Method lesson
         */
        Scanner keyboard = new Scanner(System.in);

        int addResult = add(5, 5);
        String surname = acceptNames("surname", keyboard);
        String firstName = acceptNames("first name", keyboard);
        String lastName = acceptNames("last name", keyboard);
        String suffix = acceptNames("suffix", keyboard);

        String fullName = fullNameGen(surname, firstName, lastName, suffix);


        //DRY - Don't Repeat Yourself
        System.out.println("Result: " + addResult);
        System.out.println("Name: " + fullName);

        /**
         * Conditionals
         */

        int favoriteNumber = 10;

        if(favoriteNumber > 10) {
            System.out.println("Favorite number is larger than 10");
        } else if (favoriteNumber == 10) {
            System.out.println("Favorite number is 10!!!!!");
        } else {
            System.out.println("Favorite number is smaller than 10");
        }

        String myName = "joe";

        String myNewName = "J";
        myNewName += "oe";

        if(myName.equalsIgnoreCase(myNewName) || myName.equalsIgnoreCase("frank")) {
            System.out.println("Yes, it's joe");
        }


    }

    public static int add(int y, int x) {
        return x + y;
    }

    public static String fullNameGen(String surname, String firstName, String lastName, String suffix) {
        return surname + " " + firstName + " " + lastName + " " + suffix;
    }

    public static String acceptNames(String acceptanceCriteria, Scanner keyboard) {
        System.out.print("Please enter your " + acceptanceCriteria + ": ");
        return keyboard.nextLine();
    }


}
