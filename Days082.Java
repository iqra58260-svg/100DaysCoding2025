package pkg100days;

import java.util.Scanner;

public class Days082 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Indeks: ");
        int cek = input.nextInt();
        int[] nilai = new int[cek];

        // Mengisi array dengan input user
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("\nData yang dimasukkan:");
        
        // Menampilkan isi array
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai indeks " + i + " = " + nilai[i]);
        }
    }
}
