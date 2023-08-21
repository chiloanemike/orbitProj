package com.khabane.model.vehicle;

import com.khabane.model.Vehicle;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Tuktuk implements Vehicle {
    
    private double speed = 12;
    private double timeToCrater = 1/60;

    public Tuktuk(double speed, double timeToCrater) {
        this.speed = speed;
        this.timeToCrater = timeToCrater;
    }

    @Override
    public String getName() {
        return "Tuktuk";
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
