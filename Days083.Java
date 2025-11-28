package pkg100days;

import java.util.Scanner ;

public class Days83 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Berapa Indeks: ");
        int indeks = input.nextInt();
        int[] data = new int[indeks];
        int jumlah = 0;

        System.out.println("Masukkan "+indeks +" angka:");

        for (int i = 0; i < data.length; i++) {
            System.out.print("Angka ke-" + (i+1) + ": ");
            data[i] = input.nextInt();
            jumlah += data[i];
        }

        System.out.println("Jumlah seluruh elemen = " + jumlah);
    }
}
