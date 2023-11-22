package semester1.Tugas8;

import java.util.Scanner;

public class TA_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran : ");
        int size = input.nextInt();
        input.close();

        System.out.println("\n");
                
        //Looping FOR
        System.out.println("X Pake FOR");
        xPakeFor(size);
        System.out.println("\n");
        
        //Looping WHILE
        System.out.println("X Pake WHILE");
        xPakeWhile(size);
        System.out.println("\n");
        
        //Looping DO WHILE
        System.out.println("X Pake DO WHILE");
        xPakeDoWhile(size);
        System.out.println("\n");
    } 

    static void xPakeDoWhile(int size) {
        int i = 1;
        int j = 1;

        do {
            j=1;
            do {
                if((j==i)||(j == size - (i-1))) System.out.print(" *");
                else System.out.print("  ");
                j++;
            } while(j <= size);
            System.out.println();
            i++;
        } while(i <= size);
    }

    static void xPakeWhile(int size) {
        int i = 1;
        int j = 1;

        while(i <= size) {
            j=1;
            while(j <= size) {
                if((j==i)||(j == size - (i-1))) System.out.print(" *");
                else System.out.print("  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void xPakeFor(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if((j==i)||(j == size - (i-1))) System.out.print(" *");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
