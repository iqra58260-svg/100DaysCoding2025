package eval1;
public class Eval1 {

    public static void main(String[] args) {
//        Tugas 1
        String nama = "Budi";
        byte umur = 21;
        double tb = 170.5;
        float bb =65.4f;
        int kelas = 12;
        short sks = 144;
        String nim = "D0223033";
        char jk = 'L';
        boolean aktif = true;
        
        System.out.print("Nama:");
        System.out.println(nama);
        System.out.print("Umur:");
        System.out.println(umur);
        System.out.print("Tinggi Badan:");
        System.out.println(tb);
        System.out.print("Berat Badan:");
        System.out.println(bb);
        System.out.print("Kelas:");
        System.out.println(kelas);
        System.out.print("Sks:");
        System.out.println(sks);
        System.out.print("NIM:");
        System.out.println(nim);
        System.out.print("Jenis Kelamin:");
        System.out.println(jk);
        System.out.println(aktif);
        
        System.out.println("\nData Diri");
//        penggunaan printf
System.out.printf("Nama\t\t\t:%s \nUmur\t\t\t:%d \nTinggi badan\t\t:%.2f \nberat badan\t\t: %.2f \nAbsen\t\t\t:%d \nJumlah Sks\t\t:%d \nNIM\t\t\t:%s \nJenis Kelamin\t\t:%c \nStatus aktif\t\t:%b", nama,umur,tb,bb ,kelas,sks,nim,jk,aktif);
    }
}


public class Eval2 {
    public static void main(String[] args) {
//        Tugas 2
        String nama;
        nama = "Budi";
        nama = "Putri";
        
        byte umur;
        umur = 21;
        umur = 22;
        
        double tb;
        tb = 170.5;
        tb = 172.0;
        
        float bb;
        bb = 65.4f;
        bb = 60.2f;
                
        
        int kelas;
        kelas = 12;
        kelas = 13;
        
        short sks;
        sks = 144;
        sks = 140;
        
        String nim;
        nim = "D0223033";
        nim = "D0225015";
        
        char jk;
        jk = 'L';
        jk = 'P';
        
        boolean aktif;
        aktif = true;
        aktif = false;
        
System.out.print("Nama:");
        System.out.println(nama);
        System.out.print("Umur:");
        System.out.println(umur);
        System.out.print("Tinggi Badan:");
        System.out.println(tb);
        System.out.print("Berat Badan:");
        System.out.println(bb);
        System.out.print("Kelas:");
        System.out.println(kelas);
        System.out.print("Sks:");
        System.out.println(sks);
        System.out.print("NIM:");
        System.out.println(nim);
        System.out.print("Jenis Kelamin:");
        System.out.println(jk);
        System.out.println(aktif);
        
    }
}


import java.util.Scanner;

public class Eval3 {
    public static void main(String[] args) {
//        Tugas 3
   Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan Nama:") ;
            String nama = sc.nextLine();
            System.out.print("Masukkan Umur:");
            int umur = sc.nextInt();
            System.out.print("NIM:") ;
            String nim = sc.next();
            System.out.print("Tinggi Badan:") ;
            double tb = sc.nextDouble();
            System.out.print("Berat Badan:") ;
            float bb = sc.nextFloat();
            System.out.print("Kelas:");
            char kelas = sc.next().charAt(0);
            
            System.out.println("Nama\t\t\t:"+nama);
            System.out.println("Umur\t\t\t:"+umur+" Tahun");
            System.out.println("NIM\t\t\t:"+nim);
            System.out.println("Tinggi Badan\t\t:"+tb+" Cm");
            System.out.println("Berat Badan\t\t:"+bb+"Kg");
            System.out.println("Kelas Informatika\t:"+kelas);
            
    }
}



package tugastambahan;

import java.util.Scanner;

public class TugasTambahan {

    public static void main(String[] args) {
//        Tugas tambahan
        Scanner sc = new Scanner (System.in);
        //constanta(final)
        System.out.print("Masukkan Nama\t\t:");
        final String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM\t\t:");
        final String nim = sc.nextLine();
        
        System.out.print("Masukkan Umur\t\t:");
        final int umur = sc.nextInt();
        
        System.out.print("Masukkan Berat Badan\t:");
        final double bb = sc.nextDouble();
        
        System.out.print("Masukkan Tinggi Badan \t:");
        final float tb = sc.nextFloat();
        
        System.out.println();
        
        System.out.println("HALO TEMAN-TEMAN \nPerkenalkan Nama Saya " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Umur:" + umur);
        System.out.println("Berat Badan:" + bb);
        System.out.println("Tinggi Badan:" + tb);
        }
}
