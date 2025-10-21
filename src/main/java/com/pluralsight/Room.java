package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn(){
        if(!isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
        }
    }

    public void checkOut() {
        cleanRoom();
        isAvailable();
    }
    public void cleanRoom() {
        if(!isOccupied) {
            this.isDirty = false;
        }
    }
}
