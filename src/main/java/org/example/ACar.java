package org.example;

public abstract class ACar implements Car {
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;

    ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;

    }

    @Override
    public String toString() {
        return make + " " + model + "; " + registrationNumber + ", " + numberOfDoors + " doors";
    }
}
