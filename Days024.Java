package days024;

import java.util.Scanner;

public class Days024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jari-jari
        System.out.print("Masukkan jari-jari lingkaran (cm): ");
        double r = input.nextDouble();

        // Rumus luas lingkaran: π * r^2
        double luas = Math.PI * r * r;

        // Output
        System.out.printf("Luas lingkaran dengan jari-jari %.2f cm adalah %.2f cm²\n", r, luas);

    }
}
