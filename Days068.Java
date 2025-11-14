package pkg100days;

import java.util.Scanner;

public class Days068 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int n = input.nextInt();
        System.out.print("Masukkan Karakter: ");
        char kar = input.next().charAt(0);

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(kar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
