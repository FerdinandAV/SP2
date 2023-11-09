package org.example;

public class DieselCar extends AFuelCar {
    boolean particleFilter;

    DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean ParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    boolean hasParticleFilter() {
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        switch (kmPrLitre) {
            case 5:
                fee = 15260 + 10470;
                break;
            case 10:
                fee = 2770 + 5500;
                break;
            case 15:
                fee = 1850 + 2340;
                break;
            case 20:
                fee = 1390 + 1050;
                break;
            case 50:
                fee = 130 + 330;
                break;
        }
        if (!hasParticleFilter()) {
            fee += 1000;
        }
        return fee;
    }


    String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
