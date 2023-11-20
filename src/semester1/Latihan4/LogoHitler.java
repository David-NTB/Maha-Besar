package semester1.Latihan4;

import java.util.Scanner;

public class LogoHitler {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("MEMBUAT POLA SWASTIKA");
        System.out.println("==============================\n");

        System.out.print("Masukkan ukuran : ");
        int input = userInput.nextInt();

        System.out.println("\n");

        // Bagian I
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input * 3; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Bagian II
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Bagian III
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input * 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Bagian IV
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Bagian V
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= input; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= input * 3; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
