package com.pluralsight;

public class Car {
    private String manufacture, model;
    private int speed;

    public Car(String manufacture, String model) {
        this.manufacture = manufacture;
        this.model = model;
        this.speed = 80;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
