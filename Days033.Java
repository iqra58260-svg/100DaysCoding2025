package java033.java;

import java.util.Scanner;

public class Java033Java {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Apakah lampu menyala? (true/false): ");
        boolean lampuMenyala = input.nextBoolean();

        // Operator NOT membalik nilai boolean
        boolean lampuMati = !lampuMenyala;

        System.out.println("Lampu menyala: " + lampuMenyala);
        System.out.println("Lampu mati: " + lampuMati);

        input.close();
    }
}

