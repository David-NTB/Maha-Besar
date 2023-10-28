package semester1.Tugas4;

import java.util.Scanner;

class Pendahuluan{

    /* 
     * Operator Relasional
     * '==' apakah nilai sama
     * '!=' apakah nilai tidak sama
     * '<' apakah nilai lebih kecil
     * '>' apakah nilai lebih besar
     * '<=' apakah nilai lebih kecil atau sama dengan
     * '>=' apakah nilai lebih besar atau sama dengan
     * 
     * Tipe data Operator : integer, float, char, boolean
     * Tipe data keluaran : boolean (true/false)
     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("CEK GANJIL GENAP");
        System.out.println("==============================");

        System.out.print("Masukkan angka: ");
        int inp = input.nextInt();

        if(cekGG(inp)){
            System.out.println(inp + " merupakan bilangan GENAP");
        } else{
            System.out.println(inp + " merupakan bilangan GANJIL");
        }
        
        System.out.println("==============================");
        
        input.close();
    }

    private static boolean cekGG(int cek){
        return cek%2 == 0;
    }
}