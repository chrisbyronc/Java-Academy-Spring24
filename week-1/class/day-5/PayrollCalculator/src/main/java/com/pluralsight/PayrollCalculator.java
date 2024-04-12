package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        /**
         * Create a java app, named PayrollCalculator that prompts a user
         * to Enter:
         *
         * - Their name
         * - Their hours worked
         * - Their pay rate (a floating point number)
         * - Calculator their gross pay
         *
         * Display name and gross pay
         */

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = myScanner.nextLine(); //CRLF Enter/Return key

        System.out.print("Enter your hours worked: ");
        float hoursWorked = myScanner.nextFloat();

        System.out.print("Enter your pay rate: ");
        float payRate = myScanner.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.printf("%s earned $%.2f", name, grossPay);



    }

}
