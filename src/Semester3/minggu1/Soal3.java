package semester3.minggu1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer (or 0 to exit): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break; // sentinel value, exit loop
            }

            if (isPrime(num)) {
                System.out.println("prime");
            } else {
                System.out.println("notprime");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // num is divisible by i, so it's not prime
            }
        }
        return true; // num is prime
    }
}