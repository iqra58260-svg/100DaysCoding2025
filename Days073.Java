package pkg100days;

import java.util.Scanner;

public class Days073 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int hasil = 0;
        
        for (int i = 0;; i++) {
            System.out.print("Masukkan Angka: ");
            int angka = input.nextInt();
            
            if (angka >= 0 ){
                hasil += angka;
                System.out.println(hasil);
            }else if(angka < 0){
                System.out.println("ANDA MENGINPUTKAN ANGKA NEGATIF!");
                System.out.println("TOTAL = "+hasil);
                break;
            }else{
                System.out.println("ERROR!!");
            }
        }
    }
    
}
