package com.khabane.util;

import com.khabane.model.Orbit;
import com.khabane.model.Vehicle;
import com.khabane.model.Weather;
import com.khabane.model.orbit.Orbit1;
import com.khabane.model.orbit.Orbit2;

public class VehicleSelector {

    public static String chooseVehicle(Weather weather, double orbit1TrafficSpeed, double orbit2TrafficSpeed) {
        Orbit orbit1 = new Orbit1();
        Orbit orbit2 = new Orbit2();

        VehicleSelector vehicleSelector = new VehicleSelector();
        double adjustedCraters1 = orbit1.getCraters() * weather.getCraterAdjustment();
        double adjustedCraters2 = orbit2.getCraters() * weather.getCraterAdjustment();
        Vehicle[] vehicles = weather.getVehiclesAllowed();

        String selectedOrbit = "Orbit1";
        double minTime = Double.MAX_VALUE;
        String selectedVehicle = null;

        for (Orbit currentOrbit : new Orbit[] { orbit1, orbit2 }) {
            for (Vehicle vehicle : vehicles) {

                double orbitTrafficSpeed = currentOrbit == orbit1 ? orbit1TrafficSpeed : orbit2TrafficSpeed;
                double adjustedCraters = currentOrbit == orbit1 ? adjustedCraters1 : adjustedCraters2;
                double travelTime = vehicleSelector.calculateTravelTime(vehicle, orbitTrafficSpeed, adjustedCraters,
                        orbitTrafficSpeed);

                if (travelTime < minTime) {
                    minTime = travelTime;
                    selectedOrbit = currentOrbit == orbit1 ? "Orbit1" : "Orbit2";
                    selectedVehicle = vehicle.getName();
                }
            }
        }

        return selectedVehicle + " on " + selectedOrbit;
    }

    public double calculateTravelTime(Vehicle vehicle, double megaMiles, double adjustedCraters,
            double trafficSpeed) {
        double vehicleSpeed = vehicle.getSpeed() > trafficSpeed ? trafficSpeed : vehicle.getSpeed();
        double effectiveSpeed = Math.min(vehicleSpeed, trafficSpeed);
        double totalTravelTime = (megaMiles * 60.0 / effectiveSpeed); 
        totalTravelTime += (adjustedCraters * vehicle.getTimeToCrossCrater()); 
        // System.out.println("Total travel time for " + vehicle.getName() + " is " + totalTravelTime + " minutes" + " on " + vehicleSpeed + " speed");
        return totalTravelTime;
    }
}
