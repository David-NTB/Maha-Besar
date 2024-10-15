package Semester3.minggu1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0, oddCount = 0;
        int largestEven = Integer.MIN_VALUE, largestOdd = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Masukkan nilai genap atau ganjil (akhiri dengan 0): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break; // Keluar jika input adalah 0
            }

            // Cek genap atau ganjil, dan hitung serta perbarui nilai terbesar
            if (num % 2 == 0) {
                evenCount++;
                largestEven = Math.max(largestEven, num);
            } else {
                oddCount++;
                largestOdd = Math.max(largestOdd, num);
            }
        }

        // Tampilkan hasil
        System.out.println("\nJumlah bilangan genap: " + evenCount + ", bilangan genap terbesar: " + largestEven);
        System.out.println("\nJumlah bilangan ganjil: " + oddCount + ", bilangan ganjil terbesar: " + largestOdd + "\n");

        scanner.close();
    }
}
