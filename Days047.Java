package days047;

import java.util.Scanner;

public class Days047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== BULAN TAHUN 2025 ==");
        System.out.println("1. Agustus");
        System.out.println("2. September");
        System.out.println("3. Oktober");
        System.out.println("4. November");
        System.out.print("Masukkan 1-4 untuk melihat hari sesuai tanggal: ");
        int pilihan = input.nextInt();
               System.out.print("Masukkan tanggal: ");
                int tanggal = input.nextInt();
        switch (pilihan){
            case 1:
         
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( tanggal +" adalah Hari Jumat");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 || tanggal == 31){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else{
                    System.out.println("Sampai Tanggal 31 Saja!!");
                }
            break;
            case 2:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Senin");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else{
                    System.out.println("Sampai Tanggal 30 Saja!!");
                }
                break;
                case 3:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Rabu");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 || tanggal == 31 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else{
                    System.out.println("Sampai Tanggal 31 Saja!!");
                }
                break;
                case 4:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Sabtu");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else{
                    System.out.println("Sampai Tanggal 30 Saja!!");
                }
                break;
                default:{
                    System.out.println("Anda mungkin salah memasukkan Angka");
                }
                break;
                    

        }
    }
    
}
package days047;

import java.util.Scanner;

public class Days047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== BULAN TAHUN 2025 ==");
        System.out.println("1. Agustus");
        System.out.println("2. September");
        System.out.println("3. Oktober");
        System.out.println("4. November");
        System.out.print("Masukkan 1-4 untuk melihat hari sesuai tanggal: ");
        int pilihan = input.nextInt();
               System.out.print("Masukkan tanggal: ");
                int tanggal = input.nextInt();
        switch (pilihan){
            case 1:
         
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( tanggal +" adalah Hari Jumat");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 || tanggal == 31){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else{
                    System.out.println("Sampai Tanggal 31 Saja!!");
                }
            break;
            case 2:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Senin");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else{
                    System.out.println("Sampai Tanggal 30 Saja!!");
                }
                break;
                case 3:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Rabu");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 || tanggal == 31 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Sabtu");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else{
                    System.out.println("Sampai Tanggal 31 Saja!!");
                }
                break;
                case 4:
                if(tanggal == 1 || tanggal == 8 || tanggal == 15 || tanggal == 22 || tanggal == 29){
                    System.out.println( "Tanggal "+tanggal +" adalah Hari Sabtu");
                }else if(tanggal == 2 || tanggal == 9 || tanggal == 16 || tanggal == 23 || tanggal == 30){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Minggu");
                }else if(tanggal == 3 || tanggal == 10 || tanggal == 17 || tanggal == 24 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Senin");
                }else if(tanggal == 4 || tanggal == 11 || tanggal == 18 || tanggal == 25 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Selasa");
                }else if(tanggal == 5 || tanggal == 12 || tanggal == 19 || tanggal == 26 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Rabu");
                }else if(tanggal == 6 || tanggal == 13 || tanggal == 20 || tanggal == 27 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Kamis");
                }else if(tanggal == 7 || tanggal == 8 || tanggal == 21 || tanggal == 28 ){
                    System.out.println("Tanggal "+tanggal+" adalah Hari Jumat");
                }else{
                    System.out.println("Sampai Tanggal 30 Saja!!");
                }
                break;
                default:{
                    System.out.println("Anda mungkin salah memasukkan Angka");
                }
                break;
                    

        }
    }
    
}
