package semester1.Latihan3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biner biner = new Biner();
        Prima prima = new Prima();
        Faktorial faktorial = new Faktorial();
        Permutasi permutasi = new Permutasi();

        // menu
        cls();
        System.out.println("==============================");
        System.out.println("MEMILIH MENU");
        System.out.println("==============================");
        System.out.println("1. Biner");
        System.out.println("2. Prima");
        System.out.println("3. Faktorial");
        System.out.println("4. Permutasi");
        System.out.println("==============================");

        System.out.print("\nSilahkan pilih menu : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                cls();
                biner.operasi();
                break;

            case 2:
                cls();
                prima.operasi();
                break;

            case 3:
                cls();
                faktorial.operasi();
                break;

            case 4:
                cls();
                permutasi.operasi1();
                break;

            default:
                System.out.println("Pilihan tidak ada");
                break;
        }

    }

    public static void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
