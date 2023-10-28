package Latihan2;

import java.util.Scanner;

public class TDAT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==============================");
        System.out.println("The Day After Tomorrow");
        System.out.println("==============================\n");

        System.out.print("Masukkan tanggal: ");
        int tgl = input.nextInt();
        System.out.print("Masukkan bulan: ");
        int bln = input.nextInt();
        System.out.print("Masukkan tahun: ");
        int thn = input.nextInt();

        tgl = tgl + 2;
        
        int maxTgl = maxTgl(bln, thn);

        if (tgl > maxTgl){
            tgl = tgl % maxTgl;
            bln = bln + 1;
        }
        if (bln > 12) {
            bln = bln % 12;
            thn = thn + 1;
        }

        System.out.println("\n==============================\n");
        
        System.out.println("Tanggal lusa: " + tgl);
        System.out.println("Bulan lusa: " + bln);
        System.out.println("Tahun lusa: " + thn);
        
        System.out.println("\n==============================\n");

        input.close();
    }

    private static int maxTgl(int bln, int thn){
        int maxTgl = 0;

        switch (bln){
            case 1, 3, 5, 7, 8, 10, 12:
            maxTgl = 31;
            break;
            
            case 4, 6, 9, 11:
            maxTgl = 30;
            break;
            
            case 2:
            if (thn %4 ==0){
                maxTgl = 29;
            } else {
                maxTgl = 28;
            }
            break;
        }

        return maxTgl;
    }
}
