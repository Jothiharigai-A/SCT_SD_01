import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // Method to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Method to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion you want to perform:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");

        int choice = scanner.nextInt();
        System.out.println("Enter the temperature value:");
        double inputTemp = scanner.nextDouble();
        double convertedTemp;

        switch (choice) {
            case 1:
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;
            case 2:
                convertedTemp = celsiusToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;
            case 3:
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;
            case 4:
                convertedTemp = fahrenheitToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;
            case 5:
                convertedTemp = kelvinToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;
            case 6:
                convertedTemp = kelvinToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
