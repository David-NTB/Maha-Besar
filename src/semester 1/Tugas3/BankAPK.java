package Tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankAPK {
    public static void main(String[] args) {
        BankU cek = new BankU();
        cek.Menu();
    }
    
}

class BankU{
    String nama, noKTP, noKK, noTelp, noRek;
    String noRekX = "130806125170102";
    int pinX, pin, saldo = 0, nomin;
    byte ch;
    
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    

    byte Next(){
        try{
            System.out.print("\nTekan ENTER untuk lanjut");
            String temp = "";
            temp = input.readLine();
            System.out.print(temp);
            Menu();

            System.out.println("\n");
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
        
        return this.ch;
    }

    void CloseAPK(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }
        
    }

    void Menu(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            String temp = "0";

            System.out.println("==============================");
            System.out.println("SELAMAT DATANG DI APLIKASI BANK-U");
            System.out.println("==============================\n");
            System.out.println("1. Tambah rekening baru");
            System.out.println("2. Lihat informasi rekening");
            System.out.println("3. Tambah saldo");
            System.out.println("4. Tarik Saldo");
            System.out.println("5. Lihat Saldo");
            System.out.println("0. Tutup aplikasi");
            System.out.println("\n==============================\n");
            
            System.out.print("Masukkan pilihan(angka): ");
            temp = input.readLine();
            if(temp.equals("")){
                System.out.println("Message: masukkan angka");
                Next();
            } else{
            this.ch = Byte.parseByte(temp);
            }
            
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
            
                case 0:
                    System.out.println("Message: Menutup aplikasi");
                    CloseAPK();
                    break;

                default:
                    System.out.println("Message: Pilihan tidak ada");
                    Next();
                    break;
            }
        } catch (Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        }      
    }

    void TambahAkun(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            String temp = "";

            System.out.println("==============================");
            System.out.println("Ini tambah akun");
            System.out.println("==============================\n");

            System.out.print("Nama Lengkap\t: ");
            nama = input.readLine();
            System.out.print("No. KTP\t\t: ");
            noKTP = input.readLine();
            System.out.print("No. KK\t\t: ");
            noKK = input.readLine();
            System.out.print("No. Telepon\t: ");
            noTelp = input.readLine();
            System.out.print("Pin Baru\t: ");
            temp = input.readLine();
            pinX = Integer.parseInt(temp);

            System.out.println("\n==============================");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally{
            Next();
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
            System.out.printf("No. Rekening\t: %s\n", noRekX);
            System.out.printf("Pin anda\t: %d\n", pinX);

            System.out.println("\n==============================");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally{
            Next();
        }
        
    }

    void TambahSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            String temp = "";

            System.out.println("==============================");
            System.out.println("Ini tambah saldo");
            System.out.println("==============================\n");

            System.out.print("Masukkan nomor rekening\t: ");
            noRek = input.readLine();
            System.out.print("Masukkan Nominal\t: ");
            temp = input.readLine();
            nomin = Integer.parseInt(temp);
            System.out.print("Masukkan pin anda\t: ");
            temp = input.readLine();
            pin = Integer.parseInt(temp);

            if(noRek.equals(noRekX) && pin==pinX){
                saldo = saldo + nomin;
                System.out.println("\nMessage: Saldo berhasil ditambahkan");
            } else{
                System.out.println("No. Rekeneing atau Pin yang anda masukkan salah");
            }

            System.out.println("\n==============================");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally{
            Next();
        }
        
    }

    void TarikSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            String temp = "";

            System.out.println("==============================");
            System.out.println("Ini tarik saldo");
            System.out.println("==============================\n");

            System.out.print("Masukkan nomor rekening\t: ");
            noRek = input.readLine();
            System.out.print("Masukkan Nominal\t: ");
            temp = input.readLine();
            nomin = Integer.parseInt(temp);
            System.out.print("Masukkan pin anda\t: ");
            temp = input.readLine();
            pin = Integer.parseInt(temp);

            if(noRek.equals(noRekX) && pin==pinX){
                saldo = saldo - nomin;
                System.out.println("\nMessage: Saldo berhasil ditarik");
            } else{
                System.out.println("No. Rekeneing atau Pin yang anda masukkan salah");
            }

            System.out.println("\n==============================");

        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally{
            Next();
        }
        
    }

    void LihatSaldo(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
            System.out.println("==============================");
            System.out.println("Ini lihat saldo");
            System.out.println("==============================\n");

            System.out.printf("No. Rekening\t: %s\n", noRekX);
            System.out.printf("Saldo anda\t: %d\n", saldo);

            System.out.println("\n==============================");
            
        } catch(Exception e){
            System.err.println("Terjadi kesalahan: " + e);
        } finally {
            Next();
        }
    }
}


