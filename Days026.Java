package days026;

import java.util.Scanner;

public class Days026 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka: ");
        int angka2 = input.nextInt();
        
        System.out.println("PENJUMLAHAN: " + (angka1 += angka2));
        System.out.println("PENGURANGAN: " + (angka1 -= angka2));
        System.out.println("PERKALIAN: " + (angka1 *= angka2));
        System.out.println("PEMBAGIAN: " + (angka1 /= angka2));
        System.out.println("SISA BAGI: " + (angka1 &= angka2));

    }
}

