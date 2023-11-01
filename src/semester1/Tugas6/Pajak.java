package semester1.Tugas6;

import java.util.Scanner;

public class Pajak {
    static Scanner input = new Scanner(System.in);
    static String jenis;
    static int cc;
    static int tahun;
    static int tahunNow;
    static double pjPokok;
    static double pjTahun;
    static double pjTotal;


    public static void main(String[] args) {
        cls();

        System.out.println("==============================");
        System.out.println("Pajak Kendaraan Bermotor");
        System.out.println("==============================\n");

        System.out.println("Pilih jenis kendaraan");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");

        System.out.println("\n==============================\n");
        System.out.print("Masukkan pilihan: ");
        jenis = input.nextLine();
        
        System.out.print("Masukkan cc kendaraan anda: ");
        cc = input.nextInt();

        System.out.print("Masukkan tahun kendaraan anda: ");
        tahun = input.nextInt();
        
        System.out.print("Masukkan tahun sekarang: ");
        tahunNow = input.nextInt();

        cls();

        if (jenis.equals("Motor")){
            if (cc < 100){
                pjPokok = 200000;
                pjTahun = 1; 

            } else if (cc < 250){
                pjPokok = 1000000;
                pjTahun = 3; 
                
            } else if (cc<=250){
                pjPokok = 4000000;
                pjTahun = 5; 
                
            } else{
                System.out.println("Masukkan cc yang benar");
            }

        } else if (jenis.equals("Mobil")){
            if (cc < 1000){
                pjPokok = 2000000;
                pjTahun = 1; 
                
            }else if (cc < 1500){
                pjPokok = 3000000;
                pjTahun = 2; 
                
            } else if (cc < 2500){
                pjPokok = 6000000;
                pjTahun = 4; 
                
            } else if (cc<=2500){
                pjPokok = 12000000;
                pjTahun = 8; 
                
            } else{
                System.out.println("Masukkan cc yang benar");
            }

        } else {
            System.out.println("Error: Periksa huruf");
        }  
        
        display();
        
    }

    static double pajakTambah(){
        return (pjPokok * (((tahunNow-tahun)*pjTahun)/100)); 

    }
    
    static double pajakTotal(){
        return pjPokok + pajakTambah(); 

    }

    static void display(){
        cls();

        System.out.println("==============================");
        System.out.println("Pajak Kendaraan Bermotor Anda");
        System.out.println("==============================\n");

        System.out.println("Jenis kendaraan\t: " + jenis);
        System.out.println("Tahun\t\t: " + tahun);
        System.out.println("Besar cc\t: " + cc);
        System.out.println("Pajak pokok\t: " + pjPokok);
        System.out.println("Penambahan\t: " + pajakTambah());
        System.out.println("Total pajak\t: " + pajakTotal());

        System.out.println("\n==============================\n");

    }

    static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
