package pkg100days;

import java.util.Scanner;

public class Days074 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==== MENU PROGRAM ====");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Segitiga");
            System.out.println("3. Hitung Luas Persegi Panjang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    int s = input.nextInt();
                    System.out.println("Luas persegi = " + (s * s));
                    break;

                case 2:
                    System.out.print("Masukkan alas: ");
                    int a = input.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int t = input.nextInt();
                    System.out.println("Luas segitiga = " + (a * t / 2));
                    break;

                case 3:
                    System.out.print("Masukkan Panjang: ");
                    int panjang = input.nextInt();
                    System.out.print("Masukkan Lebar: ");
                    int lebar = input.nextInt();
                    System.out.println("Luas Persegi Panjang = "+(panjang * lebar));
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak ada!");
            }
        } while (pilihan != 0);  // ← ulang terus sampai pilih 0
    }
}
