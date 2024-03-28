package semester2.PBO.Test;

import java.io.*;
import java.util.ArrayList;

class Lomba {
    private int n1;
    private int n2;
    private int n3;
    private int n4;

    public Lomba(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    @Override
    public String toString() {
        return n1 + ", " + n2 + ", " + n3 + ", " + n4;
    }
}

class Kelompok {
    private String nama;
    private Lomba lombas;

    public Kelompok(String nama, Lomba lombas) {
        this.nama = nama;
        this.lombas = lombas;
    }

    @Override
    public String toString() {
            return "\nNama: " + nama + "\nNilai: " + lombas.toString();
    }
}

public class DatabaseManager {
    private static final String FILENAME = "src\\semester2\\PBO\\TUMBAS\\database.txt";

    public void loadAllData(ArrayList<Kelompok> kelompoks) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String nama = parts[0].trim();
                int n1 = Integer.parseInt(parts[3].trim());
                int n2 = Integer.parseInt(parts[4].trim());
                int n3 = Integer.parseInt(parts[5].trim());
                int n4 = Integer.parseInt(parts[6].trim());

                Lomba lomba = new Lomba(n1, n2, n3, n4);
                kelompoks.add(new Kelompok(nama, lomba));
            }
        } catch (IOException e) {
            System.err.println("Error : loadAllData()");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        ArrayList<Kelompok> kelompoks = new ArrayList<>();
        manager.loadAllData(kelompoks);

        for (Kelompok kelompok : kelompoks) {
            System.out.println(kelompok);
        }

        // Sekarang kelompoks berisi data dari file tanpa membuat ArrayList baru
    }
}
