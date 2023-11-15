package semester1.Tugas7;

import java.util.Scanner;
import semester1.Tugas4.NilaiMK2;

public class Menu {

    Scanner inp = new Scanner(System.in);
    NilaiMK2 mk = new NilaiMK2();
    
    public static void main(String[] args) {
        Menu mn = new Menu();
        mn.EksekusiMenu();
    }

    private void daftarMenu() {
        System.out.println("Aplikasi perhitungan nilai");
        System.out.println("Menu Utama");
        System.out.println("1. Hitung Nilai MK Teori");
        System.out.println("2. Hitung Nilai MK Teori & Praktikum");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan anda [1-3] : ");
    }

    public void EksekusiMenu() {
        int pilihan = 0;
        while (pilihan != 3) {
            cls();
            daftarMenu();
            pilihan = inp.nextInt();
            inp.nextLine();
            switch (pilihan) {
                case 1:
                    cls();
                    mk.MkTeori();
                    next();
                    break;
                case 2:
                    cls();
                    mk.MkTeoriPraktikum();
                    next();
                    break;
                case 3:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        }
    }

    private void next() {
        System.out.print("\n---Tekan ENTER untuk lanjut---");
        String next = " " + inp.nextLine();
    }

    // untuk clear layar
    private void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
