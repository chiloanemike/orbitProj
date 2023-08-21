package com.khabane.model.vehicle;

import com.khabane.model.Vehicle;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Car implements Vehicle {
    private double speed = 20.0;
    private double timeToCrossCrater = 3.0 / 60.0; // 3 minutes in hours
    
    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getTimeToCrossCrater() {
        return timeToCrossCrater;
    }
}
