package semester1.Tugas10;

import java.util.ArrayList;
import java.util.Scanner;

class Rekening {
    private int no;
    private String nama;
    private double saldo;

    public Rekening(int no, String nama, double saldo) { // No 1,2,3
        this.no = no; // No 4
        this.nama = nama; // No 5
        this.saldo = saldo; // No 6
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo; // No 7
    }

    public double getSaldo() { // No 8
        return saldo;
    }

    public int getNo() { // No 9
        return no;
    }

    public String getNama() { // No 10
        return nama;
    }
}

public class BankOfMiddleEarthCC {
    Scanner input = new Scanner(System.in);
    ArrayList<Rekening> aRek = new ArrayList<>(); // No 11
    double saldoMinimal = 500000;

    public static void main(String[] abcd) {
        BankOfMiddleEarthCC b = new BankOfMiddleEarthCC();
        b.menu();
    }

    private void menu() {
        int pilihan;
        do {
            System.out.println("1. Buat Rekening");
            System.out.println("2. Tabung");
            System.out.println("3. Tarik");
            System.out.println("4. Transfer");
            System.out.println("5. Info Rekening");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    buatRekening();
                    break;
                case 2:
                    tabung();
                    break;
                case 3:
                    tarik();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.print("Masukkan No Rekening: ");
                    int noRek = input.nextInt();
                    infoRekening(noRek);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private void buatRekening() {
        System.out.print("Nama\t: ");
        String nama = input.nextLine();
        System.out.print("Saldo\t: ");
        double saldo = input.nextDouble();

        if (saldo < saldoMinimal) { // No 12
            System.out.println("Saldo awal tidak mencukupi");
        } else {
            int no;
            if (!aRek.isEmpty()) {
                no = aRek.get(aRek.size() - 1).getNo() + 1;
                // jika array sudah terisi, maka no rekening diambilkan dari
                // rekening terakhir yang ditambahkan, kemudian ditambahkan 1
            } else {
                no = 1;
                // jika array masih kosong, maka no rekening adalah 1
            }
            Rekening rek = new Rekening(no, nama, saldo);
            aRek.add(rek); // No 13
            System.out.println("Rekening telah ditambahkan");
        }
    }

    /*
     * . Method cekRekening merupakan sebuah method yang digunakan
     * . untuk mencari indeks dalam arrayList dari no rekening yang dicari.
     * . Jika ditemukan, maka akan mengembalikan indeks dari rekening
     * tersebut.
     * . Jika tidak ditemukan, maka akan mengembalikan nilai -1
     */
    private int cekRekening(int no) {
        int ketemu = -1;
        for (int a = 0; a < aRek.size(); a++) {
            if (aRek.get(a).getNo() == no) { // No 14
                ketemu = a;
                break;
            }
        }
        return ketemu;
    }

    private void tabung() {
        System.out.print("Masukkan No Rekening: ");
        int noRek = input.nextInt();
        System.out.print("Jumlah Tabungan: ");
        double jumlah = input.nextDouble();

        int pos = cekRekening(noRek);
        if (pos >= 0) {
            double saldoAkhir = aRek.get(pos).getSaldo() + jumlah;
            aRek.get(pos).setSaldo(saldoAkhir); // No 15
            System.out.println("Saldo telah ditambahkan");
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void tarik() {
        System.out.print("Masukkan No Rekening: ");
        int noRek = input.nextInt();
        System.out.print("Jumlah Penarikan: ");
        double jumlah = input.nextDouble();

        int pos = cekRekening(noRek);
        if (pos >= 0) {
            // cek apakah saldo akhir masih cukup atau tidak
            double saldoAkhir = aRek.get(pos).getSaldo() - jumlah;
            if (saldoAkhir < saldoMinimal) { // No 16
                aRek.get(pos).setSaldo(saldoAkhir); // No 17
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void transfer() {
        System.out.print("Masukkan No Rekening Asal: ");
        int noRekAsal = input.nextInt();
        System.out.print("Masukkan No Rekening Tujuan: ");
        int noRekTujuan = input.nextInt();
        System.out.print("Jumlah Transfer: ");
        double jumlah = input.nextDouble();

        int posAsal = cekRekening(noRekAsal); // No 18
        int posTujuan = cekRekening(noRekTujuan); // No 19
        if ((posAsal >= 0) && (posTujuan >= 0)) {
            double saldoAkhirAsal = aRek.get(posAsal).getSaldo() - jumlah;
            if (saldoAkhirAsal >= saldoMinimal) {
                aRek.get(posAsal).setSaldo(saldoAkhirAsal); // No 20
                double SaldoAkhirTujuan = aRek.get(posTujuan).getSaldo() + jumlah; // No 21
                aRek.get(posTujuan).setSaldo(saldoAkhirAsal); // No 22
                System.out.println("Transfer telah dilaksanakan");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan");
        }
    }

    private void infoRekening(int no) {
        int pos = cekRekening(no);
        if (pos >= 0) {
            System.out.println("Informasi Rekening");
            System.out.println("No Rek : " + aRek.get(pos).getNo()); // No 23
            System.out.println("Nama : " + aRek.get(pos).getNama()); // No 24
            System.out.println("Saldo : " + aRek.get(pos).getSaldo()); // No 25
        }
    }
} // end of class BankOfMiddleEarthCC