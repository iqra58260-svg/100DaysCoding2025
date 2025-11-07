package pkg100days;

import java.util.Scanner;

public class Days061 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
   
          System.out.print("Masukkan nilai N (batas akhir): ");
        int N = input.nextInt();
        System.out.print("Masukkan nilai M (kelipatan): ");
        int M = input.nextInt();
        int i = 1;
        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + " adalah: ");

        do {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= N);
    }
}
