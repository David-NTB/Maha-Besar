package semester1.Tugas3;

import java.util.Scanner;

class Pendahuluan{
    public static void main(String[] args) {
        //Menu awal
        System.out.println("\n==============================");
        System.out.println("APLIKASI MENGHITUNG RUMUS FUNGSI");
        System.out.println("Nilai F(x,y) untuk \nF(x,y) = xy + 2x + 2y + 6");
        System.out.println("==============================\n");

        //Panggil Scanner dan Variabel
        Scanner input = new Scanner(System.in);      
        int a,b;

        //Input nilai x dan y
        System.out.print("Masukkan nilai x = ");
        a = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        b = input.nextInt();
        System.out.println("\n==============================\n");
        
        //Tampilkan hasil
        System.out.println("Hasil = " + FungsiX(a,b));
        System.out.println("\n==============================\n");

        input.close();

    }

    private static int FungsiX(int x, int y){
        int hasil = (x*y) + (2*x) + (2*y) + 6;
        return hasil;
    }

}

/* 
package Tugas3;

public class Parameter {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("PARAMETER FORMAL DAN AKTUAL");
        System.out.println("==============================\n");
        
        int param = 12345;

        System.out.println("nilai param = 12345");

        System.out.println("==============================");
        System.out.println("Ini Parameter Formal");

        System.out.println(ParamX(param));//"param" parameter aktual

        System.out.println("==============================\n");

    }
    private static int ParamX(int eter){ //"eter" parameter formal
        return eter;
    }

}
*/