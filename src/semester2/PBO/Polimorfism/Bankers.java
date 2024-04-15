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

    // Overloading Constructor
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
        if (getNamaPerusahaan() == null) { // Menampilkan data sesuai jenis rekening
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

    // Overloading Method
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

    public Rekening getRekening(String noRekening) {
        for (Rekening rekening : listRek) {
            if (rekening.getNoRekening().equals(noRekening)) {
                return rekening;
            }
        }
        return null;
    }

    public void tambahSaldo(String noRekening, double saldo) {
        if (getRekening(noRekening) != null) {
            getRekening(noRekening).setSaldo(getRekening(noRekening).getSaldo() + saldo);
            System.out.println("Saldo \"" + noRekening + "\" BERHASIL ditambahkan");
            System.out.println();
            getRekening(noRekening).informasiRekening();
        } else {
            System.out.println("Rekening \"" + noRekening + "\" TIDAK ditemukan");
        }
        System.out.println();
    }

    public void tarikSaldo(String noRekening, double saldo) {
        if (getRekening(noRekening) != null) {
            if ((getRekening(noRekening).getSaldo() - saldo) >= 0) {
                getRekening(noRekening).setSaldo(getRekening(noRekening).getSaldo() - saldo);
                System.out.println("Saldo \"" + noRekening + "\" BERHASIL ditarik");
                System.out.println();
                getRekening(noRekening).informasiRekening();
            } else {
                System.out.println("Jumlah saldo TIDAK mencukupi");
                System.out.println("Penarikan saldo DIBATALKAN");
            }
        } else {
            System.out.println("Rekening \"" + noRekening + "\" TIDAK ditemukan");
        }
        System.out.println();
    }

    public void transferBank(String rekAwal, String rekTujuan1, double saldo) {
        if (getRekening(rekAwal) != null) {
            if (getRekening(rekTujuan1) != null) {
                if ((getRekening(rekAwal).getSaldo() - saldo) >= 0) {
                    getRekening(rekAwal).setSaldo(getRekening(rekAwal).getSaldo() - saldo);
                    getRekening(rekTujuan1).setSaldo(getRekening(rekTujuan1).getSaldo() + saldo);
                    System.out.println("Saldo " + saldo + " BERHASIL ditransfer");
                    System.out.println("Dari \"" + rekAwal + "\" ke \"" + rekTujuan1);
                } else {
                    System.out.println("Jumlah saldo TIDAK mencukupi");
                    System.out.println("Penarikan saldo DIBATALKAN");
                }
            } else {
                System.out.println("Rekening \"" + rekTujuan1 + "\" TIDAK ditemukan");
            }
        } else {
            System.out.println("Rekening \"" + rekAwal + "\" TIDAK ditemukan");
        }
        System.out.println();
    }

    public void transferBank(String rekAwal, String rekTujuan1, String rekTujuan2, double saldo) {
        if (getRekening(rekAwal) != null) {
            if (getRekening(rekTujuan1) != null) {
                if (getRekening(rekTujuan2) != null) {
                    if ((getRekening(rekAwal).getSaldo() - (saldo * 2)) >= 0) {
                        getRekening(rekAwal).setSaldo(getRekening(rekAwal).getSaldo() - saldo);
                        getRekening(rekTujuan1).setSaldo(getRekening(rekTujuan1).getSaldo() + saldo);
                        getRekening(rekTujuan2).setSaldo(getRekening(rekTujuan2).getSaldo() + saldo);
                        System.out.println("Saldo " + saldo + " BERHASIL ditransfer");
                        System.out.println("Dari \"" + rekAwal + "\" ke \"" + rekTujuan1 + ", " + rekTujuan2);
                    } else {
                        System.out.println("Jumlah saldo TIDAK mencukupi");
                        System.out.println("Penarikan saldo DIBATALKAN");
                    }
                } else {
                    System.out.println("Rekening \"" + rekTujuan2 + "\" TIDAK ditemukan");
                }
            } else {
                System.out.println("Rekening \"" + rekTujuan1 + "\" TIDAK ditemukan");
            }
        } else {
            System.out.println("Rekening \"" + rekAwal + "\" TIDAK ditemukan");
        }
        System.out.println();
    }

    public void transferBank(String rekAwal, String rekTujuan1, String rekTujuan2, String rekTujuan3, double saldo) {
        if (getRekening(rekAwal) != null) {
            if (getRekening(rekTujuan1) != null) {
                if (getRekening(rekTujuan2) != null) {
                    if (getRekening(rekTujuan3) != null) {
                        if ((getRekening(rekAwal).getSaldo() - (saldo * 3)) >= 0) {
                            getRekening(rekAwal).setSaldo(getRekening(rekAwal).getSaldo() - saldo);
                            getRekening(rekTujuan1).setSaldo(getRekening(rekTujuan1).getSaldo() + saldo);
                            getRekening(rekTujuan2).setSaldo(getRekening(rekTujuan2).getSaldo() + saldo);
                            getRekening(rekTujuan3).setSaldo(getRekening(rekTujuan3).getSaldo() + saldo);
                            System.out.println("Saldo " + saldo + " BERHASIL ditransfer");
                            System.out.println("Dari \"" + rekAwal + "\" ke \"" + rekTujuan1 + ", " + rekTujuan2 + ", "
                                    + rekTujuan3);
                        } else {
                            System.out.println("Jumlah saldo TIDAK mencukupi");
                            System.out.println("Penarikan saldo DIBATALKAN");
                        }
                    } else {
                        System.out.println("Rekening \"" + rekTujuan2 + "\" TIDAK ditemukan");
                    }
                } else {
                    System.out.println("Rekening \"" + rekTujuan2 + "\" TIDAK ditemukan");
                }
            } else {
                System.out.println("Rekening \"" + rekTujuan1 + "\" TIDAK ditemukan");
            }
        } else {
            System.out.println("Rekening \"" + rekAwal + "\" TIDAK ditemukan");
        }
        System.out.println();
    }

    public void infoAllRekening() {
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
        bk.createRek("REK003", 100000, "Juminem", "I03");
        bk.createRek("REK004", 500000, "Sarmono", "Per04", "I04", "Ijin04");
        bk.createRek("REK005", 10000, "Juminem", "I03");// setor awal kureng

        // MENAMBAH SALDO
        System.out.println("==================================================");
        System.out.println("               MENAMBAH SALDO");
        System.out.println("==================================================");
        bk.tambahSaldo("REK001", 100000);
        bk.tambahSaldo("REK002", 100000);
        bk.tambahSaldo("REK005", 100000); // not found

        // MENARIK SALDO
        System.out.println("==================================================");
        System.out.println("               MENARIK SALDO");
        System.out.println("==================================================");
        bk.tarikSaldo("REK001", 50000);
        bk.tarikSaldo("REK002", 50000);
        bk.tarikSaldo("REK001", 500000); // saldo kureng
        bk.tarikSaldo("REK005", 50000); // not found

        // TRANSFER BANK
        System.out.println("==================================================");
        System.out.println("               TRANSFER BANK");
        System.out.println("==================================================");
        bk.transferBank("REK002", "REK001", 50000);
        bk.transferBank("REK002", "REK001", "REK003", 50000);
        bk.transferBank("REK004", "REK001", "REK002", "REK003", 50000);
        bk.transferBank("REK003", "REK001", 500000); // saldo kureng
        bk.transferBank("REK005", "REK001", 500000); // not found

        // INP ALL REKENING
        System.out.println("==================================================");
        System.out.println("              INPO ALL REKENING");
        System.out.println("==================================================");
        bk.infoAllRekening();

    }
}

/* POLIMORFISME
 *  Overload Constructor : Rekening
 *  Overload Method : createRek, transferBank
 */