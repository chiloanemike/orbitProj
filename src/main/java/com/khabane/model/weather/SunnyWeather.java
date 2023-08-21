package com.khabane.model.weather;

import com.khabane.model.Vehicle;
import com.khabane.model.Weather;
import com.khabane.model.vehicle.Bike;
import com.khabane.model.vehicle.Car;
import com.khabane.model.vehicle.Tuktuk;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SunnyWeather implements Weather {
    @Override
    public double getCraterAdjustment() {
        return 0.9; 
    }

    @Override
    public Vehicle[] getVehiclesAllowed() {
        return new Vehicle[] { new Car(),new Tuktuk(), new Bike() };
    }
}
