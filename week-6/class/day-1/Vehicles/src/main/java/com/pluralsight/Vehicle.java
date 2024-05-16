package com.pluralsight;

public class Vehicle {

    protected String color, model;
    protected int fuelCapacity, year, cargoCapacity, numberOfPassengers;
    protected double price;

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    protected int getFuelCapacity() {
        return fuelCapacity;
    }

    protected void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    protected int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    protected int getCargoCapacity() {
        return cargoCapacity;
    }

    protected void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    protected int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
