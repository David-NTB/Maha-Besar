package semester1.Tugas7.Temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TA1 {
    public static void main(String[] args) {
        TA1 apk = new TA1();
        apk.menu();

    }

    String nama, noKK, noKTP, noTelp, noRek, noRekX;
    int saldo, pin, pinX, nomin;
    boolean acc = false;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    void next() {
        try {
            System.out.println("\n==============================\n");
            System.out.print("Tekan ENTER untuk lanjut");
            String temp = input.readLine();
            System.out.println(temp);
            menu();
        } catch (Exception e) {
            msg("Error next()");
        }
    }

    void cls(){
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

    public void menu() {
        byte ch;

        try {
            cls();
            String temp = "";

            System.out.println("==============================");
            System.out.println("SELAMAT DATANG DI APLIKASI BANK-U");
            System.out.println("==============================\n");
            System.out.println("1. Tambah rekening baru");
            System.out.println("2. Lihat informasi rekening");
            System.out.println("3. Lihat Saldo");
            System.out.println("4. Tambah saldo");
            System.out.println("5. Tarik Saldo");
            System.out.println("0. Tutup aplikasi");
            System.out.println("\n==============================\n");

            System.out.print("Masukan pilihan(angka): ");
            temp = input.readLine();
            ch = Byte.parseByte(temp);

            switch (ch) {
                case 1:
                    tambahAkun();
                    next();
                    break;

                case 2:
                    if (acc) {
                        infoAkun();
                    } else {
                        msg("Anda belum memiliki rekening");
                    }
                    next();
                    break;

                case 3:
                    if (acc) {
                        lihatSaldo();
                    } else {
                        msg("Anda belum memiliki rekening");
                    }
                    next();
                    break;

                case 4:
                    if (acc) {
                        tambahSaldo();
                    } else {
                        msg("Anda belum memiliki rekening");
                    }
                    next();
                    break;

                case 5:
                    if (acc) {
                        tarikSaldo();
                    } else {
                        msg("Anda belum memiliki rekening");
                    }
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

    void setAwal() {
        try {
            cls();
            String temp = "";

            System.out.println("==============================");
            System.out.println("MASUKKAN SETORAN AWAL(Rp 100000)");
            System.out.println("==============================\n");

            System.out.print("Masukkan setoran awal: ");
            temp = input.readLine();

            int setAwal = Integer.parseInt(temp);
            saldo = saldo + setAwal;

            if (saldo >= 100000) {
                System.out.print("Masukkan pin baru: ");
                temp = input.readLine();
                pin = Integer.parseInt(temp);

                noRek = "130806125170102";

                acc = true;

                System.out.println("\nRekening berhasil dibuat");

            } else {
                System.out.println("\nSetoran awal tidak mencukupi");
                System.out.println("Pembuatan rekening gagal");

                acc = false;
            }

        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }

    void tambahAkun() throws IOException {
        cls();

        System.out.println("==============================");
        System.out.println("PEMBUATAN REKENING BANK-U");
        System.out.println("==============================\n");

        System.out.print("Nama Lengkap\t: ");
        nama = input.readLine();
        System.out.print("No. KTP\t\t: ");
        noKTP = input.readLine();
        System.out.print("No. KK\t\t: ");
        noKK = input.readLine();
        System.out.print("No. Telepon\t: ");
        noTelp = input.readLine();

        System.out.println("\n==============================\n");
        System.out.print("Tekan ENTER untuk menyimpan");
        String temp = input.readLine();
        System.out.println(temp);

        setAwal();

    }

    void infoAkun() {
        cls();

        System.out.println("==============================");
        System.out.println("INFO AKUN BANK-U ANDA");
        System.out.println("==============================\n");

        System.out.printf("Nomor Rekening\t: %s\n", noRek);
        System.out.printf("Pin\t\t: %d\n", pin);

    }

    void lihatSaldo() {
        cls();

        System.out.println("==============================");
        System.out.println("SALDO AKUN BANK-U ANDA");
        System.out.println("==============================\n");

        System.out.printf("Nomor rekening\t: %s\n", noRek);
        System.out.printf("Saldo anda\t: %d\n", saldo);

    }

    void tambahSaldo() {
        try {
            cls();

            System.out.println("==============================");
            System.out.println("TAMBAH SALDO BANK-U");
            System.out.println("==============================\n");

            String temp = "";
            System.out.print("Masukkan nomor rekening\t: ");
            noRekX = input.readLine();
            System.out.print("Masukkan nominal\t: ");
            temp = input.readLine();
            nomin = Integer.parseInt(temp);
            System.out.print("Masukkan pin anda\t: ");
            temp = input.readLine();
            pinX = Integer.parseInt(temp);

            if ((noRekX.equals(noRek)) && (pinX == pin)) {
                saldo = saldo + nomin;

                if (saldo < 1000000) {
                    System.out.println("\nTransaksi berhasil");
                    System.out.println("Anda mendapat bonus 1 bolpoin cantik");
                } else if (saldo < 10000000) {
                    System.out.println("\nTransaksi berhasil");
                    System.out.println("Anda mendapat bonus voucher belanja Rp 50000");
                } else {
                    System.out.println("\nTransaksi berhasil");
                    int a = saldo / 10000000;
                    System.out.println("Anda mendapat bonus voucher belanja Rp " + a * 50000);
                }
            } else {
                System.out.println("\nNo rekening atau pin salah");
            }

        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }

    void tarikSaldo() {
        try {
            cls();

            System.out.println("==============================");
            System.out.println("TARIK SALDO BANK-U");
            System.out.println("==============================\n");

            String temp = "";
            System.out.print("Masukkan nomor rekening\t: ");
            noRekX = input.readLine();
            System.out.print("Masukkan nominal\t: ");
            temp = input.readLine();
            nomin = Integer.parseInt(temp);
            System.out.print("Masukkan pin anda\t: ");
            temp = input.readLine();
            pinX = Integer.parseInt(temp);

            if ((noRekX.equals(noRek)) && (pinX == pin)) {
                saldo = saldo - nomin;

                if (saldo < 100000) {
                    saldo = saldo + nomin;
                    System.out.println("\nTransaksi gagal");
                    System.out.println("Saldo tidak boleh kurang dari saldo minimal");
                } else {
                    System.out.println("\nTransaksi berhasil");
                }

            } else {
                System.out.println("\nNo rekening atau pin salah");
            }

        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }
}
