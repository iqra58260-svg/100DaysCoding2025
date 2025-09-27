package days020;

import java.util.Scanner;

public class Days020 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Deklarasi variabel primitif
        System.out.print("Masukkan Angka 1:");
        int angkaInt = input.nextInt();
        System.out.print("Masukkan Angka 2:");
        byte angkaByte = input.nextByte();
        System.out.print("Masukkan Angka 3:");
        short angkaShort = input.nextShort();
        System.out.print("Masukkan Angka 4:");
        long angkaLong = input.nextLong();
        System.out.print("Masukkan Angka 5:");
        double angkaDouble = input.nextDouble();

        // Konversi primitif ke String menggunakan String.valueOf()
        String strInt = String.valueOf(angkaInt);
        String strByte = String.valueOf(angkaByte);
        String strShort = String.valueOf(angkaShort);
        String strLong = String.valueOf(angkaLong);
        String strDouble = String.valueOf(angkaDouble);

        // Tampilkan hasil konversi
        System.out.println("Hasil konversi Int ke String\t: " + strInt);
        System.out.println("Hasil konversi Byte ke String\t: " + strByte);
        System.out.println("Hasil konversi Short ke String\t: " + strShort);
        System.out.println("Hasil konversi Long ke Stringt\t: " + strLong);
        System.out.println("Hasil konversi Double ke String\t: " + strDouble);

    }
}
