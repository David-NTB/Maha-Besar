package semester2.PBO.TUMBAS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DataManager {
    private static final String FILENAME = "src\\semester2\\PBO\\TUMBAS\\database.txt";

    public void saveData(ArrayList<Kelompok> kelompok) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Kelompok nilai : kelompok) {
                writer.println(nilai.toDatabaseString());
            }
            System.out.println("Data disimpan");
            Util.pressEnter();
        } catch (IOException e) {
            System.err.println("Error : saveData()");
            e.printStackTrace();
        }
    }

    public ArrayList<Kelompok> loadData() {
        ArrayList<Kelompok> listKelompok = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String nama = parts[0].trim();
                int n1 = Integer.parseInt(parts[3].trim());
                int n2 = Integer.parseInt(parts[4].trim());
                int n3 = Integer.parseInt(parts[5].trim());
                int n4 = Integer.parseInt(parts[6].trim());

                String jenis = parts[1].trim();

                Lomba lomba;
                switch (jenis) {
                    case "semester2.PBO.TUMBAS.UIUX":
                        lomba = new UIUX(n1, n2, n3, n4);
                        listKelompok.add(new Kelompok(nama, lomba));
                        break;

                    case "semester2.PBO.TUMBAS.Algo":
                        lomba = new Algo(n1, n2, n3);
                        listKelompok.add(new Kelompok(nama, lomba));
                        break;

                    case "semester2.PBO.TUMBAS.Data":
                        lomba = new Data(n1, n2, n3);
                        listKelompok.add(new Kelompok(nama, lomba));
                        break;

                    case "semester2.PBO.TUMBAS.Lomba":
                        lomba = new Lomba(n1, n2, n3, n4);
                        listKelompok.add(new Kelompok(nama, lomba));
                        break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error : loadAllData()");
            e.printStackTrace();
        }
        return listKelompok;
    }
}
