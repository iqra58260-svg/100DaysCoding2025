package pkg100days;

import java.util.Scanner;

public class Days066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        int N = input.nextInt();
        System.out.println("Vertikal");
        for (int i = 1; i <= N; i++) {
            System.out.println("o");
        }
    }
}
