package BTVN_01;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double inputLength = scanner.nextDouble();
        // Enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double inputWidth = scanner.nextDouble();

        // Calculate the area of the rectangle
        double S = inputLength * inputWidth;
        // Calculate the perimeter of the rectangle
        double C = (inputLength + inputWidth)*2;

        // Print the area of the rectangle
        System.out.println("the area of the rectangle: "+S);
        // Print the perimeter of the rectangle
        System.out.println("the perimeter of the rectangle: "+C);

        scanner.close();
    }
}
