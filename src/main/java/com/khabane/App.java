package com.khabane;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.khabane.exception.InvalidWeatherException;
import com.khabane.exception.ValidationException;
import com.khabane.factory.WeatherFactory;
import com.khabane.util.InputValidator;
import com.khabane.util.VehicleSelector;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Input: Enter weather Conditions Options ['Sunny', 'Rainy', 'Windy']: ");
                String weather = scanner.nextLine();
                System.out.print("Input: Enter orbit1 traffic speed (megamiles/hour): ");
                double orbit1TrafficSpeed = scanner.nextDouble();
                System.out.print("Input: Enter orbit2 traffic speed (megamiles/hour): ");
                double orbit2TrafficSpeed = scanner.nextDouble();
                InputValidator.validateWeather(weather);
                InputValidator.validateTrafficSpeed(orbit1TrafficSpeed);
                InputValidator.validateTrafficSpeed(orbit2TrafficSpeed);

                System.out
                        .println("Output: Vehicle "
                                + VehicleSelector.chooseVehicle(WeatherFactory.getWeatherInstance(weather),
                                        orbit1TrafficSpeed, orbit2TrafficSpeed));
                System.out.print("Do you want to continue? (Y/N): ");
                scanner.nextLine();

            } catch (ValidationException e) {
                System.out.println(e.getMessage());
                System.out.print("Do you want to continue? (Y/N): ");
                scanner.nextLine();
                continue;

            } catch (InputMismatchException e) {
                System.out.println("Invalid Speed. Please try again and enter a valid speed.");
                System.out.print("Do you want to continue? (Y/N): ");
                scanner.nextLine();
                continue;
            }

        } while (scanner.nextLine().equalsIgnoreCase("Y"));
        scanner.close();

    }

}
