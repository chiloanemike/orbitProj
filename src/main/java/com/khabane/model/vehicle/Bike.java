package com.khabane.model.vehicle;

import com.khabane.model.Vehicle;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Bike implements Vehicle{

    private double speed = 10;
    private double timeToCrater = 2/60;


    @Override
    public String getName() {
        return "Bike";
    }

    @Override
    public double getSpeed() {
        return speed;
    }
    @Override
    public double getTimeToCrossCrater() {
        return timeToCrater;
    }
    
}
