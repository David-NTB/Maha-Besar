package semester1.Tugas9;

import java.util.ArrayList;
import java.util.Scanner;

public class TA2 {
    Scanner input = new Scanner(System.in);

    private double ass1;
    private double ass2;
    private double ass3;
    private double tugas;
    private double praktikum;
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> NIM = new ArrayList<String>();
    private ArrayList<Double> grade = new ArrayList<Double>();

    public static void main(String[] args) {
        TA2 mk = new TA2();
        mk.menu();
    }

    private void menu() {
        boolean next = true;
        do {
            cls();

            System.out.println("==============================");
            System.out.println("DATA NILAI MAHASISWA");
            System.out.println("==============================");
            System.out.println("\n1. Input data nilai");
            System.out.println("2. Tampilkan semua data");
            System.out.println("3. Keluar\n");
            System.out.println("==============================");

            System.out.print("Pilihan : ");
            int ch = input.nextInt();

            next();
            cls();

            switch (ch) {
                case 1:
                    inputData();
                    next();
                    break;

                case 2:
                    showData();
                    next();
                    break;

                case 3:
                    next = false;
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (next);
    }

    private void inputData() {
        System.out.println("==============================");
        System.out.println("INPUT DATA NILAI");
        System.out.println("==============================");

        System.out.print("Nama Lengkap \t: ");
        name.add(input.nextLine());
        System.out.print("NIM \t\t: ");
        NIM.add(input.nextLine());

        boolean next = true;
        do {
            System.out.print("\nNilai Assessment 1 : ");
            this.ass1 = input.nextInt();
            System.out.print("Nilai Assessment 2 : ");
            this.ass2 = input.nextInt();
            System.out.print("Nilai Assessment 3 : ");
            this.ass3 = input.nextInt();
            System.out.print("Nilai Tugas\t   : ");
            this.tugas = input.nextInt();
            System.out.print("Nilai Praktikum\t   : ");
            this.praktikum = input.nextInt();

            if (cek(this.ass1) && cek(this.ass2) && cek(this.ass3) && cek(this.tugas) && cek(this.praktikum))
                next = false;
            else
                System.err.println("\nError..!! Rentang nilai harus 0-100");;

        } while (next);

        processData();
        System.out.println("\nNilai sudah diproses . . .");
    }

    private boolean cek(double input) {
        if ((input >= 0) && (input <= 100))
            return true;
        else
            return false;
    }

    private void processData() {
        this.ass1 *= 15;
        this.ass2 *= 15;
        this.ass3 *= 10;
        this.tugas *= 20;
        this.praktikum *= 40;
        double total = (this.ass1 + this.ass2 + this.ass3 + this.tugas + this.praktikum) / 100;
        grade.add(total);
    }

    private void showData() {
        System.out.println("==============================");
        System.out.println("MENAMPILKAN SEMUA DATA");
        System.out.println("==============================");

        for (int i = 0; i < name.size(); i++) {
            System.out.println("\nNama Lengkap\t: " + name.get(i));
            System.out.println("NIM\t\t: " + NIM.get(i));
            System.out.println("Nilai Akhir\t: " + grade.get(i));
        }
    }

    private void next() {
        System.out.println("==============================");
        System.out.println("Tekan ENTER untuk lanjut . . .");
        input.nextLine();
        input.nextLine();
    }

    private void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        } catch (Exception e) {
            System.err.println("Error : " + e);
        }
    }
}
