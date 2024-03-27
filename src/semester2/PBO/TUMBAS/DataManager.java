package semester2.PBO.TUMBAS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DataManager {
    private String FILENAME;

    public DataManager(String FILENAME) {
        this.FILENAME = FILENAME;
    }

    public void saveData(ArrayList<Kelompok> kelompok) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Kelompok nilai : kelompok) {
                writer.println(nilai.toDatabaseString());
            }
            System.out.println("Data disimpan");
        } catch (IOException e) {
            System.err.println("Error : saveData()");
            e.printStackTrace();
        }
    }

    public ArrayList<Kelompok> loadAllData() {
        ArrayList<Kelompok> kelompok = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Parsing data dari baris dalam file
                String[] parts = line.split(", ");
                String nama = parts[0].substring(6).trim();
                int n1 = Integer.parseInt(parts[3].substring(8).trim());
                int n2 = Integer.parseInt(parts[4].trim());
                int n3 = Integer.parseInt(parts[5].trim());
                int n4 = Integer.parseInt(parts[6].trim());

                Object a = parts[1].substring(13).trim();
                
                // Membuat objek Kelompok baru dan menambahkannya ke dalam ArrayList
                Lomba lomba = new a(n1, n2, n3, n4);
                kelompok.add(new Kelompok(nama, lomba));
            }
        } catch (IOException e) {
            System.err.println("Error : loadAllData()");
            e.printStackTrace();
        }
        return kelompok;
    }


}
