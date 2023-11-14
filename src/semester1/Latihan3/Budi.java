package semester1.Latihan3;

import java.util.Scanner;

public class Budi {

    public void ketemu() {
        //instansiasi Scanner
        Scanner input = new Scanner(System.in);

        //menu
        System.out.println("==================================================");
        System.out.println("MENGKALKULASIKAN TABRAKAN BUDI DAN ANI");
        System.out.println("==================================================\n");
        System.out.println("==================================================");
        System.out.println("Budi dan Ani saling mencintai, mereka bertemu di bandara. Budi di ruang Budi dan Ani saling mencintai, mereka bertemu di bandara. Budi di ruang oleh Budi dan Ani untuk saling bertemu, jika kecepatan lari Budi adalah N km/jam dan Ani adalah M km/jam.");
        System.out.println("==================================================\n");

        // user input
        System.out.print("Masukkan kecepatan Budi : ");
        double budi = input.nextInt();
        System.out.print("Masukkan kecepatan Ani : ");
        double ani = input.nextInt();
        System.out.print("Masukkan Jarak mereka berdua : ");
        double jarak = input.nextInt() * 1000;

        // konversi jarak ke m/s
        budi = budi * 1000 / 3600;
        ani = ani * 1000 / 3600;

        double budiJalan = 0;
        double aniJalan = 0;

        int waktu = 0;
        while (0 < jarak) {
            jarak -= (budi + ani);
            budiJalan += budi;
            aniJalan += ani;

            if (jarak < 0) {
                jarak -= (budi + ani);
                break;
            }

            waktu++;

        }

        System.out.println("\n==================================================\n");
        System.out.println("Budi dan Ani akan berpapasan di detik ke-" + waktu);
        System.out.println("Budi harus berjalan sejauh : " + budiJalan + " meter");
        System.out.println("Ani harus berjalan sejauh : " + aniJalan + " meter");

        System.out.println("\n==================================================");
    }

}