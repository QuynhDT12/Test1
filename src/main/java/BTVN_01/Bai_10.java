package BTVN_01;

import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giờ làm:");
        double soGioLam = scanner.nextDouble();
        System.out.print("Nhập lương mỗi giờ:");
        double luongGio = scanner.nextDouble();

        if (soGioLam <= 40)
        {
            System.out.printf("Tổng lương: %f",soGioLam*luongGio);
        }
        else
        {
            System.out.printf("Tổng lương: %f",(40*luongGio)+((soGioLam-40)*luongGio*1.5));
        }

        scanner.close();
    }
}
