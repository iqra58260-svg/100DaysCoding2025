package pkg100days;
import java.util.Scanner;
public class Days096 {
    
    static int tambah(int a, int b) { return a + b; }
    static int kurang(int a, int b) { return a - b; }
    static int kali(int a, int b)   { return a * b; }
    static double bagi(double a, double b) { return a / b; }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka A: ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka B: ");
        int b = input.nextInt();
        System.out.println("Tambah: " + tambah(a, b));
        System.out.println("Kurang: " + kurang(a, b));
        System.out.println("Kali   : " + kali(a, b));
        System.out.println("Bagi   : " + bagi(a, b));
        
    }
}
