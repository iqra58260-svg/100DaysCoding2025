package days031;

import java.util.Scanner;

public class Days031 {

    public static void main(String[] args) {
        int kehadiran = 6;
        int nilaimin= 75;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kehadiran Anda: ");
        int hadir = input.nextInt();
        System.out.print("Masukkan Nilai Anda: ");
        int nilai = input.nextInt();
        
        System.out.println("Lulus/Tidak Lulus");
        boolean hasil = (hadir >= kehadiran) && (nilai >= nilaimin);
        
        System.out.println("Lulus: "+hasil);
        
        
    }
    
}
