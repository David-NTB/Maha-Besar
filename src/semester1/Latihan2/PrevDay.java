package semester1.Latihan2;

import java.util.Scanner;

public class PrevDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("The Prev (x) Days is What Day?");
        System.out.println("==============================\n");

        System.out.println("1. Minggu");
        System.out.println("2. Senin");
        System.out.println("3. Selasa");
        System.out.println("4. Rabu");
        System.out.println("5. Kamis");
        System.out.println("6. Jumat");
        System.out.println("7. Sabtu\n");

        System.out.println("==============================\n");

        System.out.print("Masukkan nama hari: ");
        int hari = input.nextInt();
        System.out.print("Masukkan tanggal: ");
        int tglAwal = input.nextInt();
        System.out.print("Masukkan bulan: ");
        int bln = input.nextInt();
        System.out.print("Masukkan tahun: ");
        int thn = input.nextInt();

        System.out.print("Anda ingin melihat hari ke berapa? ");
        int plus = input.nextInt();
        input.close();

        int x = plus;
        hari = (hari + plus + 1) % 7; // cek hari
        hari = 7 - hari;

        int tgl = tglAwal + (-plus);

        while ((-plus) < 0) {
            tgl += maxTgl(bln, thn); // cek tanggal
            bln--; // cek bulan

            if (bln < 0) {
                bln = 12;
                thn--; // cek tahun
            }

            plus -= maxTgl(bln, thn);
        }

        System.out.println("\n==============================\n");
        System.out.println(x + " hari sebelumnya adalah:");
        System.out.print("\nHari: ");
        printHari(hari);
        System.out.println("Tanggal: " + tgl);
        System.out.println("Bulan: " + bln);
        System.out.println("Tahun: " + thn);
        System.out.println("\n==============================\n");

    }

    private static int maxTgl(int bln, int thn) {
        int maxTgl = 0;

        switch (bln) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxTgl = 31;
                break;

            case 4, 6, 9, 11:
                maxTgl = 30;
                break;

            case 2:
                maxTgl = ((thn % 4 == 0) && (thn % 100 != 0) || (thn % 400 == 0)) ? 29 : 28;
                break;
        }

        return maxTgl;
    }

    public static void printHari(int namaHari) {

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
            default:
                System.err.println("Error");
                break;
        }
    }

}
