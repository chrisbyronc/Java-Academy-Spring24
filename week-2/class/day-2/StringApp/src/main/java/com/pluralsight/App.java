package com.pluralsight;

public class App {
    public static void main(String[] args) {
        String favoriteAnimal = "turtle,kangaroo,tiger,panda";

        System.out.println(favoriteAnimal.charAt(1)); // 'a'
        System.out.println(favoriteAnimal.indexOf("k")); // 0

        System.out.println(favoriteAnimal.substring(7, 1));

        String[] animals = favoriteAnimal.split("\\,");

    }
}
