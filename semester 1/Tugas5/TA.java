package Tugas5;

import java.util.Scanner;

public class TA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int income = 0;
        double pajakTotal = 0;

        System.out.println("\n==============================");
        System.out.println("PAJAK PENGHASILAN SETAHUN");
        System.out.println("==============================\n");

        System.out.print("Income(jt)\t: ");
        income = input.nextInt();
        System.out.print("\n");
        input.close();

        boolean next = false;
        int i = 0;
        double[] tarif = { 5, 15, 25, 30, 35 };
        int[] wajibPajak = { 60, 190, 250, 4500, income };
        double[] kuartil = { 0, 0, 0, 0, 0 };

            while (!next) {

                if (income >= wajibPajak[i]) {
                    income -= wajibPajak[i];
                    kuartil[i] = wajibPajak[i] * (tarif[i] / 100);
                    System.out.println("kuartil " + (i + 1) + "(jt)\t: " + kuartil[i]);
                    pajakTotal += kuartil[i];
                    i++;

                } else if (income > 0) {
                    kuartil[i] = income * (tarif[i] / 100);
                    income = 0;
                    System.out.println("kuartil " + (i + 1) + "(jt)\t: " + kuartil[i]);
                    pajakTotal += kuartil[i];

                } else {
                    next = true;
                }
            }

            System.out.println("\nTotal pajak(jt)\t: " + pajakTotal);
            System.out.println("\n==============================\n");
    }
}
