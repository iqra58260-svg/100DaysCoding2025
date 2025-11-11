package pkg100days;

import java.util.Scanner;

public class Days064 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Angka M: ");
        int m = input.nextInt();
        System.out.print("Masukkan Angka N: ");
        int n = input.nextInt();
        int hasil = 1;
        for (int i = 0; i < n ; i++) {
//          pada bagian for jika dimulai dari 1 maka n+1 karena operator penugasan dibawah
            hasil *= m ;
        }System.out.println("Total dari "+m+" Pangkat "+n+" adalah: "+hasil);
    }
}
