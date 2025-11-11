
package Days063;

import java.util.Scanner;


public class Days063 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Masukkan Angka:");
        int n = input.nextInt();
        
        int jumlah = 1;
        
        for(int i = 1;i<=n; i++){
            jumlah *= i;
            
        }
        System.out.println(jumlah);
        
    }
}
