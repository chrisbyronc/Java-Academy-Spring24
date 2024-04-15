package com.pluralsight;

import java.util.Scanner;

//lowerCamelCase - variables and methods
//UpperCamelCase or PasCal case - Class
//snake_case - projects/directories
//kebab-case - projects/directories

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your CLI bank!");
        System.out.println("Please select a calculator?");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. CD Calculator");
        int calcType = scanner.nextInt();

        switch (calcType) {
            case 1:
                mortgageCalculator(scanner);
            break;
            case 2:
                cdCalculator(scanner);
            break;
            default:
                System.out.println("Please choose a proper option");
        }
    }

    public static void mortgageCalculator(Scanner keyboard) {
        //Mortgage Calculator

        System.out.println("This is your mortgage calculator");

        System.out.print("Enter your current principal: ");
        double principal = keyboard.nextDouble();

        System.out.print("Enter your current interest rate: ");
        double interestRate = keyboard.nextDouble();

        System.out.print("Enter your current loan length (in months): ");
        int monthlyLoanLength = keyboard.nextInt();

        interestRate /= 100;
        interestRate /= 12;

        //P = principal
        //r = interest rate
        //n = length

        //M = P
        //r (1 + r)n
        //(1 + r)n - 1

        //monthly payment
        double monthlyPayments = principal *
                interestRate * Math.pow((1 + interestRate),monthlyLoanLength)
                /
                ((Math.pow(1 + interestRate, monthlyLoanLength))-1);

        System.out.printf("Total Monthly Payment: %.2f \n", monthlyPayments);
        System.out.printf("Total Interest Paid: %.2f", (monthlyPayments * monthlyLoanLength - principal));

    }

    public static void cdCalculator(Scanner keyboard) {
        //CD Calculator
        System.out.println("This is your CD calculator");

        System.out.print("Please enter the amount you want to deposit: ");
        double deposit = keyboard.nextDouble();

        System.out.print("Please enter your interest rate: ");
        double cdInterestRate = keyboard.nextDouble();

        System.out.print("Please enter maturation year length: ");
        double yearsToMature = keyboard.nextDouble();

        cdInterestRate /= 100;
        double futureValue = Math.pow((1 + cdInterestRate), yearsToMature);
        double endingBalance = deposit * futureValue;

        double earnedInterest = endingBalance - deposit;

        System.out.printf("Our future value: %.2f with a earned interest of: %.2f", endingBalance, earnedInterest);
    }

}
