package semester1.Tugas2;

public class PengubahValue {
    public static void main(String[] args) {
        //membuat variabel baru
        int a = 100;
        int b = 99;
        int c = 0;
        
        //munculkan nilai awal
        System.out.println("Nilai Awal");
        System.out.println("Nilai A: " + a);
        System.out.println("Nilai B: " + b +"\n");

        //mengganti nilai
        c = a;
        a = b;
        b = c;

        //munculkan nilai akhir
        System.out.println("Nilai Akhir");
        System.out.println("Nilai A: " + a);
        System.out.println("Nilai B: " + b + "\n");
    }
}
