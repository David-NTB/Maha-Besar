package semester1.Tugas7;

import java.util.Scanner;

public class TA1 {

    static int limit;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = "";

        //menggunakan do while
        do{
        System.out.println("=====DERET PRIMA=====");
        System.out.print("Masukkan limit : ");
        limit = input.nextInt();
        input.nextLine();

        showPrima();
        System.out.print("\n\nLanjut?(y/n) : ");
        next = input.nextLine();

        } while (next.equals("y"));

        System.out.println("===Program Selesai===");
    }

    static void showPrima(){
        System.out.print("Deret prima : ");
        boolean hasil;
        int cek = 2;
        //menggunakan while
        while(cek <= limit){
            hasil = cekBilanganPrima(cek);
            if (hasil) {
                System.out.print(cek + " ");
            }
            cek++;
        }
    }

    static boolean cekBilanganPrima(int limit) {
        int cekPrima = 0;

        //menggunakan for
        for(int counter = 2; counter <= limit; counter++) {
            if ((limit % counter) == 0) {
                cekPrima++;
            }
        }
        if (cekPrima > 1) {
            return false;
        } else {
            return true;
        }
    }
}

/*
 * Buatlah sebuah aplikasi, yang dapat digunakan untuk
 * 1. Menerima inputan bilangan bulat positif,
 * 2. Menentukan daftar bilangan prima yang terdapat antara 0 hingga inputan
 * bilangan
 * tersebut.
 * 
 * Contoh
 * a. Input : 10
 * Output : 2 3 5 7
 * b. Input : 20
 * Output : 2 3 5 7 11 13 17 19
 * c. Input : 60
 * Output : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 57 59
 */
