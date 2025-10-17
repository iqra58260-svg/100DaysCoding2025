package days039;

import java.util.Scanner;

public class Days039 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("===== MENU KANTIN =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Es Teh Manis");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan Anda (1-5): ");
        pilihan = input.nextInt();

        System.out.println("------------------------");

        // Struktur if untuk menentukan hasil pilihan
        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng.");
            System.out.println("Harga: Rp 15.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam.");
            System.out.println("Harga: Rp 12.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Soto Ayam.");
            System.out.println("Harga: Rp 14.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Anda memilih Es Teh Manis.");
            System.out.println("Harga: Rp 5.000");
        } 
        else if (pilihan == 5) {
            System.out.println("Terima kasih telah berkunjung!");
        } 
        else {
            System.out.println("Pilihan tidak tersedia. Silakan coba lagi!");
        }

        System.out.println("========================");
    }
}
