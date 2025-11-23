package pkg100days;

import java.util.Scanner;

public class Days077 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // trim
        String t = kalimat.trim();

        // substring contoh (0–3)
        String s = (t.length() >= 3) ? t.substring(0, 3) : t;

        // replace contoh
        String r = t.replace("a", "A");

        System.out.println("Trim     : " + t);
        System.out.println("Substring: " + s);
        System.out.println("Replace  : " + r);
    }
}
