package Tugas4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankAPK {
    public static void main(String[] args) {
        BankAPK apk = new BankAPK();
        apk.menu();
    }

    String nama, noKK, noKTP, noTelp, noRek;
    int saldo, pin;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    void next(){
        try {
            System.out.println("\n==============================");
            System.out.print("Tekan ENTER untuk lanjut");
            String temp = input.readLine();
            System.out.println(temp);
            menu();
        } catch (Exception e) {
            System.err.println("Error next");
        }
    }

    void cls(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error cls");
        }
    }

    void closeAPK(){
        System.out.println("Message: Menutup aplikasi");
        cls();
        System.exit(0);
    }

    void menu(){
        byte ch;

        try{
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
                    infoAkun();
                    next();
                    break;
                
                case 3:
                    lihatSaldo();
                    next();
                    break;
                    
                case 4:
                    tambahSaldo();
                    next();
                    break;
                    
                case 5:
                    tarikSaldo();
                    next();
                    break;
            
                case 0:
                    closeAPK();
                    break;

                default:
                    System.out.println("Message: Pilihan tidak ada");
                    next();
                    break;
            }
        } catch (Exception e){
                System.out.println("Message: Pilihan tidak ada");
        } finally{
            next();
        }
        
        
    }

    void setAwal(){
        try {
            cls();
            String temp = "";

            System.out.println("==============================");
            System.out.println("MASUKKAN SETORAN AWAL(Rp 100000)");
            System.out.println("==============================\n");

            System.out.print("Masukkan setoran awal: ");
            temp = input.readLine();
            
            int setAwal = Integer.parseInt(temp);
            
            if (setAwal >= 100000){
                System.out.print("Masukkan pin baru: ");
                temp = input.readLine();
                pin = Integer.parseInt(temp);
                System.out.println("\n==============================\n");

                System.out.println("Rekening berhasil dibuat");
                noRek = "130806125170102";
                saldo = saldo + setAwal;

            } else {
                System.out.println("\n==============================\n");
                System.out.println("Setoran awal tidak mencukupi");
                System.out.println("Pembuatan rekening gagal");
                nama = null;
            }

            next();
            
        } catch (Exception e) {
            System.out.println("Message: Terjadi kesalahan");
        }
    }

    void tambahAkun(){
        try {
            cls();
    
            System.out.println("==============================");
            System.out.println("PEMBUATAN REKENING BANK-U");
            System.out.println("==============================\n");
    
            System.out.print("Nama Lengkap: ");
            nama = input.readLine();
            System.out.print("No. KTP: ");
            noKTP = input.readLine();
            System.out.print("No. Kartu Keluarga: ");
            noKK = input.readLine();
            System.out.print("No. Telepon: ");
            noTelp = input.readLine();

            System.out.println("\n==============================");
            System.out.print("\nTekan ENTER untuk menyimpan");
            String temp = input.readLine();

            setAwal();
            
        } catch (Exception e) {
            System.out.println("Message: Terjadi kesalahan");
        }
        
    }

    void infoAkun(){
        cls();
        
        System.out.println("==============================");
        System.out.println("INFO AKUN BANK-U ANDA");
        System.out.println("==============================\n");
    }
    
    void lihatSaldo(){
        cls();
        
        System.out.println("==============================");
        System.out.println("SALDO AKUN BANK-U ANDA");
        System.out.println("==============================\n");
    }
    
    void tambahSaldo(){
        cls();
        
        System.out.println("==============================");
        System.out.println("TAMBAH SALDO BANK-U");
        System.out.println("==============================\n");
    }

    void tarikSaldo(){
        cls();
        
        System.out.println("==============================");
        System.out.println("TARIK SALDO BANK-U");
        System.out.println("==============================\n");
    }
}
