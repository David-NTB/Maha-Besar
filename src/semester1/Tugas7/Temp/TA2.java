package semester1.Tugas7.Temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TA2 {
    public static void main(String[] args) throws IOException {
        TA2 apk = new TA2();
        apk.menu();

    }

    String nama, kode;
    int hJ, hB, stock ;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    void next() throws IOException {
        System.out.println("\n==============================\n");
            System.out.print("Tekan ENTER untuk lanjut");
            String temp = input.readLine();
            System.out.println(temp);
            menu();
    }

    void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            msg("Error cls()");
        }
    }

    void msg(String message) {
        System.out.println("Message: " + message);
    }

    void closeAPK() {
        msg("Menutup aplikasi");
        cls();
        System.exit(0);
    }

    public void menu() throws IOException {
        byte ch;

        try {
            cls();
            String temp = "";

            System.out.println("==============================");
            System.out.println("SELAMAT DATANG DI APLIKASI RITEL");
            System.out.println("==============================\n");
            System.out.println("1. Tambahkan data barang");
            System.out.println("2. Tampilkan data barang");
            System.out.println("3. Menambah stok barang");
            System.out.println("4. Menjual stok barang");
            System.out.println("0. Tutup aplikasi");
            System.out.println("\n==============================\n");

            System.out.print("Masukan pilihan(angka): ");
            temp = input.readLine();
            ch = Byte.parseByte(temp);

            switch (ch) {
                case 1:
                    tambahBrg();
                    next();
                    break;

                case 2:
                    infoBrg();
                    next();
                    break;

                case 3:
                    tambahStok();
                    next();
                    break;

                case 4:
                    jualStok();
                    next();
                    break;

                case 0:
                    break;

                default:
                    msg("Pilihan tidak ada");
                    break;
            }
        } catch (Exception e) {
            msg("Pilihan tidak ada");
        }

    }


    void tambahBrg() throws IOException {
        cls();

        System.out.println("==============================");
        System.out.println("MENU MENAMBAHKAN DATA BARANG");
        System.out.println("==============================\n");

        String temp;
        
        System.out.print("Kode\t\t: ");
        kode = input.readLine();
        System.out.print("Nama\t\t: ");
        nama = input.readLine();
        System.out.print("Harga beli\t: ");
        temp = input.readLine();
        hB = Integer.parseInt(temp);
        System.out.print("Harga jual\t: ");
        temp = input.readLine();
        hJ = Integer.parseInt(temp);

        System.out.println("\nBarang berhasil ditambahkan");
    }

    void infoBrg() {
        cls();

        System.out.println("==============================");
        System.out.println("MENAMPILKAN DATA BARANG");
        System.out.println("==============================\n");

        System.out.printf("Kode\t\t: %s\n", kode);
        System.out.printf("Nama\t\t: %s\n", nama);
        System.out.printf("Jumlah stok\t: %d\n", stock);
        System.out.printf("Harga beli\t: %d\n", hB);
        System.out.printf("Harga jual\t: %d\n", hJ);

        
    }

    void tambahStok() throws IOException {
        cls();

        System.out.println("==============================");
        System.out.println("MENU MENAMBAH STOK BARANG");
        System.out.println("==============================\n");

        String temp;

        System.out.printf("Stok awal\t : %d\n", stock);
        System.out.print("Tambahkan stok\t : ");
        temp = input.readLine();
        int newStk = Integer.parseInt(temp);

        stock = stock + newStk;
        int newBy = newStk * hB;

        System.out.printf("Biaya per barang : %d\n", hB);
        System.out.printf("Biaya total\t : %d\n", newBy);
        System.out.printf("Stock sekarang\t : %d\n", stock);
        
    }

    void jualStok() throws IOException {
        cls();

        System.out.println("==============================");
        System.out.println("MENU MENJUAL STOK BARANG");
        System.out.println("==============================\n");

        String temp;

        System.out.printf("Stok awal\t : %d\n", stock);
        System.out.print("Jual stok\t : ");
        temp = input.readLine();
        int newStk = Integer.parseInt(temp);

        stock = stock - newStk;
        if (stock < 0){
            System.out.println("\nJumlah stok tidak mencukupi");
            System.out.println("Transaksi dibatalkan");
            stock = stock + newStk;
            
        } else {
            int newBy = newStk * hJ;
            System.out.printf("Biaya per barang : %d\n", hJ);
            System.out.printf("Biaya total\t : %d\n", newBy);
            System.out.printf("Stock sekarang\t : %d\n", stock);
        }

            

       
    }
}
