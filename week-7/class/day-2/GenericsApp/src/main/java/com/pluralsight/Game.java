package com.pluralsight;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        UNO unoCard1 = new UNO(7, 0, "7", "green", "7", "none");
        UNO unoCard2 = new UNO(1, 0, "1", "blue", "1", "none");
        UNO unoCard3 = new UNO(2, 0, "2", "green", "2", "none");
        UNO unoCard4 = new UNO(3, 0, "3", "red", "3", "none");
        UNO unoCard5 = new UNO(4, 0, "4", "yellow", "4", "none");
        UNO unoCard6 = new UNO(5, 0, "5", "green", "5", "none");
        UNO unoCard7 = new UNO(6, 0, "6", "red", "6", "none");

        System.out.println(unoCard1.getEffect());

        ArrayList<Card> unoCards = new ArrayList<>();
        unoCards.add(unoCard1);
        unoCards.add(unoCard2);
        unoCards.add(unoCard3);
        unoCards.add(unoCard4);
        unoCards.add(unoCard5);
        unoCards.add(unoCard6);
        unoCards.add(unoCard7);

        PlayersHand<Card> unoCardHand = new PlayersHand<>(unoCards);


        displayCardValue("Uno Card", unoCard1.getValue());
    }

    public static <T> void displayCardValue(String label, T value) {
        System.out.println(label + " " + value);
    }


}
