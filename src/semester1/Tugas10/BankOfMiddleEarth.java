package semester1.Tugas10;

import java.util.ArrayList;

public class Rekening {
    private int no;
    private String nama;
    private double saldo;

    public Rekening(___________,___________,___________){ //No 1,2,3
    this.no=___________; //No 4
    this.nama=___________; //No 5
    this.saldo=___________; //No 6
    }

    public void setSaldo(double saldo) {
    ____________ = saldo //No 7
    }

    public ____________ getSaldo() { // No 8
        return saldo;
    }

    public ____________ getNo() { // No 9
        return no;
    }

    public ____________ getNama() { // No 10
        return nama;
    }
}


class BankOfMiddleEarth {
    ArrayList<____________> aRek = new ArrayList<>(); // No 11
    double saldoMinimal = 500000;

    public static void main(String[] abcd) {
        BankOfMiddleEarth b = new BankOfMiddleEarth();
        b.menu();
    }

    private void menu() {
        /*
         * pada bagian ini, diasumsikan adalah sebuah struktur menu,
         * .yang kemudian menjalankan proses pengolahan data
         * .(buatRekening, tabung, tarik dan transfer)
         * .untuk melengkapi, buatlah sebuah struktur menu dari program ini
         */
    }

    private void buatRekening() {
        /*
         * . Input data nama dan saldo
         */
        if (_________ < saldoMinimal) { // No 12
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
            aRek.add(________________); // No 13
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
            if (aRek.get(a).getNo() == ____________) { // No 14
                ketemu = a;
                break;
            }
        }
        return ketemu;
    }

    private void tabung() {
        /*
         * . Input data no rekening dan saldo tambahan
         */
        int pos = cekRekening(noRek);
        if (pos >= 0) {
            double saldoAkhir = aRek.get(pos).getSaldo() + jumlah;
            aRek.get(pos).setSaldo(____________); // No 15
            System.out.println("Saldo telah ditambahkan");
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void tarik() {
        /*
         * . Input no rekening dan saldo penarikan
         */
        int pos = cekRekening(noRek);
        if (pos >= 0) {
            // cek apakah saldo akhir masih cukup atau tidak
            double saldoAkhir = _______________ - jumlah;
            if (_____________ < saldoMinimal) { // No 16
                aRek.get(pos).setSaldo(____________); // No 17
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void transfer() {
            /*
            . Input no rekening asal, no rekening tujuan dan saldo penarikan
            */
            int posAsal = cekRekening(____________); //No 18
            int posTujuan = cekRekening(____________); //No 19
            if ((posAsal>=0) && (posTujuan>=0)){
            double saldoAkhirAsal = ____________ - _____________;
            if ((__________________) {
             aRek.get(posAsal).setSaldo (____________); //No 20
             doubleSaldoAkhirTujuan = _______________ +_____________ //No 21
             aRek.get(posTujuan).setSaldo(____________); //No 22
             System.out.println("Transfer telah dilaksanakan");
            }
            else {
            System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
            }
            else{
            System.out.println("No Rekening tidak ditemukan");
            }
            }

    private void infoRekening(int no) {
        int pos = cekRekening(no);
        if (pos >= 0) {
            System.out.println("Informasi Rekening");
            System.out.println("No Rek : " + ____________); // No 23
            System.out.println("Nama : " + ____________); // No 24
            System.out.println("Saldo : " + ____________); // No 25
        }
    }
} // end of class BankOfMiddleEarth