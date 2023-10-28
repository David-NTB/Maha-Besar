package Tugas2;

import java.util.Scanner;

class Ritel3{
    public static void main(String[] args) {
        Ritel3 brg = new Ritel3();
        brg.inputData();
        brg.viewData();
    }  
    
    String kode;
    String nama;
    String produsen;
    int berat;
    double hargaBeli;
    double hargaJual;
    Scanner input = new Scanner(System.in);

    public void inputData() {
        
        try{
            System.out.println("Inputan Data Barang ");
            System.out.print("Kode : ");
            kode = input.nextLine();
            System.out.print("Nama : ");
            nama = input.nextLine();
            System.out.print("Produsen : ");
            produsen = input.nextLine();
            
            System.out.print("Berat Bersih : ");
            berat = input.nextInt();
            System.out.print("Harga Beli : ");
            hargaBeli = input.nextDouble();
            System.out.print("Harga Jual : ");
            hargaJual = input.nextDouble();

        } catch(Exception e){
            System.out.println(e);
        } 
        
    }

    public void viewData(){
        System.out.println("Menampilkan detil barang");
        System.out.println("Nama : "+nama);
        System.out.println("Kode : "+kode);
        System.out.println("Produsen : "+produsen);
        System.out.println("Berat Bersih : "+berat);
        System.out.println("Harga Beli : "+hargaBeli);
        System.out.println("Harga Jual : "+hargaJual);
    }
}
