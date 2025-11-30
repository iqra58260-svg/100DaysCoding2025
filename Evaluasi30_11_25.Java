package pkg100days;
import java.util.Scanner;
public class ICL3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        SOAL 1
        int N = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" * "+N+" = "+(i*N));
}
//        SOAL 2
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Iccang");
        }
//      SOAL 3
        String teks = input.nextLine();
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(teks);
        }
    }
    
}
