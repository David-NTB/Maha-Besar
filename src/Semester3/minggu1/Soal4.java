package semester3.minggu1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer (or 0 to exit): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break; // sentinel value, exit loop
            }

            if (isPerfect(num)) {
                System.out.println("perfect");
            } else {
                System.out.println("not perfect");
            }
        }

        scanner.close();
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}