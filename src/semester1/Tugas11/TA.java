package semester1.Tugas11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TA {
    Scanner input = new Scanner(System.in);
    ArrayList<Mahasiswa> mhs = new ArrayList<>();

    public static void main(String[] args) {
        TA run = new TA();
        run.menu();
    }

    void menu() {
        do {
            System.out.println();
            System.out.println("Pilih menu : ");
            System.out.println("1. Input data mahasiswa");
            System.out.println("2. Sorting");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            int ch = input.nextInt();
            input.nextLine();

            switch (ch) {
                case 1:
                    inputMahasiswa(mhs);
                    break;

                case 2:
                    menu2();
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        } while (true);

    }

    void menu2() {
        boolean next = true;
        do {
            System.out.println();
            System.out.println("Sorting berdasarkan : ");
            System.out.println("1. Nama");
            System.out.println("2. NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            int ch = input.nextInt();
            input.nextLine();

            switch (ch) {
                case 1:
                    System.out.println();
                    traversal(mhs, "Original data");
                    Collections.sort(mhs, new MyObjectComparatorByNama());
                    traversal(mhs, "Ascending");
                    Collections.reverse(mhs);
                    traversal(mhs, "Descending");
                    break;

                case 2:
                    System.out.println();
                    traversal(mhs, "Original data");
                    Collections.sort(mhs, new MyObjectComparatorByNIM());
                    traversal(mhs, "Ascending");
                    Collections.reverse(mhs);
                    traversal(mhs, "Descending");

                    break;

                case 0:
                    next = false;
                    break;

                default:
                    break;
            }
        } while (next);

    }

    void inputMahasiswa(ArrayList<Mahasiswa> mhs) {
        System.out.println();
        System.out.println("Input data mahasiswa");
        System.out.print("Nama\t: ");
        String nama = input.nextLine();
        System.out.print("NIM\t: ");
        String NIM = input.nextLine();
        System.out.print("Program studi\t: ");
        String prog = input.nextLine();
        System.out.print("Alamat\t: ");
        String alamat = input.nextLine();

        mhs.add(new Mahasiswa(nama, NIM, prog, alamat));
    }

    void traversal(ArrayList<Mahasiswa> data, String jenis) {
        System.out.println("Data Mahasiswa sort " + jenis + " : ");
        for (int a = 0; a < data.size(); a++) {
            System.out.print(data.get(a) + " ");
            System.out.println();
        }
        System.out.println();
    }
}

class MyObjectComparatorByNama implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa obj1, Mahasiswa obj2) {
        return obj1.getNama().compareTo(obj2.getNama());
    }
}

class MyObjectComparatorByNIM implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa obj1, Mahasiswa obj2) {
        return obj1.getNIM().compareTo(obj2.getNIM());
    }
}

class Mahasiswa {
    private String nama;
    private String NIM;
    private String prog;
    private String alamat;

    Mahasiswa(String nama, String NIM, String prog, String alamat) {
        this.nama = nama;
        this.NIM = NIM;
        this.prog = prog;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getProg() {
        return prog;
    }

    public String getAlamat() {
        return alamat;
    }

    public String toString() {
        return nama + " " + NIM + " " + prog + " " + alamat;
    }

}
