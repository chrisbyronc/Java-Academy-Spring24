package com.pluralsight;

public class Person {
    private String name;
    private String favorite_color;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    //setter method for setting favorite_color
    public void setFavorite_color(String fc) {
        this.favorite_color = fc;
    }

    //getter method for getting favorite_color
    public String getFavorite_color() {
        return this.favorite_color;
    }

}
