package com.khabane.exception;

public class WeatherFactoryException extends RuntimeException {
    public WeatherFactoryException(String message) {
        super(message);
    }

    public WeatherFactoryException(String message, Throwable cause) {
        super(message, cause);
    }
}

