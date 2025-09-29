package days022;

import java.util.Scanner;

public class Days022 {

    public static void main(String[] args) {
              Scanner input = new Scanner(System.in);

        // Input sisi persegi
        System.out.print("Masukkan Panjang Sisi Persegi (cm): ");
        double sisi = input.nextDouble();

        // Hitung luas
        double luas = sisi * sisi;

        // Tampilkan hasil dengan format 2 angka di belakang koma
        System.out.printf("Luas Persegi dengan Sisi %.2f cm adalah %.2f cm² \n", sisi, luas);

    }
    
}
