package semester1.Tugas7;

import java.util.Scanner;

public class TA_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = "y";

        do {
            System.out.println("==============================");
            System.out.println("MENGHITUNG DERET DIVERGEN");
            System.out.println("==============================");
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();
            input.nextLine();

            if (angka > 0) {
                int ganjil = 0;
                int genap = 0;
                int sum;
                int ctr = 1;

                while (ctr <= angka) {
                    if (ctr % 2 == 0) {
                        genap += ctr;
                    }
                    else if (ctr % 2 == 1) {
                        ganjil += ctr;
                    }
                    System.out.print(ctr);
                    if((ctr != angka) && (ctr % 2 == 0)){
                        System.out.print(" + ");
                    } else if((ctr != angka) && (ctr % 2 == 1)){
                        System.out.print(" - ");
                    }
                    ctr++;
                }
                sum = ganjil - genap;
                System.out.print(" = " + sum);

            } else {
                System.out.println("Input anda tidak valid");
            }

            System.out.println("\n==============================");
            System.out.print("\nLanjut?(y/n) : ");
            next = input.nextLine();
        } while (next.equals("y"));
    }
}
