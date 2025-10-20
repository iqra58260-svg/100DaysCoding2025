package days043;

import java.util.Scanner;

public class Days043 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        System.out.println("\nHasil:");
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " -> Kelipatan 3 dan 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " -> Kelipatan 3");
            } else if (i % 5 == 0) {
                System.out.println(i + " -> Kelipatan 5");
            } else {
                System.out.println(i + " -> Bukan kelipatan 3 atau 5");
            }
        }
    }
}

