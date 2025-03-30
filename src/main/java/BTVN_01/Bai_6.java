package BTVN_01;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the temperature in Celsius (C)
        System.out.print("Enter the temperature in Celsius (C): ");
        double inputCelsius = scanner.nextDouble();

        // Convert it to Fahrenheit (F)
        double fahrenheit = inputCelsius * 9/5;

        // Print the Fahrenheit
        System.out.println("Fahrenheit is: "+fahrenheit);

        scanner.close();
    }
}
