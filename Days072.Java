package pkg100days;

import java.util.Scanner;

public class Days072 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Tinggi Segitiga: ");
        int n = input.nextInt();
        System.out.print("Masukkan Karakter: ");
        char k = input.next().charAt(0);

        // --- Segitiga Rata Kanan ---
        System.out.println("\nSegitiga Rata Kanan:");
        for (int i = 0; i < n; i++) {

            // spasi di depan
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // kar
            for (int j = n - i; j > 0; j--) {
                System.out.print(k);
            }

            System.out.println();
        }

        // --- Segitiga Rata Kiri ---
        System.out.println("\nSegitiga Rata Kiri:");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
