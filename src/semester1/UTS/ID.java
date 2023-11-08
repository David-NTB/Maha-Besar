package semester1.UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

class ID {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] ID = new String[5];
        int[] id_1 = new int[5];
        int[] id_2 = new int[5];
        int[] id_3 = new int[5];

        System.out.println("==============================");
        System.out.println("Pengecekan Nomor Identifikasi");
        System.out.println("==============================");

        for (int i = 0; i < ID.length; i++) {
            System.out.print("\nMasukkan nomor ID " + (i + 1) + "\t: ");
            ID[i] = input.readLine();

            id_1[i] = Character.getNumericValue(ID[i].charAt(0));
            id_2[i] = Character.getNumericValue(ID[i].charAt(1));
            id_3[i] = Character.getNumericValue(ID[i].charAt(2));

            
        }

        System.out.println("\nIndex 1: " + Arrays.toString(id_1));
        System.out.println("Index 2: " + Arrays.toString(id_2));
        System.out.println("Index 3: " + Arrays.toString(id_3));

        System.out.println("\n==============================");

        for (int i = 0; i < ID.length; i++) {
            System.out.println("\nNomor ID : " + ID[i]);
            if (id_1[i] != id_3[i] && id_1[i] != id_3[i] && id_2[i] != id_3[i]) {
                if (id_1[i] < id_2[i] && id_2[i] < id_3[i]) {
                    if (id_3[i] % 2 != 0) {
                        valid();
                    } else {
                        tv();
                    }

                } else {
                    tv();
                }

            } else {
                tv();
            }

        }

        System.out.println("\n==============================");

    }


    static void tv() {
        System.out.println("Tidak valid");
    }

    static void valid(){
        System.out.println("valid");
    }
}