package semester1.Tugas9;

import java.util.ArrayList;
import java.util.Random;

public class Array3 {

    Random getRandom = new Random();
    ArrayList<Integer> arList = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        Array3 list = new Array3();

        System.out.println("\nInput data");
        list.inputData();

        System.out.println("\nTampilkan data");
        list.ambilData();

        System.out.println("\nTampilkan kebalik");
        list.tampilkanData();
    }

    void inputData() {
        int jml = 0;
        while (jml < 100) {
            System.out.println("No " + (jml + 1) + ". : ");
            int inputan = getRandom.nextInt(101);
            arList.add(inputan); // Penambahan data ke ArrayList
            jml++;
        }
    }

    void ambilData() {
        int a = 0;
        int arrMax = arList.size();
        while (a < arrMax) {
            // Mengambil nilai dari ArrayList pada index ke-a
            int nilai = arList.get(a);
            System.out.println("No" + (a + 1) + ". " + nilai);
            a++;

        }
    }

    void tampilkanData() {
        int a = arList.size()-1;
        int arrMax = 0;
        while (a >= arrMax) {
            // Mengambil nilai dari ArrayList pada index ke-a
            String nilai = "" + arList.get(a);
            System.out.println("No" + (100 - a) + ". " + nilai);
            a--;

        }
    }

}
