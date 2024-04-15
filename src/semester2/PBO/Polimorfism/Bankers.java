package semester2.PBO.Polimorfism;

import java.util.ArrayList;
import java.util.Scanner;

class Rekening {
    private String noRekening;
    private double saldo;
    private String namaPemilik;
    private String namaPerusahaan;
    private String noIdentitas;
    private String noIjin;

    public Rekening(String noRekening, double saldo, String namaPemilik, String noIdentitas) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.namaPemilik = namaPemilik;
        this.noIdentitas = noIdentitas;
    }

    public Rekening(String noRekening, double saldo, String namaPemilik, String namaPerusahaan, String noIdentitas,
            String noIjin) {
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.namaPemilik = namaPemilik;
        this.namaPerusahaan = namaPerusahaan;
        this.noIdentitas = noIdentitas;
        this.noIjin = noIjin;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public String getNoIjin() {
        return noIjin;
    }

    public void informasiRekening() {
        if (getNamaPerusahaan() == null) {
            System.out.println("Jenis rekening  : Perorangan");
            System.out.println("No Rekening     : " + getNoRekening());
            System.out.println("Saldo           : " + getSaldo());
            System.out.println("Nama Pemilik    : " + getNamaPemilik());
            System.out.println("No Identitas    : " + getNoIdentitas());
        } else {
            System.out.println("Jenis rekening  : Korporat");
            System.out.println("No Rekening     : " + getNoRekening());
            System.out.println("Saldo           : " + getSaldo());
            System.out.println("Nama Pemilik    : " + getNamaPemilik());
            System.out.println("Nama Perusahaan : " + getNamaPerusahaan());
            System.out.println("No Identitas    : " + getNoIdentitas());
            System.out.println("No Ijin Usaha   : " + getNoIjin());

        }

    }
}

class Bankers {
    ArrayList<Rekening> listRek = new ArrayList<>();
    Scanner inputUser = new Scanner(System.in);

    public void createRek(String noRekening, double saldo, String namaPemilik, String noIdentitas) {
        if (saldo >= 100000) {
            listRek.add(new Rekening(noRekening, saldo, namaPemilik, noIdentitas));
            System.out.println("Rekening BERHASIL dibuat");
            System.out.println();
            listRek.get(listRek.size() - 1).informasiRekening();
        } else {
            System.out.println("Jumlah setoran awal TIDAK mencukupi");
            System.out.println("Permbuatan rekening DIBATALKAN");
        }
        System.out.println();
    }

    public void createRek(String noRekening, double saldo, String namaPemilik, String namaPerusahaan,
            String noIdentitas, String niIjin) {
        if (saldo >= 500000) {
            listRek.add(new Rekening(noRekening, saldo, namaPemilik, namaPerusahaan, noIdentitas, niIjin));
            System.out.println("Rekening BERHASIL dibuat");
            System.out.println();
            listRek.get(listRek.size() - 1).informasiRekening();
        } else {
            System.out.println("Jumlah setoran awal TIDAK mencukupi");
            System.out.println("Permbuatan rekening DIBATALKAN");
        }
        System.out.println();
    }

    public void tambahSaldo(String noRekening, double saldo) {
        for (Rekening rekening : listRek) {
            if (rekening.getNoRekening().equals(noRekening)) {
                rekening.setSaldo(rekening.getSaldo() + saldo);
                System.out.println("Saldo \"" + noRekening + "\" BERHASIL ditambahkan");
                System.out.println();
                rekening.informasiRekening();
                break;
            } else if (rekening == listRek.get(listRek.size() - 1)) {
                System.out.println("Rekening \"" + noRekening + "\" TIDAK ditemukan");
            }
        }
        System.out.println();
    }

    public void tarikSaldo(String noRekening, double saldo) {
        for (Rekening rekening : listRek) {
            if (rekening.getNoRekening().equals(noRekening)) {
                if ((rekening.getSaldo() - saldo) >= 0) {
                    rekening.setSaldo(rekening.getSaldo() - saldo);
                    System.out.println("Saldo \"" + noRekening + "\" BERHASIL ditarik");
                    System.out.println();
                    rekening.informasiRekening();
                    break;
                } else {
                    System.out.println("Jumlah saldo TIDAK mencukupi");
                    System.out.println("Penarikan saldo DIBATALKAN");
                    break;
                }
            } else if (rekening == listRek.get(listRek.size() - 1)) {
                System.out.println("Rekening \"" + noRekening + "\" TIDAK ditemukan");
            }
        }
        System.out.println();
    }

    public void infoAllRekening() {
        System.out.println("==================================================");
        System.out.println("              INPO ALL REKENING");
        System.out.println("==================================================");
        for (Rekening rekening : listRek) {
            rekening.informasiRekening();
            System.out.println();
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Bankers bk = new Bankers();

        // MEMBUAT REKENING
        System.out.println("==================================================");
        System.out.println("                MEMBUAT REKENING");
        System.out.println("==================================================");
        bk.createRek("REK001", 100000, "Paijo", "I01");
        bk.createRek("REK002", 500000, "Tukiyem", "Per02", "I02", "Ijin02");
        bk.createRek("REK003", 90000, "Juminem", "I01"); // setor awal kureng
        bk.createRek("REK004", 400000, "Sarmono", "Per02", "I02", "Ijin02"); // setor awal kureng

        // MENAMBAH SALDO
        System.out.println("==================================================");
        System.out.println("               MENAMBAH SALDO");
        System.out.println("==================================================");
        bk.tambahSaldo("REK001", 100000);
        bk.tambahSaldo("REK002", 100000);
        bk.tambahSaldo("REK003", 100000); // not found

        // MENARIK SALDO
        System.out.println("==================================================");
        System.out.println("               MENARIK SALDO");
        System.out.println("==================================================");
        bk.tarikSaldo("REK001", 50000);
        bk.tarikSaldo("REK002", 50000);
        bk.tarikSaldo("REK001", 500000); // saldo tidak cukup
        bk.tarikSaldo("REK003", 50000); // not found

        // INP ALL REKENING
        bk.infoAllRekening();

    }
}