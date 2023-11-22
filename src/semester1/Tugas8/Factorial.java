package semester1.Tugas8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        input.close();

        System.out.println("\n");

        //Looping FOR
        System.out.println("X Pake FOR");
        sigmaFor(angka);
        System.out.println("\n");
        
        //Looping WHILE
        System.out.println("X Pake WHILE");
        sigmaWhile(angka);
        System.out.println("\n");
        
        //Looping DO WHILE
        System.out.println("X Pake DO WHILE");
        sigmaDoWhile(angka);
        System.out.println("\n");

    }
    
    static void sigmaFor(int angka) {
        int sigma = 0;

        for(int i = angka; i > 0; i--) {
            sigma += faktor(i);
            System.out.print(faktor(i));
            
            if(i != 1){
                System.out.print(" + ");
            }
        }
        
        System.out.print("\nSigma : " + sigma);
    }

    static void sigmaWhile(int angka) {
        int sigma = 0;

        while(angka > 0) {
            sigma += faktor(angka);
            System.out.print(faktor(angka));
            
            if(angka != 1){
                System.out.print(" + ");
            }
            angka--;
        }
        
        System.out.print("\nSigma : " + sigma);
    }

    static void sigmaDoWhile(int angka) {
        int sigma = 0;

        do {
            sigma += faktor(angka);
            System.out.print(faktor(angka));
            
            if(angka != 1){
                System.out.print(" + ");
            }
            angka--;
        } while(angka > 0);
        
        System.out.print("\nSigma : " + sigma);
    }

    static int faktor(int in){
        int hasil = 1;
        for(int i = in; i > 0; i--) {
            hasil *= i;    
        }
        return hasil;
    }
}