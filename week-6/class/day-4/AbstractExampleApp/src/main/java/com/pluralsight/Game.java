package com.pluralsight;

public class Game {
    public static void main(String[] args) {
        UNO unoCard1 = new UNO(7, 0, "7", "green", "7", "none");

        System.out.println(unoCard1.getEffect());
    }
}
