package semester1.Tugas7;

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
    
        int nilai = random.nextInt(100);
        int tebak;
        int max = 100;
        int min = 0;
        int ctr = 0;
        do {
            System.out.print("Tebak angka antara " + min + " - " + max + " : ");
            tebak = input.nextInt();
    
            if ((tebak >= min) && (tebak <= max)) {
                if (tebak == nilai)
                    System.out.println("tebakan anda benar\n");
                else if (tebak > nilai) {
                    System.out.println("tebakan anda lebih besar\n");
                    max = tebak;
                } else {
                    System.out.println("tebakan anda lebih kecil\n");
                    min = tebak;
                }
            } else {
                System.out.println("Tebakan diluar rentang");
                System.out.println("Tebak antara " + min + " dan " + max);
            }
            ctr++;
    
        } while (tebak != nilai);
    
        System.out.println("Nilai yang dicari adalah : " + nilai);
        System.out.println("Berhasil menebak dalam " + ctr + " kali");
    }
}
