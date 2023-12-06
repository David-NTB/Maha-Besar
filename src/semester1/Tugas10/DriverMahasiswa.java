package semester1.Tugas10;

import java.util.Scanner;
import java.util.ArrayList;

// Kelas Driver Untuk melakukan pengolahan data
public class DriverMahasiswa {
    Scanner in = new Scanner(System.in);
    ArrayList<Mahasiswa> arrMhs = new ArrayList<>();

    public static void main(String args[]) {
        DriverMahasiswa dm = new DriverMahasiswa();
        dm.runThis();
    }

    void runThis() {
        boolean next1 = true;
        boolean next2 = true;
        do {
            inputData();
            while (next2) {
                System.out.print("\nMelanjutkan?(y/n)");
                String ch = in.nextLine();

                if (ch.equals("y")) {
                    next1 = true;
                    next2 = false;
                } else if (ch.equals("n")) {
                    next1 = false;
                    next2 = false;
                } else {
                    System.out.println("Pilihan tidak ada");
                }
            }
            next2 = true;

        } while (next1);

        viewData();
    }

    void viewData() {
        System.out.println("\nData Mahasiswa");
        for (int a = 0; a < arrMhs.size(); a++) {
            String nama = arrMhs.get(a).getNama();
            int nim = arrMhs.get(a).getNim();
            String sekolah = arrMhs.get(a).getSekolah();
            String asal = arrMhs.get(a).getAsal();
            String alamat = arrMhs.get(a).getAlamat();

            System.out.println((a + 1) + ". Nim\t\t\t: " + nim);
            System.out.println("   Nama\t\t\t: " + nama);
            System.out.println("   Asal sekolah\t\t: " + sekolah);
            System.out.println("   Alamat asal\t\t: " + asal);
            System.out.println("   Alamat sekarang\t: " + alamat);
            System.out.println();
        }
    }

    void inputData() {
        System.out.println("\nMasukkan Data Mahasiswa");
        System.out.print("NIM\t\t: ");
        int nim = in.nextInt();
        System.out.print("Nama\t\t: ");
        String nama = in.next();
        System.out.print("Asal sekolah\t: ");
        String sekolah = in.next();
        System.out.print("Alamat asal\t: ");
        String asal = in.next();
        System.out.print("Alamat sekarang\t: ");
        String alamat = in.next();
        in.nextLine();

        arrMhs.add(new Mahasiswa(nim, nama, sekolah, asal, alamat));
    }
}

// Kelas Entitas Mahasiswa
class Mahasiswa {
    int nim;
    String nama;
    String sekolah;
    String asal;
    String alamat;

    public Mahasiswa(int nim, String nama, String sekolah, String asal, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.sekolah = sekolah;
        this.asal = asal;
        this.alamat = alamat;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getSekolah() {
        return sekolah;
    }

    public String getAsal() {
        return asal;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDataMhs() {
        return nim + "; " + nama;
    }
}