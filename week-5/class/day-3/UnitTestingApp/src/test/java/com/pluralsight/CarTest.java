package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.Test
    void accelerate_should_increaseCarSpeed() {
        //arrange
        Car testCar = new Car("Porsche", "Cayanne");

        int speed = 80;

        int expectedSpeed = 80;

        //act
        testCar.accelerate(speed);

        //assert
        assertEquals(expectedSpeed, testCar.getSpeed());
    }

}