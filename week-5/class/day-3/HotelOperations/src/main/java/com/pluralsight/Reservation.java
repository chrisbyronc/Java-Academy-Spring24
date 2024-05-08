package com.pluralsight;

public class Reservation {

    private String roomType;

    private int numberOfNights;

    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return this.weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        double weekendFactor = (this.weekend) ? 1.10 : 1; //ternary

        if(this.roomType.equalsIgnoreCase("king")) {
            return 139.00 * weekendFactor;
        } else {
            return 124.00 * weekendFactor;
        }
    }


    public double getReservationTotal() {
        return this.numberOfNights * this.getPrice();
    }
}
