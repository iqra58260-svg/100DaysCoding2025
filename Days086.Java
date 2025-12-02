package pkg100days;

public class Days086 {
    public static void main(String[] args) {
        int [] angka = {20,15,43,23,75};
        int min = angka[0];
        
        for (int i = 0; i < angka.length; i++) {
            if(angka[i] < min){
                min = angka [i];
            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        System.out.println("Angka Minimal Array Adalah "+min);
       

    }
}
