package com.pluralsight;

public class UNO extends Card implements PlayableInterface {
    public UNO(int value, double price, String name, String type, String effect, String valueType) {
        super(value, price, name, type, effect, valueType);
    }

    @Override
    public String getEffect() {
        return this.effect + " played";
    }

    @Override
    public void play() {
        System.out.println("Played first card!");
    }
}
