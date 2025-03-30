package BTVN_01;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương số "+i);
            for (int j = 1; j <=10; j++) {
                int s = i*j;
                System.out.println(i+"x"+j+"="+s);
            }
        }
    }
}
