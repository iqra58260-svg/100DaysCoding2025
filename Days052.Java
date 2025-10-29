package pkg100days;

import java.util.Scanner;

public class Days052 {
   
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Masukkan Angka Minimal: ");
             int angka = input.nextInt();
        System.out.print("Masukkan Angka Maksimal: ");
             int angka1 = input.nextInt();

        while (angka <= angka1) {
            System.out.println("Angka ke-" + angka);
            angka++;
        }
    }
}
