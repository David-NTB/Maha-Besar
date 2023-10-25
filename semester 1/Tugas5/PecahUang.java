package Tugas5;

import java.util.Scanner;

public class PecahUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("CEK PECAHAN UANG");
        System.out.println("==============================\n");

        System.out.print("Masukkan uang\t: ");
        int uangIn = input.nextInt();
        input.close();

        cekPecahan(uangIn);

        System.out.println("\n==============================\n");
        
    }

    private static void cekPecahan(int uangIn){
        int lembar = 0;
        int[] pecah = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        boolean next = false;

        int i = 0;
        while(!next){
            if (uangIn >= pecah[i]) {
                lembar = uangIn/pecah[i];
                uangIn %= pecah[i];
                System.out.println("Pecahan " + String.valueOf(pecah[i]) + "\t: " + lembar);
                
            } else if(uangIn < 100){
                next = true;
            }
            i++;
        }
    }
}
