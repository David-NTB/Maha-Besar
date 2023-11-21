package semester1.Latihan4;

import java.util.Scanner;

class SpiralAbyss {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("SPIRAL ABYSS FLOOR 12");
        System.out.println("==============================\n");

        System.out.print("Masukkan ukuran : ");
        int size = userInput.nextInt();

        System.out.println("\n");

        //Process
        
        String[][] spiral = new String[size][size];

        //isi array dengan spasi
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                spiral[i][j] = "  ";
        }

        // membuat array
        kurukuru(spiral, size); 

        // print array
        printArray(spiral, size); 
    }

    static void kurukuru(String[][] array, int size){
        int bound = size;
        int x = 0;
        int y = 0;
        for (int r = 1; r <= size; r++) {
            // atas
            for (int i = 0; i < bound; i++) {
                array[x][y] = " #";
                x++;
            }
            bound--;
            x--;

            // kanan
            for (int i = 0; i < bound; i++) {
                array[x][y] = " #";
                y++;
            }
            bound--;
            y--;

            // bawah
            for (int i = bound; i > 0; i--) {
                array[x][y] = " #";
                x--;
            }
            bound--;
            x++;

            // kiri
            for (int i = bound; i > 0; i--) {
                array[x][y] = " #";
                y--;
            }
            bound--;
            y++;
        }
    }

    static void printArray(String[][] array, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(array[j][i]);
            System.out.println();
        }
    }

}