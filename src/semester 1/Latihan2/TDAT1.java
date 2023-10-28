package Latihan2;

import java.util.Scanner;

public class TDAT1 {
    public static void main(String[] args) {

        System.out.println("The Day After Tomorrow");
        System.out.println("==============================\n");
        System.out.println("1. Minggu");
        System.out.println("2. Senin");
        System.out.println("5. Selasa");
        System.out.println("4. Rabu");
        System.out.println("5. Kamis");
        System.out.println("6. Jumat");
        System.out.println("7. Sabtu\n");

        System.out.print("Masukkan nama hari: ");

        Scanner input = new Scanner(System.in);
        int hari = input.nextByte() + 2;

        if (hari > 7){
            hari = hari % 7;
        } else {
            
        }
        
        printHari(hari);
        
        input.close();
    }

    public static void printHari (int namaHari){
        System.out.print("Lusa adalah hari ");
        
        switch (namaHari) {
        case 1:
            System.out.println("Minggu");
            break;
            
            case 2:
            System.out.println("Senin");
            break;

            case 3:
            System.out.println("Selasa");
            break;

            case 4:
            System.out.println("Rabu");
            break;

            case 5:
            System.out.println("Kamis");
            break;

            case 6:
            System.out.println("Jumat");
            break;

            case 7:
            System.out.println("Sabtu");
            break;
        }
    }
}
