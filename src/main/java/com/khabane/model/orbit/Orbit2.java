package com.khabane.model.orbit;

import com.khabane.model.Orbit;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Orbit2 implements Orbit {
    
    private int distance = 20;
    private int craters = 10;    
 
    
    @Override
    public int getDistance() {
        return distance;
    }
    
    @Override
    public int getCraters() {
        return craters;
    }


}
