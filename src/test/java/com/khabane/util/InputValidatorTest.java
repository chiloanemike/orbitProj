package com.khabane.util;

import com.khabane.exception.ValidationException;
import org.junit.Test;
import static org.junit.Assert.*;

public class InputValidatorTest {

    @Test
    public void testValidWeather() {
        try {
            InputValidator.validateWeather("Sunny");
            InputValidator.validateWeather("Rainy");
            InputValidator.validateWeather("Windy");
        } catch (ValidationException e) {
            fail("Valid weather input should not throw an exception.");
        }
    }

    @Test(expected = ValidationException.class)
    public void testInvalidWeather() throws ValidationException {
        InputValidator.validateWeather("Cloudy");
    }

    @Test
    public void testValidTrafficSpeed() {
        try {
            InputValidator.validateTrafficSpeed(10.0);
            InputValidator.validateTrafficSpeed(20.0);
        } catch (ValidationException e) {
            fail("Valid traffic speed input should not throw an exception.");
        }
    }

    @Test(expected = ValidationException.class)
    public void testInvalidTrafficSpeed() throws ValidationException {
        InputValidator.validateTrafficSpeed(-5.0);
    }

    
}

