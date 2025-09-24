package days017;

import java.util.Scanner;

class Days017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka:");
        int a = sc.nextInt(); 
        System.out.print("Masukkan Angka:");
        int b = sc.nextInt();

        // Operasi bagi
        int hasilBagi = a / b;   // hasil pembagian bulat
        int sisaBagi = a % b;    // sisa pembagian (modulus)

        // Cetak hasil
        System.out.println("Bilangan a = " + a);
        System.out.println("Bilangan b = " + b);
        System.out.println("Hasil pembagian (a / b) = " + hasilBagi);
        System.out.println("Sisa bagi (a % b) = " + sisaBagi);
        
    }
    
}
