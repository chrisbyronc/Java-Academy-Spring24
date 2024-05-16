package com.pluralsight;

//Playing Cards
    //spider, poker, blackjack, phase 10
//Yu-gi-oh Cards
//Pokemon Cards
//Tarot Cards
//UNO cards
//Collector Cards


public abstract class Card {
    protected int value;
    protected double price;
    protected String name, type, effect, valueType, condition, rank;
    protected boolean rarity;

    public Card(int value, double price, String name, String type, String effect, String valueType, String condition, String rank, boolean rarity) {
        this.value = value;
        this.price = price;
        this.name = name;
        this.type = type;
        this.effect = effect;
        this.valueType = valueType;
        this.condition = condition;
        this.rank = rank;
        this.rarity = rarity;
    }

    public Card(int value, double price, String name, String type, String effect, String valueType) {
        this.value = value;
        this.price = price;
        this.name = name;
        this.type = type;
        this.effect = effect;
        this.valueType = valueType;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String getEffect();

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isRarity() {
        return rarity;
    }

    public void setRarity(boolean rarity) {
        this.rarity = rarity;
    }
}
