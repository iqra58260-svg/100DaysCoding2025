package pkg100days;

import java.util.Scanner;

public class Days055 {
      public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();

        do {
            System.out.print("Masukkan Angka: ");
            angka = input.nextInt();
            angka ++;
            continue;
        } while (angka == 100);
        }
}    
