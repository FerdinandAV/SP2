package org.example;

public class Main {
    public static void main(String[] Array) {
FleetOfCars fleetOfCars = new FleetOfCars();
        fleetOfCars.addCar(new GasolineCar("A2C B46","Audi","A6",4,15));
        fleetOfCars.addCar(new DieselCar("CFK 6A8", "Bmw", "W6",4,12,true));
        fleetOfCars.addCar(new ElectricCar("bz4x", "Toyota", "Supra ",2,64,400));

        System.out.println(fleetOfCars);
        System.out.println("Den totalte pris du skal betale: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr. ");
    }
}