package com.pluralsight;

import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String favoriteAnimal = "turtle,kangaroo,tiger,panda";

        System.out.println(favoriteAnimal.charAt(1)); // 'a'
        System.out.println(favoriteAnimal.indexOf("k")); // 0

        System.out.println(favoriteAnimal.substring(7, 1));

        String[] animals = favoriteAnimal.split("\\,");



        // string contains "id|description|quantity|price"

        String input = "111|Hot Chocolate (12-count)|21|4.99";



        String[] tokens = input.split(Pattern.quote("|"));

//        tokens[0] = "111"
//        tokens[1] = "Hot Chocolate (12-count)"
//        tokens[2] = "21"
//        tokens[3] = "4.99"

        int id = Integer.parseInt(tokens[0]); //int 111
        String name = tokens[1];
        int quantity = Integer.parseInt(tokens[2]); //int 21
        double price = Double.parseDouble(tokens[3]); //double 4.99


    }
}
