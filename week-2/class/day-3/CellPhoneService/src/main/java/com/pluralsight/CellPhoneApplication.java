package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CellPhone phone = new CellPhone();
        //instance of a class, is an object

        System.out.println("Welcome to your Cell Phone Service!");

        System.out.print("Please enter your phones serial number: ");
        phone.setSerialNumber(keyboard.nextInt());
        keyboard.nextLine();

        System.out.print("Please enter your phones model: ");
        phone.setModel(keyboard.nextLine());

        System.out.print("Please enter your phones carrier: ");
        phone.setCarrier(keyboard.nextLine());

        System.out.print("Please enter your phones number: ");
        phone.setPhoneNumber(keyboard.nextLine());

        System.out.print("Please enter your phones owner: ");
        phone.setOwner(keyboard.nextLine());

        System.out.println(phone.getSerialNumber() + " " + phone.getPhoneNumber() + " " + phone.getCarrier() + " " + phone.getModel() + " " + phone.getOwner());




    }
}
