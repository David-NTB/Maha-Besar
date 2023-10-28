package semester1.Tugas4;

import java.util.Scanner;

// break berfungsi untuk menghentikan switch
// jika break dihapus, switch akan menjalankan semua kode di dalamnya
// this. berfungsi untuk membedakan antara local variable dan instance variable

public class NilaiMK2 {
    private String nim;
    private int kehadiran;
    private double nilaiAkhir;
    private char indexAkhir;
    private int pilihan;
    Scanner inp = new Scanner(System.in);

    public static void main(String[] xyz) {
        NilaiMK2 nmk = new NilaiMK2();
        nmk.menu();
    }

    void menu() {
        System.out.println("Aplikasi perhitungan nilai");
        System.out.println("Menu Utama");
        System.out.println("1. Hitung Nilai MK Teori");
        System.out.println("2. Hitung Nilai MK Teori & Praktikum");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan anda [1-3] : ");
        pilihan = inp.nextInt();

        switch (pilihan) {
            case 1:
                MkTeori();
                break;

            case 2:
                MkTeoriPraktikum();
                break;

            case 3:
                System.out.println("Keluar dari aplikasi...");
                break;

            default:
                System.out.println("Inputan yang anda masukkan tidak valid");
                break;
        }
    }

    void MkTeori() {
        int a1;
        int a2;
        int a3;
        int tugas;
        System.out.println("Perhitungan nilai Mata Kuliah Teori");
        System.out.print("NIM : ");
        this.nim = inp.next();
        System.out.print("Assessment 1 : ");
        a1 = inp.nextInt();
        System.out.print("Assessment 2 : ");
        a2 = inp.nextInt();
        System.out.print("Assessment 3 : ");
        a3 = inp.nextInt();
        System.out.print("Tugas : ");
        tugas = inp.nextInt();
        System.out.print("Kehadiran : ");
        kehadiran = inp.nextInt();

        nilaiAkhir = hitungNilaiAkhirTeori(a1, a2, a3, tugas);
        indexAkhir = hitungIndexAkhir(nilaiAkhir, kehadiran);
        viewMkTeori(a1, a2, a3, tugas);
    }

    double hitungNilaiAkhirTeori(int a1, int a2, int a3, int t) {
        double nilaiAkhir = (0.3 * a1) + (0.3 * a2) + (0.3 * a3) + (0.1 * t);
        return nilaiAkhir;
    }

    void viewMkTeori(int a1, int a2, int a3, int t) {
        System.out.println("Nilai MK Teori");
        System.out.println("NIM : " + this.nim);
        System.out.println("Assessment 1 : " + a1);
        System.out.println("Assessment 2 : " + a2);
        System.out.println("Assessment 3 : " + a3);
        System.out.println("Tugas : " + t);

        if (this.kehadiran >= 80) {
            System.out.println("Jml Kehadiran : " + this.kehadiran + "%");
            System.out.println("Nilai Akhir : " + this.nilaiAkhir);
            System.out.println("Indeks Akhir : " + this.indexAkhir);

        } else {
            System.out.println("Jumlah kehadiran kurang dari 80");
            System.out.println("Indeks Akhir F, dan anda tidak lulus");
            System.out.println("Salah satu syarat lulus, kehadiran>=80");
        }

    }

    void MkTeoriPraktikum() {
        int a1;
        int a2;
        int a3;
        int tugas;
        double nilaiMingguan;
        int nilaiTA;
        double nilaiPraktikum;
        System.out.println("Perhitungan nilai Teori & Praktikum");
        System.out.print("NIM : ");
        this.nim = inp.next();
        System.out.print("Assessment 1 : ");
        a1 = inp.nextInt();
        System.out.print("Assessment 2 : ");
        a2 = inp.nextInt();
        System.out.print("Assessment 3 : ");
        a3 = inp.nextInt();
        System.out.print("Tugas : ");
        tugas = inp.nextInt();
        System.out.print("Nilai Mingguan Praktikum : ");
        nilaiMingguan = inp.nextInt();
        System.out.print("Nilai Tugas Akhir Praktikum : ");
        nilaiTA = inp.nextInt();
        System.out.print("Kehadiran : ");
        kehadiran = inp.nextInt();

        nilaiPraktikum = hitungNilaiPraktikum(nilaiMingguan, nilaiTA);
        nilaiAkhir = hitungNilaiAkhirTeoriPraktikum(a1, a2, a3, tugas, nilaiPraktikum);
        indexAkhir = hitungIndexAkhir(nilaiAkhir, kehadiran);

        viewMkTeoriPraktikum(a1, a2, a3, tugas, nilaiPraktikum);
    }

    double hitungNilaiPraktikum(double nm, int nta) {
        double nilaiPraktikum = (0.8 * nm) + (0.2 * nta);
        return nilaiPraktikum;
    }

    double hitungNilaiAkhirTeoriPraktikum(int a1, int a2, int a3, int t, double np) {
        double nilaiAkhir = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * t) + (0.4 * np);
        return nilaiAkhir;
    }

    void viewMkTeoriPraktikum(int a1, int a2, int a3, int t, double np) {
        System.out.println("Nilai MK Teori & Praktikum");
        System.out.println("NIM : " + this.nim);
        System.out.println("Assessment 1 : " + a1);
        System.out.println("Assessment 2 : " + a2);
        System.out.println("Assessment 3 : " + a3);
        System.out.println("Tugas : " + t);
        System.out.println("Nilai Praktikum : " + np);

        if (this.kehadiran >= 80) {
            System.out.println("Jumlah Kehadiran : " + this.kehadiran + "%");
            System.out.println("Nilai Akhir : " + this.nilaiAkhir);
            System.out.println("Indeks Akhir : " + this.indexAkhir);

        } else {
            System.out.println("Jumlah kehadiran kurang dari 80");
            System.out.println("Indeks Akhir F, dan anda tidak lulus");
            System.out.println("Salah satu syarat lulus, kehadiran>=80");
        }

    }

    char hitungIndexAkhir(double na, double h) {
        char indeks;
        if ((na >= 80) && (h >= 80))
            indeks = 'A';
        else if ((na >= 60) && (h >= 80))
            indeks = 'B';
        else if ((na >= 40) && (h >= 80))
            indeks = 'C';
        else if ((na >= 20) && (h >= 80))
            indeks = 'D';
        else if ((na >= 0) && (h >= 80))
            indeks = 'E';
        else
            indeks = 'F';

        return indeks;
    }
}
