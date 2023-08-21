package com.khabane.exception;

public class InvalidWeatherException extends RuntimeException {
    public InvalidWeatherException(String message) {
        super(message);
    }

    public InvalidWeatherException(String message, Throwable cause) {
        super(message, cause);
    }
}
