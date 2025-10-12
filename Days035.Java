package days035;

import java.util.Scanner;

public class Days035 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int angka = input.nextInt();
        int minimal = 75;
        
        if (angka < minimal){System.out.println("Nilai Anda: "+angka);
        System.out.println("Remedial");}
        else {System.out.println("Nilai Anda: "+angka);
            System.out.println("Lulus");
    }
}
    }
