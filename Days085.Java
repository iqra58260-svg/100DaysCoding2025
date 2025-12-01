package pkg100days;

public class Days085 {
    public static void main(String[] args) {
        int [] angka = {20,15,43,23,75};
        int max = angka[0];
        
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max){
                max = angka[i];
            }
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        System.out.println("Angka Maksimal Array Adalah "+max);
        
    }
}
