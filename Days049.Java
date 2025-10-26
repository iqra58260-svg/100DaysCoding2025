package pkg100days;

import java.util.Scanner;

public class Days049 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
        String hasil = (nilai >= 75) ? "Lulus":"Tidak Lulus";
        
        System.out.println(hasil);
    }
   
}
