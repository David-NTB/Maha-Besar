package semester1.Tugas7;

import java.util.Scanner;

public class DeretJumlah {

    Scanner inp = new Scanner(System.in);
    int batas;

    public static void main(String[] args) {
        DeretJumlah dj = new DeretJumlah();
        dj.runThis();
    }

    void runThis() {
        System.out.println("Penjumlahan bilangan genap");
        System.out.print("Masukkan batas : ");
        batas = inp.nextInt();
        daftarGenap(batas);
    }

    void daftarGenap(int batas) {
        int sum = 0;
        for (int counter = 1; counter <= batas; counter++) {
            if ((counter % 2) == 0) {
                sum += counter;
                System.out.print(counter);

                if(counter != batas){
                    System.out.print(" + ");
                }
            }
        }
        System.out.println(" = " + sum);
    }
}
