package semester1.Tugas7;

import java.util.Scanner;

public class DeretBilangan {

    Scanner inp = new Scanner(System.in);
    int batas;

    public static void main(String[] args) {
        DeretBilangan db = new DeretBilangan();
        db.runThis();
    }

    void runThis() {
        System.out.println("Deret nilai");
        System.out.print("Masukkan batas : ");
        batas = inp.nextInt();
        daftarGenap(batas);
    }

    void daftarGenap(int batas) {
        int counter = 1;
        System.out.print("Daftar Nilai Genap : ");
        while (counter <= batas) {
            if ((counter % 2) == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}

/*
 * 1. Jika counter++ diubah menjadi counter--, maka akan menjadi infinity loop
 * 2. counter++ digunakan untuk menambah counter dengan 1
 * 3. Padanan counter++ : 
 *      counter += 1;
 *      counter = counter + 1;
 * 
 * 1. while(counter < batas), angka genap yang muncul akan berkurang satu jika inut yang dimasukkan adalah angka genap
 * 2. while(counter > batas), kondisi tidak akan terjadi sehingga tidak akan ada yang muncul di layar
 */
