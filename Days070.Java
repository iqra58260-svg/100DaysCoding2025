package pkg100days;

import java.util.Scanner;

public class Days070 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

         System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan Lebar: ");
        int lebar = input.nextInt();
        
        System.out.print("Masukkan Karakter: ");
        char karakter = input.next().charAt(0);

        // Mencetak persegi panjang
        for (int i = 1; i <= lebar; i++) {        // Lebar = jumlah baris
            for (int j = 1; j <= panjang; j++) {  // Panjang = jumlah kolom
                System.out.print(karakter+" ");
            }
            System.out.println();
        }
    }
}
