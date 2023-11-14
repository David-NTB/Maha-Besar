package semester1.Latihan3;

import java.util.Scanner;

public class Faktorial extends Main{
    
    public void operasi(){
        //instansiasi Scanner
        Scanner input = new Scanner(System.in);
        
        //menu
        System.out.println("==============================");
        System.out.println("MENGIITUNG FAKTORIAL");
        System.out.println("==============================");        
        
        //user input
        System.out.print("Masukkan input : ");
        int in = input.nextInt();
        
        //menghitung faktorial
        int hasil = faktor(in);

        //menampilkan ke layar
        System.out.println("Hasil : " + hasil);
        
        System.out.println("==============================");
    }
    
    public int faktor(int in){
        int hasil = 1;
        for(int i = in; i > 0; i--) {
            hasil *= i;    
        }
        return hasil;
    }
    
}
