package semester3.minggu1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sebuah program :) (ending with 0)\n");

        //pendifisian angka negatif dan angka positif
        int negativeCount = 0;
        int positiveCount = 0;

        //membaca dan menghitung jumlah angka negatif dan positif
        while (true) {
            System.out.print("Masukkan angka (Negative or Positive) : ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                negativeCount++;
            } else {
                positiveCount++;
            }
        }

        //logic perhitugan
        String result;
        if (negativeCount > positiveCount) {
            result = "negative";
        } else if (negativeCount < positiveCount) {
            result = "positive";
        } else {
            result = "balanced";
        }

        System.out.println("\nTotal dari angka negative : " + negativeCount);
        System.out.println("Total dari angka positife : " + positiveCount);
        System.out.println("\nYang banyak adalah : " + result);
        System.out.println();

        scanner.close();
    }
}