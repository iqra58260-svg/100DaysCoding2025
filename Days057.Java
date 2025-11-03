package pkg100days;
public class Days057 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) { // Loop luar
            for (int j = 1; j <= i; j++) { // Loop dalam
                System.out.print("* ");
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
