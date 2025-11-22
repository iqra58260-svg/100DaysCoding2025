package pkg100days;

import java.util.Scanner;

public class Days076 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String user = "Iqra14";
        String pw = "InformatikaB";
        
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        
        // Mengecek apakah username kosong
        if (username.isEmpty()) {
            System.out.println("Username tidak boleh kosong!");
            return;
        }
        
        // Mengecek apakah username mengandung spasi (contoh penggunaan contains)
        if (username.contains(" ")) {
            System.out.println("Username tidak boleh mengandung spasi!");
            return;
        }

        // equalsIgnoreCase → Mengecek tidak sensitif huruf
        if (username.equalsIgnoreCase(user)) {
            
            // equals → Harus sama persis (sensitif huruf)
            if (!username.equals(user)) {
                System.out.println("Catatan: Username benar, tetapi format huruf tidak sesuai (equals).");
            }

            System.out.println("Username Anda Benar");
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();
            
            // Mengecek apakah password kosong
            if (password.isEmpty()) {
                System.out.println("Password tidak boleh kosong!");
                return;
            }
            
            // contains → contoh pengecekan apakah password harus mengandung karakter tertentu
            if (!password.contains("B")) {
                System.out.println("Password harus mengandung huruf 'B'.");
            }

            if (password.equalsIgnoreCase(pw)) {
                System.out.println("Password Anda Benar");
                System.out.println("Login Berhasil!!");
            } else {
                System.out.println("Password yang Anda masukkan salah!");
                System.out.println("Login Gagal!!");
            }
            
        } else {
            System.out.println("USERNAME ANDA TIDAK TERDAFTAR!!");
            System.out.println("PENYUSUP!!");
        }
    }
}
