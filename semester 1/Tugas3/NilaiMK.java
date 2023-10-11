package Tugas3;

import java.io.InputStreamReader;
import java.io.BufferedReader;

class NilaiMK{
    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int prakt;
    private double nilai;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);


    void inputData(){
        System.out.println("\n==============================");
        System.out.println("NILAI ALGORITMA DAN PEMROGRAMAN");
        System.out.println("==============================");

        try{
            System.out.print("NIM \t\t: ");
            this.nim = inp.readLine();
            System.out.print("Nilai 1 \t: ");
            this.a1= Integer.parseInt(inp.readLine());
            System.out.print("Nilai 2 \t: ");
            this.a2= Integer.parseInt(inp.readLine());
            System.out.print("Nilai 3 \t: ");
            this.a3= Integer.parseInt(inp.readLine());
            System.out.print("Nilai tugas \t: ");
            this.tugas= Integer.parseInt(inp.readLine());
            System.out.print("Nilai praktikum\t: ");
            this.prakt= Integer.parseInt(inp.readLine());
            System.out.println("==============================\n");


        } catch(Exception e){
            System.out.println("Error : "+e);
        }

        hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.prakt);
    }

    void hitungNilai(int a1, int a2, int a3, int tugas, int prakt){
        this.nilai = (0.15*a1) + (0.15*a2) + (0.1*a3) + (0.2*tugas) + (0.4*prakt);
    }


    void viewNilai(){
        System.out.println("\n==============================");
        System.out.println("NILAI ASSESSMENT");
        System.out.println("==============================");

        System.out.println("NIM \t\t: " + this.nim);
        System.out.println("Assessment 1 \t: " + this.a1);
        System.out.println("Assessment 2 \t: " + this.a2);
        System.out.println("Assessment 3 \t: " + this.a3);
        System.out.println("Tugas \t\t: " + this.tugas);
        System.out.println("Praktikum \t: " + this.prakt);
        System.out.println("Nilai Akhir \t: " + this.nilai);

        System.out.println("==============================\n");
    }

    public static void main(String[] xyz){
    NilaiMK nmk = new NilaiMK();
    nmk.inputData();
    nmk.viewNilai();
    } 
}


