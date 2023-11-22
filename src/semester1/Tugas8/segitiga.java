package semester1.Tugas8;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran : ");
        int tinggi = input.nextInt();
        input.close();
        System.out.println();
        
        
        int ctr = 1;
        while(ctr <= tinggi){
            int angka = 1;
            while(angka <= ctr){
                System.out.print(" " + angka);
                angka++;
            }
            System.out.println();
            ctr++;
        }

        // for(int i = 1; i <= tinggi; i++){
        //     for(int j = 1; j <= i; j++) System.out.print(i);
        //     System.out.println();
        // }
    }
}
