package semester1.Latihan2;

import java.util.Scanner;
import java.util.Calendar;

public class test {
    public static void main(String[] args) {
        Calendar kalender = Calendar.getInstance();
        Scanner in = new Scanner(System.in);
        
        int thn, bln, tgl, hari;

        System.out.println("\nHari Sekarang");
        System.out.print("Hari: ");
        hari = in.nextInt();
        System.out.print("Tanggal: ");
        tgl = in.nextInt();
        System.out.print("Bulan: ");
        bln = in.nextInt();
        System.out.print("Tahun: ");
        thn = in.nextInt();

        switch(bln){
            case 1:
            kalender.set(thn, Calendar.JANUARY, tgl);
            break;

            case 2:
            kalender.set(thn, Calendar.FEBRUARY, tgl);
            break;

            case 3:
            kalender.set(thn, Calendar.MARCH, tgl);
            break;

            case 4:
            kalender.set(thn, Calendar.APRIL, tgl);
            break;

            case 5:
            kalender.set(thn, Calendar.MAY, tgl);
            break;

            case 6:
            kalender.set(thn, Calendar.JUNE, tgl);
            break;

            case 7:
            kalender.set(thn, Calendar.JULY, tgl);
            break;

            case 8:
            kalender.set(thn, Calendar.AUGUST, tgl);
            break;

            case 9:
            kalender.set(thn, Calendar.SEPTEMBER, tgl);
            break;

            case 10:
            kalender.set(thn, Calendar.OCTOBER, tgl);
            break;

            case 11:
            kalender.set(thn, Calendar.NOVEMBER, tgl);
            break;

            case 12:
            kalender.set(thn, Calendar.DECEMBER, tgl);
            break;

        }
    
        nama(thn, bln, tgl);

        System.out.print("Masukkan hari ke ");
        int x = in.nextInt();

        kalender.add(Calendar.DAY_OF_YEAR, -x);
        
        thn = kalender.get(Calendar.YEAR);
        bln = kalender.get(Calendar.MONTH) + 1;
        tgl = kalender.get(Calendar.DAY_OF_MONTH);
        hari = kalender.get(Calendar.DAY_OF_WEEK);

        String[] Day = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        System.out.println("\nSetelah hari ke " + x);
        System.out.println("Hari: " + Day[hari - 1]);
        System.out.println("Tanggal: "+ tgl);
        System.out.println("Bulan: " + bln);
        System.out.println("Tahun: " + thn);
        
        in.close();
    }

    private static void nama(int a, int tahun, int tanggal){
        Calendar kalender = Calendar.getInstance();

    }

    
}
