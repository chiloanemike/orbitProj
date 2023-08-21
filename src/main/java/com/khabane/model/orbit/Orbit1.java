package com.khabane.model.orbit;

import com.khabane.model.Orbit;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Orbit1 implements Orbit {
    
    private int distance = 18;
    private int craters = 20;    
 
    
    @Override
    public int getDistance() {
        return distance;
    }
    
    @Override
    public int getCraters() {
        return craters;
    }


}
