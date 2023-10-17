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
    boolean acc = false;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    void next(){
        try {
            System.out.println("\n==============================");
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

    void msg(String message){
        System.out.println("Message: " + message);
    }

    void closeAPK(){
        msg("Menutup aplikasi");
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
                    break;

                case 2:
                    if(acc){
                        infoAkun();
                    } else{
                        msg("Anda belum memiliki rekening");
                    }
                    break;
                
                case 3:
                    if(acc){
                        lihatSaldo();
                    } else{
                        msg("Anda belum memiliki rekening");
                    }
                    break;
                    
                case 4:
                    if(acc){
                        tambahSaldo();
                    } else{
                        msg("Anda belum memiliki rekening");
                    }
                    break;
                    
                case 5:
                    if(acc){
                        tarikSaldo();
                    } else{
                        msg("Anda belum memiliki rekening");
                    }
                    break;
            
                case 0:
                    closeAPK();
                    break;

                default:
                    msg("Pilihan tidak ada");
                    break;
            }
        } catch (Exception e){
                msg("Pilihan tidak ada");
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

                noRek = "130806125170102";
                saldo = saldo + setAwal;
                acc = true;
                
                System.out.println("Rekening berhasil dibuat");

            } else {
                System.out.println("\n==============================\n");
                System.out.println("Setoran awal tidak mencukupi");
                System.out.println("Pembuatan rekening gagal");
                
                saldo = saldo + setAwal;
                acc = false;
            }
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }

    void tambahAkun(){
        try {
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

            System.out.println("\n==============================");
            System.out.print("\nTekan ENTER untuk menyimpan");
            String temp = input.readLine();

            setAwal();
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");        
        }
        
    }

    void infoAkun(){
        try {
            cls();
            
            System.out.println("==============================");
            System.out.println("INFO AKUN BANK-U ANDA");
            System.out.println("==============================\n");

            
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }
    
    void lihatSaldo(){
         try {
            cls();
            
            System.out.println("==============================");
            System.out.println("SALDO AKUN BANK-U ANDA");
            System.out.println("==============================\n");
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }
    
    void tambahSaldo(){
         try {
            cls();
            
            System.out.println("==============================");
            System.out.println("TAMBAH SALDO BANK-U");
            System.out.println("==============================\n");
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }

    void tarikSaldo(){
         try {
            cls();
            
            System.out.println("==============================");
            System.out.println("TARIK SALDO BANK-U");
            System.out.println("==============================\n");
            
        } catch (Exception e) {
            msg("Terjadi kesalahan");
        }
    }
}
