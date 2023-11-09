package org.example;

public class GasolineCar extends AFuelCar {

    GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    public int getRegistrationFee() {
        int fee = 0;
        switch (kmPrLitre) {
            case 5:
                fee += 10470;
                break;
            case 10:
                fee += 5500;
                break;
            case 15:
                fee += 2340;
                break;
            case 20:
                fee += 1050;
                break;
            case 50:
                fee += 330;
                break;
        }
        return fee;
    }

    String getFuelType() {
        return "Gasolin";

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
