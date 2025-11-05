package pkg100days;

import java.util.Scanner;

public class Days059 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        int i = 1;
        System.out.println("Angka Ganjil:");
        do {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= n);

        i = 1; // reset nilai i
        
        System.out.println("\nAngka Genap:");
        do {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= n);
    }
}


