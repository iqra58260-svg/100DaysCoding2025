package pkg100days;
import java.util.Scanner;
public class Days097 {
    static int luasPersegi(int sisi) {
    return sisi * sisi;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Sisi: ");
    int sisi = input.nextInt();
    System.out.println("Luas persegi: " + luasPersegi(sisi));
}

}
