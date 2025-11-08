package days062;

import java.util.Scanner;

public class Days062 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();
        int i = 1;
        int hasil = 0;
        do {
            hasil += i;            
            i++;
        } while (i <= N);
        System.out.println(hasil);
    }
}
