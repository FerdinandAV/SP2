package org.example;

public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;

    ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    float getWhPrKm() {
        return ((float) getBatteryCapacityKWh() / getMaxRangeKm() * 1000);
    }

    public int getRegistrationFee() {
        int kmPrLitre = (int) (100 / (getWhPrKm() / 91.25));
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


    @Override
    public String toString() {
        return super.toString() + ", range is " + getMaxRangeKm() + ", Electric";    }
}