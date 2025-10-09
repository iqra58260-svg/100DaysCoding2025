package days032;

import java.util.Scanner;

public class Days032 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda anggota aktif? (Y/N): ");
        char anggota = input.next().charAt(0);

        System.out.print("Apakah Anda memiliki kartu tamu? (Y/N): ");
        
        char kartuTamu = input.next().charAt(0);

        boolean bolehMasuk = (anggota == 'Y') || (kartuTamu == 'Y');

        System.out.println("Apakah boleh masuk ruangan? " + bolehMasuk);

    }
}
