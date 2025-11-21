package pkg100days;

import java.util.Scanner;

public class Days075 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("MENGITUNG BERAPA HURUF DALAM KATA YANG ANDA MASUKKAN");
        System.out.println("MENGUBAH HURUF KE HURUF BESAR DAN KE HURUF KECIL");
        System.out.print("Masukkan Kata atau Kalimat: ");
        String kata = input.nextLine();
        
        System.out.println("Huruf Besar: "+kata.toUpperCase());
        System.out.println("Huruf Kecil: "+kata.toLowerCase());
        System.out.println("Jumlah Huruf: "+kata.length());
        System.out.println("NOTE!!");
        System.out.println("Apapun yang Anda masukkan akan terhitung seperti tab, spasi, dll.");
    }
    
}
