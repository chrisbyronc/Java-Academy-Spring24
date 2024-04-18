package com.pluralsight;

public class Animal {
    private String name;
    private String type;
    private int age;

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return this.type;
    }

    public void communicate() {
        System.out.println(this.name + " says Hello");
    }


}
