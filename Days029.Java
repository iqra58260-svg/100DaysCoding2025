package days029;

import java.util.Scanner;

public class Days029 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();
      
        System.out.println("Apakah "+a+" lebih kecil dari "+b+": " + (a < b));
            System.out.println("Apakah "+a+" lebih besar dari "+b+": " + (a > b));
}
}
