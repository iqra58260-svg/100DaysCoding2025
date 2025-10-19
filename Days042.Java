package days042;

import java.util.Scanner;

public class Days042 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        // Input data gaji
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Masukkan tunjangan: Rp ");
        double tunjangan = input.nextDouble();
        
        System.out.print("Masukkan potongan (misal: pajak, BPJS, dll): Rp ");
        double potongan = input.nextDouble();
        
        // Hitung total gaji kotor dan gaji bersih
        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - potongan;
        
        // Tampilkan hasil
        System.out.println("\n=== RINCIAN GAJI ===");
        System.out.println("Gaji Pokok\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t: Rp " + tunjangan);
        System.out.println("Potongan\t: Rp " + potongan);
        System.out.println("--------------------------");
        System.out.println("Gaji Kotor\t: Rp " + gajiKotor);
        System.out.println("Gaji Bersih\t: Rp " + gajiBersih);
        
        // Percabangan untuk menilai gaji
        System.out.println("\n=== KETERANGAN ===");
        if (gajiBersih >= 10000000) {
            System.out.println("Selamat! Anda memiliki gaji tinggi 💰");
        } else if (gajiBersih >= 5000000) {
            System.out.println("Gaji Anda tergolong menengah 👍");
        } else if (gajiBersih > 0) {
            System.out.println("Gaji Anda tergolong rendah, tetap semangat! 💪");
        } else {
            System.out.println("Terjadi kesalahan pada perhitungan gaji!");
        }
        
    }
}
