package days038;

import java.util.Scanner;

public class Days038 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        
        if (angka == 0){System.out.println("Angka Ini adalah Angka Nol");}
        else if (angka < 0){System.out.println("Angka Ini adalah Angka Negatif");}
        else {System.out.println("Angka Ini adalah Angka Positif");}
    }
    
}
