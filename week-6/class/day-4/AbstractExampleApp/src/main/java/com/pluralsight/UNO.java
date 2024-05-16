package com.pluralsight;

public class UNO extends Card {
    public UNO(int value, double price, String name, String type, String effect, String valueType) {
        super(value, price, name, type, effect, valueType);
    }

    @Override
    public String getEffect() {
        return this.effect + " played";
    }
}
