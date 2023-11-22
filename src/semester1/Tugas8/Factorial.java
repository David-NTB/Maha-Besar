package semester1.Tugas8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int size = input.nextInt();
        input.close();

        System.out.println("\n");
        
        //Looping FOR
        System.out.println("X Pake FOR");
        faktorFor(size);
        System.out.println("\n");
        
        //Looping WHILE
        System.out.println("X Pake WHILE");
        faktorWhile(size);
        System.out.println("\n");
        
        //Looping DO WHILE
        System.out.println("X Pake DO WHILE");
        faktorDoWhile(size);
        System.out.println("\n");
    }

    static void faktorFor(int input) {
        int sum = 1;

        System.out.print(input + "! = ");
        for (int i = input; i > 0; i--) {
            sum *= i;
            System.out.print(i);

            if (i != 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + sum);
    }
    
    static void faktorWhile(int input) {
        int sum = 1;

        System.out.print(input + "! = ");
        while (input > 0) {
            sum *= input;
            System.out.print(input);

            if (input != 1) {
                System.out.print(" x ");
            }
            input--;
        }
        System.out.println(" = " + sum);
    }
    
    static void faktorDoWhile(int input) {
        int sum = 1;

        System.out.print(input + "! = ");
        do {
            sum *= input;
            System.out.print(input);

            if (input != 1) {
                System.out.print(" x ");
            }
            input--;
        }while (input > 0);
        System.out.println(" = " + sum);
    }
}
