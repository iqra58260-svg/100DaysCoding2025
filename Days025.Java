package days025;

import java.util.Scanner;

public class Days025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka x: ");
        int x = input.nextInt();
        System.out.print("Masukkan Angka y: ");
        int y = input.nextInt();
        
//      post-increment
        System.out.println("Cetak dengan x++ langsung: " + (x++));
        System.out.println("Nilai setelah x++ : " + x);

//      pre-increment
        System.out.println("Cetak dengan ++x langsung: " + (++x));
        System.out.println("Nilai setelah ++x : " + x);
        
//      post-decrement
        System.out.println("Cetak dengan y-- langsung: " + (y--));
        System.out.println("Nilai setelah y-- : " + y);

//      pre-decrement
        System.out.println("Cetak dengan --y langsung: " + (--y));
        System.out.println("Nilai setelah --y : " + y);

    }
}
