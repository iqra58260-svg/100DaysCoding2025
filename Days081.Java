package pkg100days;

import java.util.Scanner;

public class Days081{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array contoh
        int[] nilai = {70, 80, 90, 85, 75};

        System.out.println("=== DAY 81: AKSES ELEMEN ARRAY DENGAN INDEKS ===");
        System.out.println("Data array:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }

        System.out.println("\nMasukkan indeks yang ingin diakses: ");
        int index = input.nextInt();

        // Mengecek apakah indeks valid
        if (index >= 0 && index < nilai.length) {
            System.out.println("Nilai pada indeks " + index + " adalah: " + nilai[index]);
        } else {
            System.out.println("Indeks tidak valid! Harus antara 0 sampai " + (nilai.length - 1));
        }

        // Mengubah nilai pada indeks tertentu
        System.out.println("\nMasukkan indeks yang ingin diubah nilainya: ");
        int ubahIndex = input.nextInt();

        if (ubahIndex >= 0 && ubahIndex < nilai.length) {
            System.out.print("Masukkan nilai baru: ");
            int nilaiBaru = input.nextInt();

            nilai[ubahIndex] = nilaiBaru;
            System.out.println("Nilai berhasil diubah!");

        } else {
            System.out.println("Indeks tidak valid, tidak dapat mengubah data.");
        }

        // Menampilkan array setelah perubahan
        System.out.println("\n=== Data Array Setelah Perubahan ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }
    }
}
