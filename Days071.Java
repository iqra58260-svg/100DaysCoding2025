package pkg100days;

import java.util.Scanner;

public class Days071 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int n = input.nextInt();
        System.out.print("Masukkan Karaker: ");
        char karakter = input.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(karakter+"");
            }
            System.out.println();
        }
    }
}
