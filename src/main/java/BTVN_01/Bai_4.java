package BTVN_01;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter full name
        System.out.print("Enter full name: ");
        String inputName = scanner.nextLine();

        // Enter birthday
        System.out.print("Enter birthday: ");
        String inputBirthday = scanner.nextLine();

        // Print the entered information
        System.out.println("Full name: "+inputName);
        System.out.println("Birthday: "+inputBirthday);

        scanner.close();
    }
}
