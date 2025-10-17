package days040;

import java.util.Scanner;

public class Days040 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        double angka = input.nextInt();
        System.out.print("Masukkan Operator: ");
        char operator = input.next().charAt(0);
        System.out.print("Masukkan Angka: ");
        double angka1 = input.nextInt();
        
        if (operator == '+' ){System.out.println("Total: "+ (angka+angka1));}
        else if (operator == '-' ){System.out.println("Total: "+ (angka-angka1));}
        else if (operator == '*' ){System.out.println("Total: "+ (angka*angka1));}
        else if (operator == '/' ){System.out.println("Total: "+ (angka/angka1));}
        else {System.out.println("ERROR!!");}
    }
    
}
