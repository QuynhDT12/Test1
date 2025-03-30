package BTVN_01;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int inputInteger = scanner.nextInt();
        if (inputInteger%2 == 0)
        {
            System.out.println("This is an even number");
        }
        else
        {
            System.out.println("This is an odd number");
        }
        scanner.close();
    }
}
