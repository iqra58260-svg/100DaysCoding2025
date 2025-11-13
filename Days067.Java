package pkg100days;

import java.util.Scanner;

public class Days067 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Karakter: ");
        char kar = input.next().charAt(0);
        System.out.print("Masukkan Jumlah Karakter: ");
        int jumlah = input.nextInt();
        System.out.println("\nMembuat baris dengan karakter " + "\""+kar+"\""+" sebanyak "+jumlah);
        for (int i = 1; i <= jumlah; i++) {
            System.out.print(kar);
        }System.out.println();
    }
    
}
