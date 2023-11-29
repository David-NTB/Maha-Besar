package semester1.Tugas9;

import java.util.Random;

class Array2 {
    int[] arrNilai = new int[1000];
    Random getRandom = new Random();

    public static void main(String[] args) {
        Array2 dn = new Array2();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        tampilArray();
    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            arrNilai[a] = getRandom.nextInt(102);
            if((arrNilai[a] < 0) || (arrNilai[a] > 100) ) {
                break;
            }
        }
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            System.out.println("No " + a + "\t: " + arrNilai[a] + " ");
            if((arrNilai[a] < 0) || (arrNilai[a] > 100) ) {
                System.out.println("BREAK\n"); 
            }
        }
    }
}
