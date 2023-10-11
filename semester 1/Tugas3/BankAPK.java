package Tugas3;

import java.util.Scanner;

public class BankAPK {
    public static void main(String[] args) {
        BankU cek = new BankU();
        cek.Menu();
    }
    
}

class BankU{
    String nama, noKTP, noKK, noTelp;
    int pin, saldo;
    byte ch;
    

    byte Next(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan atau (0), enter: ");
            this.ch = input.nextByte();
            System.out.println("\n");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
        
        return this.ch;
    }

    void Menu(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("==============================");
            System.out.println("SELAMAT DATANG DI APLIKASI BANK-U");
            System.out.println("==============================");
            System.out.println("Masukkan pilihan(angka): ");
            System.out.println("1. Tambah rekening baru");
            System.out.println("2. Lihat informasi rekening");
            System.out.println("3. Tambah saldo");
            System.out.println("4. Tarik Saldo");
            System.out.println("5. Lihat Saldo");
            System.out.println("==============================\n");
            this.ch = Next();

            switch (this.ch) {
                case 1:
                    TambahAkun();
                    break;

                case 2:
                    InfoAkun();
                    break;
                
                case 3:
                    TambahSaldo();
                    break;
                
                case 4:
                    TarikSaldo();
                    break;
                
                case 5:
                    LihatSaldo();
                    break;
            
                default:
                    System.out.println("Pilihan tidak ada");
                    System.out.println("Menutup Aplikasi");
                    break;
            }
        } catch (Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }      
    }

    void TambahAkun(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            Scanner input = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("Ini tambah akun");
            System.out.println("==============================\n");

            System.out.print("Nama Lengkap\t: ");
            nama = input.nextLine();
            System.out.print("No. KTP\t\t: ");
            noKTP = input.nextLine();
            System.out.print("No. KK\t\t: ");
            noKK = input.nextLine();
            System.out.print("No. Telepon\t: ");
            noTelp = input.nextLine();
            System.out.print("Pin Baru\t: ");
            pin = input.nextInt();

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally{
            Menu();
        }
        
    }

    void InfoAkun(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            System.out.println("==============================");
            System.out.println("Ini info akun");
            System.out.println("==============================\n");

            System.out.printf("Nama Lengkap\t: %s\n", nama);
            System.out.printf("No. KTP\t\t: %s\n", noKTP);
            System.out.printf("No. KK\t\t: %s\n", noKK);
            System.out.printf("No. Telepon\t: %s\n", noTelp);
            System.out.printf("Pin Baru\t: %d\n", pin);

            Next();

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }

    void TambahSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            System.out.println("==============================");
            System.out.println("Ini tambah saldo");
            System.out.println("==============================\n");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }

    void TarikSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            System.out.println("==============================");
            System.out.println("Ini tarik saldo");
            System.out.println("==============================\n");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }

    void LihatSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            System.out.println("==============================");
            System.out.println("Ini lihat saldo");
            System.out.println("==============================\n");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }
}


