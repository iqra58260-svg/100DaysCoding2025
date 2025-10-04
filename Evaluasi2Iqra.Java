package evaluasi2;

import java.util.Scanner;

public class EVALUASI2 {
    public static void main(String[] args) {
//  TUGAS 1 EVALUASI
      Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Rumah: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar Rumah: ");
        int lebar = input.nextInt();
        
        int hasil = panjang*lebar;
        int hasilakhir = hasil / 4;
        
        System.out.println("Total Keramik yang digunakan: "+hasilakhir);
        
//  TUGAS 2  EVALUASI        
        System.out.print("Masukkan Nilai A: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan Nilai B: ");
        int b = input.nextInt();
        
        System.out.println("SEBELUM");
        System.out.println("Nilai Variabel A: "+a);
        System.out.println("Nilai Variabel B: "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("SESUDAH");
        System.out.println("Nilai Variabel A: "+a);
        System.out.println("Nilai Variabel B: "+b);
    }
    
}
