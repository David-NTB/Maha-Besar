package semester1.Latihan3;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        //instansiasi Scanner
        Scanner input = new Scanner(System.in);

        //menu
        System.out.println("==============================");
        System.out.println("MENGIITUNG FAKTORIAL");
        System.out.println("==============================");

        //user input
        System.out.print("Masukkan input : ");
        int in = input.nextInt();
        input.close();
    
        int hasil = 1;
        //menghitung faktorial
        for(int i = in; i > 0; i--) hasil *= i;
        

        //menampilkan ke layar
        System.out.println("Hasil : " + hasil);

        System.out.println("==============================");
    }
}