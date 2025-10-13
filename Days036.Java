package days036;

import java.util.Scanner;

public class Days036 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);       
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90) {
                System.out.println("Kategori: A (Sangat Baik)");
            } else if (nilai >= 80) {
                System.out.println("Kategori: B (Baik)");
            } else if (nilai >= 70) {
                System.out.println("Kategori: C (Cukup)");
            } else if (nilai >= 60) {
                System.out.println("Kategori: D (Kurang)");
            } else {
                System.out.println("Kategori: E (Gagal)");
            }
        } else {
            System.out.println("Nilai tidak valid! Masukkan antara 0 sampai 100.");
        }
    }
}
