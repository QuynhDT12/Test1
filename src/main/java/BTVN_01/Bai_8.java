package BTVN_01;

import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int n = scanner.nextInt();
        int s = 0;

        for (int i = 0; i <= n; i++) {
            s = s + i;
        }

        System.out.println("The sum of the entered numbers:"+s);

        scanner.close();
    }
}
