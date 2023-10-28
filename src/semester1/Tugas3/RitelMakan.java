package semester1.Tugas3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Barang{
    String kode;
    String nama;
    int stock;
    int hargaJual;

    BufferedReader input = new BufferedReader(new
    InputStreamReader(System.in));

    public void inputData(){
        try{
            String temp="";

            System.out.println("==============================");
            System.out.println("MENU INPUT DATA BARANG");
            System.out.println("==============================");

            System.out.print("Kode \t\t: ");
            kode = input.readLine();
            System.out.print("Nama \t\t: ");
            nama = input.readLine();
            System.out.print("Stock Awal \t: ");
            temp= input.readLine();
            stock= Integer.parseInt(temp);
            System.out.print("Harga Jual \t: ");
            temp= input.readLine();
            hargaJual = Integer.parseInt(temp);
            pressEnter();

        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void viewData(){
        System.out.println("==============================");
        System.out.println("MENAMPILKAN DETAIL BARANG");
        System.out.println("==============================");

        System.out.println("Nama \t\t: "+nama);
        System.out.println("Kode \t\t: "+kode);
        System.out.println("Jumlah Stok \t: "+stock);
        System.out.println("Harga Jual \t: "+hargaJual);
        pressEnter();
    }

    public void jualStock(int ubah){
        System.out.println("==============================");
        System.out.println("MENU PENJUALAN BARANG");
        System.out.println("==============================");

        System.out.println("Stok awal \t: "+ stock);
        this.stock = this.stock - ubah;
        System.out.println("Pengurangan \t: "+ ubah);
        int HJ = hargaJual*ubah;
        System.out.println("Harga Jual \t: "+HJ);
        System.out.println("Stok akhir \t: "+ stock);
        System.out.println("Data telah diubah");
        pressEnter();
    }

    public void tambahStock(int ubah){
        System.out.println("==============================");
        System.out.println("MENU PEMBELIAN BARANG");
        System.out.println("==============================");

        System.out.println("Stok awal \t: "+ stock);
        this.stock = this.stock + ubah;
        System.out.println("Penambahan \t: "+ ubah);
        int HJ = hargaJual*ubah;
        System.out.println("Harga Beli \t: "+HJ);
        System.out.println("Stok akhir \t: "+ stock);
        System.out.println("Data telah diubah");
        pressEnter();
    }

    void pressEnter(){
        try{
            System.out.println("==============================\n");
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}

class RitelMakan{
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        Barang brg2 = new Barang();
        
        brg1.inputData();
        brg2.inputData();

        brg1.jualStock(33);
        brg2.jualStock(45);

        brg1.tambahStock(33);
        brg2.tambahStock(45);

        brg1.viewData();
        brg2.viewData();
    }
}

