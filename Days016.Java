
package days016;

import java.util.Scanner;

public class Days016 {

    public static void main(String[] args) {
     
            Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka:");
        double angka1 = input.nextDouble();
        System.out.print("Operasi:");
        char operasi = input.next().charAt(0);
        System.out.print("Masukkan Angka:");
        double angka2 = input.nextDouble();
        
         double hasil = 0;
if (operasi == '*'){
hasil = angka1*angka2;
}else if (operasi == '/'){
hasil = angka1/angka2;
}else
    
{System.out.println("Operasi Tidak Dikenal");
    }
System.out.println("Hasil:"+hasil);
     
    }
    
}
