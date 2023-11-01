package semester1.Tugas6;

import java.util.Scanner;

class Produk {
    static Scanner input = new Scanner(System.in);
    static char kode;
    static String nama;
    static double hargaSat;
    static double hargaTot;
    static double diskon;
    static double diskonTot;
    static double bayar;
    static int unit;

    public static void main(String[] args) {

        cls();

        System.out.println("==============================");
        System.out.println("Selamat Datang di PT. JAVA JAYA");
        System.out.println("==============================\n");

        System.out.println("Pilih barang untuk dibeli");
        System.out.println("1. Cupboard");
        System.out.println("2. Computer Desk");
        System.out.println("3. Study Desk");

        System.out.println("\n==============================\n");
        System.out.print("Masukkan pilihan: ");

        byte pilih = input.nextByte();

        cls();

        switch (pilih) {
            case 1:
                kode = 'A';
                nama = "Cupboard";
                hargaSat = 250000;
                diskon = 5;
                display();
                break;

            case 2:
                kode = 'B';
                nama = "Computer Desk";
                hargaSat = 200000;
                diskon = 3;
                display();
                break;

            case 3:
                kode = 'C';
                nama = "Study Desk";
                hargaSat = 150000;
                diskon = 2;
                display();
                break;

            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }

    public static void pembelian() {
        System.out.print("Masukkan jumlah yang ingi anda beli: ");
        unit = input.nextInt();

        System.out.println("\n==============================\n");
        displayBeli();

    }

    public static double totalHarga(int unit) {
        return hargaTot = unit * hargaSat;
    }

    public static double diskon(double diskon) {
        return diskonTot = (diskon / 100) * hargaTot;
    }

    public static double bayar() {
        return hargaTot - diskonTot;
    }

    public static void displayBeli() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Harga\t\t: " + hargaSat);
        System.out.println("Diskon\t\t: " + diskon);

        System.out.println("Jumlah unit\t: " + unit);
        System.out.println("Total harga\t: " + totalHarga(unit));
        System.out.println("Besar diskon\t: " + diskon);
        System.out.println("Total diskon\t: " + diskon(diskon));
        System.out.println("Total bayar\t: " + bayar());
        System.out.println("\n==============================\n");

        // Kode Produk : B
        // Nama Produk : Computer Desk
        // Harga tiap unit : 200000.0
        // Jumlah beli : 20
        // Total harga : 4000000.0
        // Besar Diskon : 3.0 persen
        // Total Diskon : 120000.0
        // Total Bayar : 3880000.0
    }

    public static void display() {
        System.out.println("==============================\n");

        System.out.println("Kode\t: " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Harga\t: " + hargaSat);
        System.out.println("Diskon\t: " + diskon);

        System.out.println("\n==============================\n");
        pembelian();
    }

    static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}