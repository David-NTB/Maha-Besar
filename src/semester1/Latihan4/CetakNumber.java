package semester1.Latihan4;

import java.util.Scanner;

class CetakNumber {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("CETAK ANGKA");
        System.out.println("==============================");

        System.out.print("Masukkan angka : ");
        String NIM = userInput.nextLine();

        for (int i = 0; i < NIM.length(); i++) {
            System.out.print("\n\n");

            char angka = NIM.charAt(i);
            pilihan(angka);

            System.out.println();
        }

    }

    static void pilihan(char angka) {
        switch (angka) {
            case '1':
                siji();
                break;

            case '2':
                loro();
                break;

            case '3':
                telu();
                break;

            case '4':
                papat();
                break;

            case '5':
                limo();
                break;

            case '6':
                enem();
                break;

            case '7':
                pitu();
                break;

            case '8':
                wolu();
                break;

            case '9':
                songo();
                break;

            case '0':
                nol();
                break;

            default:
                System.err.println("ERROR Nih Bwangg...");
                break;
        }
    }

    // Method dari angka yang ingin dicetak
    static void siji() {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 4; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 4; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void loro() {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 4; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 6; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            for (int j = 1; j <= 4; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 8; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void telu() {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 4; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 6; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 6; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 4; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void papat() {
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 8 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 8; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void limo() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 8; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5 + i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 5 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 4 - i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2; j++)
                System.out.print(" *");
            for (int j = 1; j <= 3; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 7; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void enem() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (1 + i); j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 5 + i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (4 - i); j++)
                System.out.print(" *");
            System.out.println();
        }

    }

    static void pitu() {
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 8; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 7 - i; k++)
                    System.out.print("  ");
                for (int k = 1; k <= 3; k++)
                    System.out.print(" *");
                System.out.println();
            }
        }
    }

    static void wolu() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (1 + i); j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 6; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (4 - i); j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void songo() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (1 + i); j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 8 - i; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 6; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (4 - i); j++)
                System.out.print(" *");
            System.out.println();
        }
    }

    static void nol() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 4 - i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (1 + i); j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            for (int j = 1; j <= 2; j++)
                System.out.print("  ");
            for (int j = 1; j <= 3; j++)
                System.out.print(" *");
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * (4 - i); j++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
