package days044;

import java.util.Scanner;

public class Days044 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Anda: ");
        int nilai = input.nextInt();
        
        if (nilai <60){
            System.out.println("Nama: "+nama);
            System.out.println("Tidak lulus");
        }else if(nilai < 75){
            System.out.println("Nama: "+nama);
            System.out.println("Cukup");  
        }else if(nilai < 90){
            System.out.println("Nama: "+nama);
            System.out.println("Cukup Baik");
        }else {
            System.out.println("Nama: "+nama);
            System.out.println("Sangat Baik");
        }
      
        }
    }
    

