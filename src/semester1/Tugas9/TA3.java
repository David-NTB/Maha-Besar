package semester1.Tugas9;

import java.util.ArrayList;
import java.util.Scanner;

public class TA3 {

    ArrayList<Integer> arr = new ArrayList<Integer>(); //
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TA3 ca = new TA3();
        ca.inputData();
        ca.viewData();
    }

    public void inputData() {
        System.out.println("Input Data");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai " + (i + 1) + " : ");
            arr.add(sc.nextInt()); //
            
        }
        System.out.println();
    }

    public void viewData() {
        System.out.println("View Data");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai " + (i + 1) + " : " + arr.get(i)); //
        }
        System.out.println();
    }
}
