package org.example;

public abstract class AFuelCar extends ACar {

    int kmPrLitre;

    AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + ", km/l is " + kmPrLitre + ", fueltype is " + getFuelType();
    }
}
