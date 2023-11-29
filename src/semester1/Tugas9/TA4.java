package semester1.Tugas9;

import java.util.ArrayList;
import java.util.Random;

class TA4 {
    ArrayList<Integer> arrNilai = new ArrayList<Integer>(); 
    Random getRandom = new Random();

    public static void main(String[] args) {
        TA4 dn = new TA4();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        tampilArray();
    }

    void isiNilai() {
        // System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a <= 10; a++) {
            arrNilai.add(getRandom.nextInt(102));
        }
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai");
        for (int a = 0; a < arrNilai.size(); a++) {
            System.out.println("Index " + a + "\t: " + arrNilai.get(a) + " ");
        }
    }
}
