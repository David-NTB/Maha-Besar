package semester1.UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Status {
    public static void main(String[] args) throws IOException{
        // Scanner input = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==============================");
        System.out.println("Status Kelulusan");
        System.out.println("==============================\n");

        String temp = " ";

        System.out.print("Masa studi (tahun)\t: ");
        temp = input.readLine();
        int masa = Integer.parseInt(temp);
        System.out.print("Masukkan nilai IPK\t: ");
        temp = input.readLine();
        double ipk = Double.parseDouble(temp);
        System.out.print("Masukkan nilai EPRT\t: ");
        temp = input.readLine();
        int eprt = Integer.parseInt(temp);
        System.out.print("SK Industri(ada/tidak)\t: ");
        temp = input.readLine();

        System.out.println("");
        
        if (ipk > 3.50){
            if(masa <= 6){
                if(eprt >= 450){
                    if (temp.equals("ada")) {
                        System.out.println("Status kelulusan : Cumlaude");
                        System.out.println("==============================");
                        System.exit(0);
                    }
                }
            }
            System.out.println("Status kelulusan : Sangat Memuaskan");
        } else if(ipk > 3){
            System.out.println("Status kelulusan : Sangat Memuaskan");
        } else if (ipk > 2.75){
            System.out.println("Status kelulusan : Memuaskan");
        } else {
            System.out.println("Status kelulusan : Anda tidak lulus");
        }


        System.out.println("==============================");
    }

}
// Memuaskan 2.76 – 3.0
// Sangat Memuaskan 3.01 – 3.50
// Cumlaude > 3.51

// 1. Masa studi maksimal 6 semester
// 2. Mendapat nilai EPRT >= 450, dan
// 3. Memiliki Surat Keterangan Industri