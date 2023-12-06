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
        inputData();
        viewData();
    }

    void viewData() {
        System.out.println("Data Mahasiswa");
        for (int a = 0; a < arrMhs.size(); a++) {
            String nama = arrMhs.get(a).getNama();
            int nim = arrMhs.get(a).getNim();
            System.out.println((a + 1) + ".\tNim : " + nim);
            System.out.println("\tNama : " + nama);
        }
    }
    
    void inputData() {
        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("NIM : ");
        int nim = in.nextInt();
        System.out.print("Nama : ");
        String nama = in.next();
        arrMhs.add(new Mahasiswa(nim, nama));
    }
}

//Kelas Entitas Mahasiswa
class Mahasiswa {
    int nim;
    String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getDataMhs() {
        return nim + "; " + nama;
    }
}