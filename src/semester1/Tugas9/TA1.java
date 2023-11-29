package semester1.Tugas9;

import java.util.Random;

class TA1 {
    int[] arrNilai = new int[100];
    int[] muncul = new int[100];
    Random getRandom = new Random();
    int bound = 101;

    public static void main(String[] args) {
        TA1 dn = new TA1();
        dn.runThis();
    }

    void runThis() {
        isiNilai();
        System.out.println("Tampilkan Array");
        tampilArray();
        System.out.println("\nKemunculan");
        kemunculan();
        modus();
    }

    void isiNilai() {
        System.out.println("\n\nPengisian Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            arrNilai[a] = getRandom.nextInt(bound);
            if ((arrNilai[a] < 0) || (arrNilai[a] > 100)) {
                break;
            }
        }
    }

    void tampilArray() {
        System.out.println("\n\nDaftar Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            System.out.println("No " + a + "\t: " + arrNilai[a] + " ");
            if ((arrNilai[a] < 0) || (arrNilai[a] > 100)) {
                System.out.println("BREAK\n");
            }
        }
    }

    void kemunculan() {
        for (int i = 0; i < bound - 1; i++) {
            for (int j = 0; j < arrNilai.length; j++) {
                if (arrNilai[j] == i) {
                    muncul[i] += 1;
                }
            }
            System.out.println("Kemunculan " + i + " : " + muncul[i]);
        }
        System.out.println();
    }

    void modus() {
        int maxIndex = 0;
        for (int i = 1; i < muncul.length; i++) {
            if (muncul[i] > muncul[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("\nKemunculan terbanyak : " + maxIndex);
    }
    
}
