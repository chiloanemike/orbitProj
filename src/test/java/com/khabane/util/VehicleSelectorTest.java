package com.khabane.util;
import com.khabane.model.Weather;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.khabane.model.weather.SunnyWeather;
import com.khabane.model.weather.WindyWeather;


public class VehicleSelectorTest {


    @Test
    public void testChooseVehicleC1() {
        Weather weather = new SunnyWeather(); 
        double orbit1TrafficSpeed = 12.0;
        double orbit2TrafficSpeed = 10.0;
        String selectedVehicle = VehicleSelector.chooseVehicle(weather, orbit1TrafficSpeed, orbit2TrafficSpeed);
        assertEquals("Tuktuk on Orbit1", selectedVehicle);
    }

     @Test
    public void testChooseVehicleC2() {
        Weather weather = new WindyWeather(); 
        double orbit1TrafficSpeed = 14.0;
        double orbit2TrafficSpeed = 20.0;
        String selectedVehicle = VehicleSelector.chooseVehicle(weather, orbit1TrafficSpeed, orbit2TrafficSpeed);
        assertEquals("Car on Orbit2", selectedVehicle);
    }

    @Test
    public void testEqualTieC1(){
        Weather weather = new SunnyWeather(); 
        double orbit1TrafficSpeed = 12.0;
        double orbit2TrafficSpeed = 12.0;
        String selectedVehicle = VehicleSelector.chooseVehicle(weather, orbit1TrafficSpeed, orbit2TrafficSpeed);
        assertEquals("Tuktuk on Orbit1", selectedVehicle);
    }


    // @Test
    // public void testTieC1() {
   
    //     Weather weather = new WindyWeather();
    //     double orbit1TrafficSpeed = 12.0;
    //     double orbit2TrafficSpeed = 20.0;
    //     VehicleSelector vehicleSelectorMock = Mockito.mock(VehicleSelector.class);
    //     when(vehicleSelectorMock.calculateTravelTime(any(Vehicle.class), anyDouble(), anyDouble(), anyDouble())).thenReturn(10.0);
    //     String selectedVehicle = VehicleSelector.chooseVehicle(weather, orbit1TrafficSpeed, orbit2TrafficSpeed);
       
    //     assertEquals("Bike on Orbit2", selectedVehicle);
    // }
  
        
       
}
