package semester1.Latihan3;

import java.util.Scanner;

public class Biner extends Main{

    public void operasi() {
        //instansiasi Scanner
        Scanner input = new Scanner(System.in);
        
        //menu
        System.out.println("==============================");
        System.out.println("KONVERSI BILANGAN KE BINER");
        System.out.println("==============================");

        //user input
        System.out.print("Masukkan input : ");
        int in = input.nextInt();

        //cek panjang biner
        int index = 0;
        int cekIn = in;
        while(cekIn > 1){
            cekIn /= 2;
            index++;
        }
        
        //mengkonversi ke biner
        int[] biner = new int[index + 1];
        for(int i = index; i >= 0; i--){
            biner[i] = in % 2;
            in /= 2;
        }

        //print ke layar
        System.out.print("Biner : ");
        for(int i = 0; i <= index; i++) System.out.print(biner[i]); 

        System.out.println("\n==============================");
    }

}
