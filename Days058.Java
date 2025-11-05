package pkg100days;

import java.util.Scanner;

public class Days058 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.println("\nAngka dari 1 ke " + N + ":");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= N);

        System.out.println("\n\nAngka dari " + N + " ke 1:");
        int j = N;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= 1);
    }
}
