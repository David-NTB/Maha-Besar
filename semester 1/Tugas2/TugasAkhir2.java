package Tugas2;

import java.util.Scanner;

public class TugasAkhir2 {
    public static void main(String[] args){
        dataPelanggan inputPelanggan = new dataPelanggan();
        inputPelanggan.daftar();
        inputPelanggan.showProfil();

        transaksi laundry = new transaksi();
        laundry.catatTransaksi();
        laundry.printStruk();
    }
}

class dataPelanggan{
    String nama;
    String namaP;
    String noTelp;
    String alamat;
    String email;
    String jK;

    void daftar(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("MASUKKAN DATA TERLEBIH DAHULU");
        System.out.println("==============================");                

        try{
            System.out.print("Nama Lengkap\t: ");
            nama = input.nextLine();
            System.out.print("Nama Panggilan\t: ");
            namaP = input.nextLine();
            System.out.print("No. Telepon\t: ");
            noTelp = input.nextLine();
            System.out.print("Alamat\t\t: ");
            alamat = input.nextLine();
            System.out.print("Email\t\t: ");
            email = input.nextLine();
            System.out.print("Jenis Kelamin\t: ");
            jK = input.nextLine();
        }catch(Exception e){
            System.err.println("Terjadi Error\t: " + e);
        }finally{
            System.out.println("==============================\n");
        }
    }
    
    void showProfil(){
        System.out.println("\n==============================");
        System.out.println("PROFIL ANDA");
        System.out.println("==============================");

        System.out.printf("Nama Lengkap\t: %s\n",nama);
        System.out.printf("Nama Panggilan\t: %s\n",namaP);
        System.out.printf("No. Telepon\t: %s\n",noTelp);
        System.out.printf("Alamat\t\t: %s\n",alamat);
        System.out.printf("Email\t\t: %s\n",email);
        System.out.printf("Jenis Kelamin\t: %s\n",jK);
        System.out.println("==============================\n");
    }
}

class transaksi{
    String beratL;
    String hargaL;
    String tglDaftar;
    String jamDaftar;
    String tglAmbil;
    String jamAmbil;

    void catatTransaksi(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("PENCATATAN DATA TRANSAKSI");
        System.out.println("==============================");                

        try{
            System.out.print("Berat Laundry\t\t: ");
            beratL = input.nextLine();
            System.out.print("Harga Laundry\t\t: ");
            hargaL = input.nextLine();
            System.out.print("Tanggal Pendaftaran\t: ");
            tglDaftar = input.nextLine();
            System.out.print("Jam Pendaftaran\t\t: ");
            jamDaftar = input.nextLine();
            System.out.print("Tanggal Pengambilan\t: ");
            tglAmbil = input.nextLine();
            System.out.print("Jam Pengambilan\t\t: ");
            jamAmbil = input.nextLine();
        }catch(Exception e){
            System.err.println("Terjadi Error\t: " + e);
        }finally{
            System.out.println("==============================\n");
        }
    }

    void printStruk(){
        System.out.println("\n==============================");
        System.out.println("STRUK TRANSAKSI LAUNDRY");
        System.out.println("==============================");

        System.out.printf("Berat Laundry\t\t: %s\n",beratL);
        System.out.printf("Harga Laundry\t\t: %s\n",hargaL);
        System.out.printf("Tanggal Pendaftaran\t: %s\n",tglDaftar);
        System.out.printf("Jam Pendaftaran\t\t: %s\n",jamDaftar);
        System.out.printf("Tanggal Pengambilan\t: %s\n",tglAmbil);
        System.out.printf("Jam Pengambilan\t\t: %s\n",jamAmbil);  
        System.out.println("==============================\n");      
    }
}