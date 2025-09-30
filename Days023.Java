package days023;

import java.util.Scanner;

public class Days023 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        // Input panjang dan lebar
        System.out.print("Masukkan Panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan Lebar: ");
        double lebar = input.nextDouble();

        // Hitung luas dan keliling
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Output hasil
        System.out.printf("Luas Persegi Panjang adalah: %.2f\n", luas);
        System.out.printf("Keliling Persegi Panjang adalah: %.2f\n", keliling);
    }
}
