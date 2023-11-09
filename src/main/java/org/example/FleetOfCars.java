package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int carFee = 0;
        for (Car car : fleet) {
            carFee += car.getRegistrationFee();
        }
        return carFee;
    }

    @Override
    public String toString() {

        String fleetOfCars = "";
        for (Car car : fleet) {

            fleetOfCars += car.toString()+"\n";
        }
        return fleetOfCars;
    }
}
