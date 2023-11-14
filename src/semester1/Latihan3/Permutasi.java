package semester1.Latihan3;

import java.util.Scanner;

public class Permutasi{
    Faktorial faktorial = new Faktorial();

    public void operasi1() {
        //instansiasi Scanner
        Scanner input = new Scanner(System.in);

        //menu
        System.out.println("==============================");
        System.out.println("MENGHITUNG PERMUTASI");
        System.out.println("==============================");

        //user input
        System.out.print("Masukkan input : ");
        int in1 = input.nextInt();
        System.out.print("Permutasi dari : ");
        int in2 = input.nextInt();

        //menghitung permutasi
        int hasil = mutasi(in1, in2);;
        
        //menampilkan ke layar
        System.out.println("Hasil : " + hasil);

        System.out.println("==============================");
    }
    
    //menghitung rumus permutasi
    public int mutasi(int in1, int in2){
        int hasil;
        return hasil = (faktorial.faktor(in1)) / (faktorial.faktor((in1-in2)));
    }
}
