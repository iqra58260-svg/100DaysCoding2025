package pkg100days;

import java.util.Scanner;

public class Days079 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String user = "Iqra14";
        String pw   = "InformatikaB";
        
        String username;
        String password;

        // Loop untuk username
        while (true) {
            System.out.print("Masukkan Username Anda : ");
            username = input.nextLine();

            if (username.equalsIgnoreCase(user)) {
                System.out.println("USERNAME BENAR");
                break; // lanjut ke cek password
            } else {
                System.out.println("USERNAME SALAH! Silakan coba lagi.\n");
            }
        }

        // Loop untuk password
        while (true) {
            System.out.print("Masukkan Password Anda : ");
            password = input.nextLine();

            if (password.equalsIgnoreCase(pw)) {
                System.out.println("PASSWORD BENAR");
                System.out.println("LOGIN BERHASIL!");
                break; // selesai login
            } else {
                System.out.println("PASSWORD SALAH! Silakan coba lagi.\n");
            }
        }

        input.close();
    }
}
