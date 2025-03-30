package BTVN_01;

import java.util.Scanner;

public class Bai_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử trong mảng:");
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i=0; i < n; i++) {
            System.out.print("Nhập phần tử thứ "+(i+1)+" :");
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        for (int i=0; i < n; i++) {
            if (max <= a[i])
            {
                max = a[i];
            }
        }

        System.out.println("Phần tử lớn nhất là: "+max);
        scanner.close();
    }
}
