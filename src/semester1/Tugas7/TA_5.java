package semester1.Tugas7;

import java.util.Scanner;

public class TA_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = "y";

        do {
            System.out.println("==============================");
            System.out.println("MENGHITUNG FAKTORIAL");
            System.out.println("==============================");
            System.out.print("Masukkan angka : ");
            int angka = input.nextInt();
            input.nextLine();

            if (angka > 0) {
                int sum = 1;

                System.out.print(angka + "! = ");
                while(angka > 0){
                    sum *= angka;
                    System.out.print(angka);

                    if(angka != 1){
                        System.out.print(" x ");
                    }
                    angka--;
                }
                System.out.println(" = " + sum);

            } else {
                System.out.println("Input anda tidak valid");
            }

            System.out.println("\n==============================");
            System.out.print("\nLanjut?(y/n) : ");
            next = input.nextLine();
        } while (next.equals("y"));
    }
}

// int hasil = 1;
// for(int i = in; i > 0; i--) {
// hasil *= i;
// }
