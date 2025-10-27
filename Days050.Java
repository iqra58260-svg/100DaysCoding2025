
package pkg100days;

import java.util.Scanner;

public class Days050 {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        
        String hasil = (angka %2==0)?"Angka ini Genap":"Angka ini Ganjil";
        System.out.println(hasil);
    }
}
