package semester1.Latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nMasukkan jam Awal: ");
        String wk1 = input.readLine();
        System.out.print("Masukkan jam Akhir: ");
        String wk2 = input.readLine();

        byte jam1 = Byte.parseByte(wk1.substring(0, 2));
        byte menit1 = Byte.parseByte(wk1.substring(3, 5));
        
        byte jam2 = Byte.parseByte(wk2.substring(0, 2));
        byte menit2 = Byte.parseByte(wk2.substring(3, 5));

        byte jam3 = (byte) (jam2 - jam1);
        byte menit3 = (byte) (menit2 - menit1);

        if(jam3 < 0){
            jam3 = (byte) (24 - (jam3*-1));
        }

        if(menit3 < 0) {
            menit3 = (byte) (60 - (menit3*-1));
            jam3 = (byte) (jam3 - 1);
        }
        
        System.out.println("\nSelisih jam: " + jam3 + " jam");
        System.out.println("Selisih menit: " + menit3 + " menit");

        
    }
}
