package Tugas5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parkir {
    static int biaya = 0;
    static int jam = 0;
    static int menit = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String jamIn = "";
        String jamOut = "";
        String jenis;
        
        boolean next = false;
        System.out.println("\n==============================");
        System.out.println("CEK BIAYA PARKIR KENDARAAN");
        System.out.println("==============================\n");

        while (!next) {
            System.out.print("Jenis kendaraan (Motor/Mobil)\t: ");
            jenis = input.readLine();

            if (jenis.equalsIgnoreCase("Motor")) {
                biaya = 3000;
                next = true;
            } else if (jenis.equalsIgnoreCase("Mobil")) {
                biaya = 6000;
                next = true;
            } else {
                System.out.println("Pilih 'Motor' atau 'Mobil'");
            }
        }

        while(next){
            System.out.print("Masukkan jam Awal (hh.mm)\t: ");
            jamIn = input.readLine();
            System.out.print("Masukkan jam Akhir (hh.mm)\t: ");
            jamOut = input.readLine();

            if (!jamIn.matches("\\d{2}.\\d{2}") || !jamOut.matches("\\d{2}.\\d{2}")) {
                System.out.println("Format waktu tidak valid. Gunakan format hh.mm.");
                
            } else{
                next = false;
            }

        }

        jam = selisihJam(jamIn, jamOut);
        menit = selisihMenit(jamIn, jamOut);

        double total = biayaParkir(biaya, jam, menit);

        System.out.println("\n==============================\n");
        System.out.println("Nota parkir:");
        System.out.printf("Biaya kendaraan\t: %d\n", biaya);
        System.out.printf("Lama waktu\t: %d jam %d menit\n", jam, menit);
        System.out.printf("Biaya total\t: %.2f\n", total);
        System.out.println("\n==============================\n");
    }

    private static double biayaParkir(int biaya, int waktuJam, int waktuMenit) {
        double biayaTotal = biaya * waktuJam + (biaya * waktuMenit / 60);
        return biayaTotal;
    }

    private static int selisihJam(String jamIn, String jamOut) {
        int jamAwal = Integer.parseInt(jamIn.substring(0, 2));
        int jamAkhir = Integer.parseInt(jamOut.substring(0, 2));
        int selisih = jamAkhir - jamAwal;

        if (selisih < 0) {
            selisih = 24 - (-selisih);
        }

        return selisih;
    }

    private static int selisihMenit(String jamIn, String jamOut) {
        int menitAwal = Integer.parseInt(jamIn.substring(3, 5));
        int menitAkhir = Integer.parseInt(jamOut.substring(3, 5));
        int selisih = menitAkhir - menitAwal;

        if (selisih < 0) {
            selisih = 60 - (-selisih);
            jam -= 1;
        }

        return selisih;
    }
}
