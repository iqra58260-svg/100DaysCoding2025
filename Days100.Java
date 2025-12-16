package pkg100days;

import java.util.Scanner;

public class Days100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean adaI = false;
        boolean adaS = false;
        boolean cantik = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'I') {
                adaI = true;
            } 
            else if (ch == 'S' && adaI) {
                adaS = true;
            } 
            else if (ch == 'C' && adaI && adaS) {
                cantik = true;
                break;
            }
        }

        if (cantik) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
