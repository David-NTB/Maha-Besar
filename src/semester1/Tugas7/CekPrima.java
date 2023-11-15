package semester1.Tugas7;

import java.util.Scanner;


public class CekPrima {
    
    Scanner inp = new Scanner(System.in);
    int batas;
    
    public static void main(String[] args) {
        CekPrima cp = new CekPrima();
        cp.runThis();
    }

    void runThis() {
        System.out.println("Deret Prima");
        System.out.print("Masukkan bilangan : ");
        batas = inp.nextInt();

        // if(cekBilanganPrima(batas)){
        //     System.out.println(batas + " adalah bilangan prima");
        // } else {
        //     System.out.println(batas + " bukan bilangan prima");
        // }

        showPrima();

    }

    void showPrima(){
        System.out.print("Deret prima : ");
        boolean hasil;
        int cek = 2;
        while(cek <= batas){
            hasil = cekBilanganPrima(cek);
            if (hasil) {
                System.out.print(cek + ", ");
            }
            cek++;
        }
    }

    boolean cekBilanganPrima(int batas) {
        int counter = 2;
        int cekPrima = 0;
        while (counter <= batas) {
            if ((batas % counter) == 0) {
                cekPrima++;
            }
            counter++;
        }
        if (cekPrima > 1) {
            return false;
        } else {
            return true;
        }
    }
}

// akan terjadi "ArithmeticException" dimana pada bagian if(batas % counter), 
// (batas % counter) akan menghasilkan error