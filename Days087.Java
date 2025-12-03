package pkg100days;
import java.util.Scanner;
public class Days087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int[] data = {48, 75, 22, 39, 31, 59,53,12,65,11,54};
          System.out.print("Masukkan Angka yang Anda ingin cari: ");
        int cari = input.nextInt(); // nilai yang dicari
        boolean ditemukan = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                System.out.println("Angka " + cari + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array.");
        }
    }
}
