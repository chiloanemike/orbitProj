package com.khabane.factory;

import java.util.HashMap;
import java.util.Map;

import com.khabane.exception.WeatherFactoryException;
import com.khabane.model.Weather;
import com.khabane.model.weather.RainyWeather;
import com.khabane.model.weather.SunnyWeather;
import com.khabane.model.weather.WindyWeather;

public class WeatherFactory {
    private static final Map<String, Class<? extends Weather>> weatherMap = new HashMap<>();

    static {
        weatherMap.put("Rainy", RainyWeather.class);
        weatherMap.put("Windy", WindyWeather.class);
        weatherMap.put("Sunny", SunnyWeather.class);
    }

    public static Weather getWeatherInstance(String weather) {
        try {
        
            Class<? extends Weather> weatherClass = weatherMap.get(weather);
            return weatherClass.getDeclaredConstructor().newInstance();
        } catch (Exception  e) {
            return null;
        }
    }
}
