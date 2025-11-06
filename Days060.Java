package pkg100days;

import java.util.Scanner;

public class Days060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int i = 1;

        // Menampilkan bilangan ganjil
        System.out.println("\nBilangan Ganjil dari 1 sampai n-1:");
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < n);

        // Reset nilai i untuk genap
        i = 1;

        System.out.println("\n\nBilangan Genap dari 1 sampai n-1:");
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < n);

        System.out.println();
    }
}



