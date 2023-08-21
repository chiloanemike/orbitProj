package com.khabane.model.weather;

import com.khabane.model.Vehicle;
import com.khabane.model.Weather;
import com.khabane.model.vehicle.Bike;
import com.khabane.model.vehicle.Car;
import com.khabane.model.vehicle.Tuktuk;

public class WindyWeather implements Weather {
    @Override
    public double getCraterAdjustment() {
        return 1.0; 
    }

    @Override
    public Vehicle[] getVehiclesAllowed() {
        return new Vehicle[] {new Car(),new Tuktuk(),  new Bike() };
    }
}
