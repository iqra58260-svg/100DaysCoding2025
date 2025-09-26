package days019;

import java.util.Scanner;

public class Days019 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka:");
        double nilaiDouble = input.nextDouble();

        // Konversi manual 
        float nilaiFloat = (float) nilaiDouble;  // double ke float
        long nilaiLong = (long) nilaiFloat;      // float ke long
        int nilaiInt = (int) nilaiLong;          // long ke int
        short nilaiShort = (short) nilaiInt;     // int ke short    
        byte nilaiByte = (byte) nilaiShort;      // short ke byte

        // Cetak hasil
        System.out.println("Nilai awal (double) : " + nilaiDouble);
        System.out.println("Setelah ke float    : " + nilaiFloat);
        System.out.println("Setelah ke long     : " + nilaiLong);
        System.out.println("Setelah ke int      : " + nilaiInt);
        System.out.println("Setelah ke short    : " + nilaiShort);
        System.out.println("Setelah ke byte     : " + nilaiByte);
    }
}
