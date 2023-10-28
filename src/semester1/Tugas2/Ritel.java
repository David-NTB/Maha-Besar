package semester1.Tugas2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


class Ritel{
    public static void main(String[] args) {

        Barang brg = new Barang();
        brg.inputData();
        brg.viewData();

    }
}
    class Barang {
        String kode;
        String nama;
        String produsen;
        int berat;
        int hargaBeli;
        int hargaJual;

    public void inputData(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(isr);

        try{
            String temp = "";
                System.out.println("Inputan Data Barang ");
                System.out.print("Kode : ");
                kode = input.readLine();
                System.out.print("Nama : ");
                nama = input.readLine();
                System.out.print("Produsen : ");
                produsen = input.readLine();
                
                System.out.print("Berat Bersih : ");
                temp = input.readLine();
                berat = Integer.parseInt(temp);
                System.out.print("Harga Beli : ");
                temp= input.readLine();
                hargaBeli = Integer.parseInt(temp);
                System.out.print("Harga Jual : ");
                temp= input.readLine();
                hargaJual = Integer.parseInt(temp);
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