/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg100days;
import java.util.Scanner;
/**
 *
 * @author Iqra
 */
public class Days078 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Input dari user
        System.out.print("Masukkan kata pertama : ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua   : ");
        String kata2 = input.nextLine();

        System.out.println("\n=== HASIL PEMERIKSAAN STRING ===");

        // 1. equals()
        System.out.println("1. equals()");
        System.out.println("Apakah kata1 sama persis dengan kata2? → " + kata1.equals(kata2));

        // 2. equalsIgnoreCase()
        System.out.println("\n2. equalsIgnoreCase()");
        System.out.println("Apakah sama tanpa peduli besar/kecil huruf? → " + kata1.equalsIgnoreCase(kata2));

        // 3. contains()
        System.out.println("\n3. contains()");
        System.out.println("Apakah kata1 mengandung kata2? → " + kata1.contains(kata2));
        System.out.println("Apakah kata2 mengandung kata1? → " + kata2.contains(kata1));

        // 4. isEmpty()
        System.out.println("\n4. isEmpty()");
        System.out.println("Apakah kata1 kosong? → " + kata1.isEmpty());
        System.out.println("Apakah kata2 kosong? → " + kata2.isEmpty());

        // Tambahan: Cek Jika User Mengisi Kosong
        if (kata1.isEmpty() || kata2.isEmpty()) {
            System.out.println("\nPERINGATAN: Ada input yang kosong!");
        }
    }


}
