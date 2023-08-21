package com.khabane.util;

import com.khabane.exception.ValidationException;

public class InputValidator {
    public static void validateWeather(String weather) throws ValidationException {
        if (!weather.equals("Sunny") && !weather.equals("Rainy") && !weather.equals("Windy")) {
            throw new ValidationException("Invalid weather input. Options are 'Sunny', 'Rainy', and 'Windy'.");
        }
    }

    public static void validateTrafficSpeed(double speed) throws ValidationException {
        if (speed <= 0) {
            throw new ValidationException("Traffic speed must be a positive number.");
        }
    }
}