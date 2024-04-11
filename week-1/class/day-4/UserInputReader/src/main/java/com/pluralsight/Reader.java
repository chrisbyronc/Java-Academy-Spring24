package com.pluralsight;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {


        int num = 4;
        String aValueFOrTesting = "answer";
        String whatever = "fishes";

        System.out.println("The " + aValueFOrTesting + " to " + whatever + " = "+ num);
        System.out.printf("The %s to %s = %d", aValueFOrTesting, whatever, num);
        System.out.println("");

        //CRLF - carriage return line feed


        /**
         * Taking user input
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("What is your salary?");
        double salary = scanner.nextDouble();

        System.out.printf("Howdy %s, your salary is: %f", name, salary);


    }

}
