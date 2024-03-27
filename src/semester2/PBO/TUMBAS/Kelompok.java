package semester2.PBO.TUMBAS;

public class Kelompok {
    String nama;
    Lomba nilai;
    
    public Kelompok(String nama, Lomba nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "\nNama: " + nama + ", \nJenis lomba: " + nilai.getClass() + "\nNilai: " + nilai.getHasil() + "\nDetail: " + nilai.toString();
    }

    public String toDatabaseString() {
        return "Nama: " + nama + ", \nJenis lomba: " + nilai.getClass() +  " Nilai: " + nilai.getHasil() + ", Detail: " + nilai.toString();
    }

    public String getNama() {
        return nama;
    }

    public Lomba getNilai() {
        return nilai;
    }
}
