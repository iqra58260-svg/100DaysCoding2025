/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days11;

import java.awt.Button;
import java.util.Scanner;

/**
 *
 * @author Iqra
 */
public class Days11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama:") ;
    String nama = sc.nextLine();
            System.out.print("Masukkan Umur:");
            int umur = sc.nextInt();
            System.out.print("Tinggi Badan:") ;
    double tb = sc.nextDouble();
     System.out.print("Berat Badan:") ;
    String bb = sc.next();
     System.out.print("Tempat Lahir:");
    String tempat = sc.next();
         System.out.print("Tanggal Lahir:");
    String tanggal = sc.next();
         System.out.print("Bulan Lahir:");
    String bulan = sc.next();
         System.out.print("Tahun Lahir:");
    int tahun = sc.nextInt();
        System.out.print("Tahun Lulus:");
        int lulus = sc.nextInt();              
         
       System.out.println("Masukkan Nama\t\t:" +nama);
        System.out.println("Masukkan Umur\t\t:" +umur);
        System.out.println("Tinggi Badan\t\t:" +tb);
        System.out.println("Berat Badan\t\t:" +bb);
        System.out.print("Tempat, Tanggal Lahir\t:" +tempat);
        System.out.println("," +tanggal+bulan+tahun);
        System.out.println("Tahun Lulus\t\t:" +lulus); 
    }
}

