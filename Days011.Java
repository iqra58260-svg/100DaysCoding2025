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
        System.out.println("Masukkan Nama:") ;
    String nama = sc.nextLine();
            System.out.println("Masukkan Umur:");
            int umur = sc.nextInt();
            System.out.println("Masukkan NIM:") ;
    String NIM = sc.next();
     System.out.println("Program Studi:") ;
    String prodi = sc.next();
     System.out.println("Fakultas:") ;
    String fakultas = sc.next();
     System.out.println("Nama Kampus:") ;
    String kampus = sc.next();
         
       System.out.println("Masukkan Nama:" +nama);
        System.out.println("Masukkan Umur:" +umur);
        System.out.println("Masukkan NIM:" +NIM);
        System.out.println("Program Studi:" +prodi);
        System.out.println("Fakultas:" +fakultas);
        System.out.println("Nama Kampus:" +kampus);
       
    }
}

