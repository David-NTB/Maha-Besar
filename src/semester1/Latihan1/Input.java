package semester1.Latihan1;

import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan angka (0-9999): ");
        int angka = input.nextInt();

        if ((angka >= 0) && (angka <= 9999)){
            sebut(angka);
        } else {
            System.out.println("Angka (0-9999)");
        }



        input.close();
        
    }
    
    private static void sebut(int angka){
        
        int ribu = angka / 1000;
        int sRibu = angka % 1000;
        int ratus = sRibu / 100;
        int sRatus = sRibu % 100;
        int puluh = sRatus / 10;
        int sPuluh = sRibu % 10;
        int satu = sPuluh % 10;

        switch (ribu) {
            case 1:
                System.out.print("seribu ");
                break;
        
            case 2:
                System.out.print("dua ribu ");
                break;
        
            case 3:
                System.out.print("tiga ribu ");
                break;
        
            case 4:
                System.out.print("empat ribu ");
                break;
        
            case 5:
                System.out.print("lima ribu ");
                break;
        
            case 6:
                System.out.print("enam ribu ");
                break;
        
            case 7:
                System.out.print("tujuh ribu ");
                break;
        
            case 8:
                System.out.print("delapan ribu ");
                break;
        
            case 9:
                System.out.print("sembilan ribu ");
                break;
        
            default:
                break;
        }

        switch (ratus) {
            case 1:
                System.out.print("seratus ");
                break;
        
            case 2:
                System.out.print("dua ratus ");
                break;
        
            case 3:
                System.out.print("tiga ratus ");
                break;
        
            case 4:
                System.out.print("empat ratus ");
                break;
        
            case 5:
                System.out.print("lima ratus ");
                break;
        
            case 6:
                System.out.print("enam ratus ");
                break;
        
            case 7:
                System.out.print("tujuh ratus ");
                break;
        
            case 8:
                System.out.print("delapan ratus ");
                break;
        
            case 9:
                System.out.print("sembilan ratus ");
                break;

            default:
                break;
        }

        switch (puluh) {
            case 1:
                System.out.print("sepuluh ");
                break;
        
            case 2:
                System.out.print("dua puluh ");
                break;
        
            case 3:
                System.out.print("tiga puluh ");
                break;
        
            case 4:
                System.out.print("empat puluh ");
                break;
        
            case 5:
                System.out.print("lima puluh ");
                break;
        
            case 6:
                System.out.print("enam puluh ");
                break;
        
            case 7:
                System.out.print("tujuh puluh ");
                break;
        
            case 8:
                System.out.print("delapan puluh ");
                break;
        
            case 9:
                System.out.print("sembilan puluh ");
                break;
                
            default:
                break;
        }

        switch (satu) {
            case 1:
                System.out.println("satu");
                break;
        
            case 2:
                System.out.println("dua");
                break;
        
            case 3:
                System.out.println("tiga");
                break;
        
            case 4:
                System.out.println("empat");
                break;
        
            case 5:
                System.out.println("lima");
                break;
        
            case 6:
                System.out.println("enam");
                break;
        
            case 7:
                System.out.println("tujuh");
                break;
        
            case 8:
                System.out.println("delapan");
                break;
        
            case 9:
                System.out.println("sembilan");
                break;
                
            default:
                break;
        }
    }
}
