package days021;

import java.util.Scanner;

public class Days021 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENUKAR NILAI DUA VARIABEL");
        System.out.print("Masukkan Angka\t: ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka\t: ");
        int b = input.nextInt();
        
        System.out.println("\nSEBELUM");
        System.out.println("Nilai Variabel Pertama\t: " + a);
        System.out.println("Nilai Variabel Kedua\t: " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nSESUDAH");
        System.out.println("Nilai Variabel Pertama\t: " + a);
        System.out.println("Nilai Variabel Kedua\t: " + b);
    }
    
}
