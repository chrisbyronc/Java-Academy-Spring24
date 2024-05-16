package com.pluralsight;

public class VehiclesApp {

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide.getColor());

        Semitruck bigrig = new Semitruck();
        bigrig.setColor("Blue");

        System.out.println(bigrig.getColor());
        System.out.println(slowRide.getColor());
    }

}
