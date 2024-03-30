package semester2.PBO.GOJEK;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {
    
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error : cls()");
            e.printStackTrace();
        }
    }

    public static void pressEnter() {
        System.out.println("\n================================================");
        System.out.print("Tekan ENTER untuk lanjut");
        inputLine();
    }
    
    public static String inputLine() {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        try {
            String a = input.readLine();
            return a;
        } catch (Exception e) {
            System.err.println("Error : readLine()");
            e.printStackTrace();
            return null;
        }
    }

    public static int inputInt() {
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        try {
            int a = Integer.parseInt(input.readLine());
            return a;
        } catch (Exception e) {
            System.err.println("\nError : Input salah");
            return 0;
        }
    }


}
