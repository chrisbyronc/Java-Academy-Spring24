package com.pluralsight;

public interface SellingInterface {

    void sell();

    default double getValue() {
        return 0;
    };

    int getGrading();

}
