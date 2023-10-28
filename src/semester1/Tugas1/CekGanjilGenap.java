package semester1.Tugas1;

import java.util.Scanner;

class CekGanjilGenap{
    public static void main(String[] args){
        //buat Scanner
        Scanner input = new Scanner(System.in);
        int a;

        //Cek ganjil genap
        System.out.println("==============================");
        System.out.println("CEK GANJIL GENAP");
        System.out.println("==============================");

        //masukkan input
        System.out.print("Masukkan angka: ");
        a = input.nextInt();

        //pengecekan
        if(a%2 == 0){
            System.out.println(a + " adalah bilangan genap");
        }
        else{
            System.out.println(a + " adalah bilangan ganjil");
        }
        System.out.println("==============================");

        //tutup Scanner
        input.close();   
    }
}