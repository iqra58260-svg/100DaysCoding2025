package days028;

import java.util.Scanner;

public class Days028 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nilai a: ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai b: ");
        int b = input.nextInt();
        System.out.print("Masukkan Nilai c: ");
        int c = input.nextInt();
        
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        
        // Operator ==
        System.out.println("Apakah a sama dengan b? " + (a == b));
        System.out.println("Apakah a sama dengan c? " + (a == c));
        
        // Operator !=
        System.out.println("Apakah a tidak sama dengan b? " + (a != b));
        System.out.println("Apakah b tidak sama dengan c? " + (b != c));

    }
}
