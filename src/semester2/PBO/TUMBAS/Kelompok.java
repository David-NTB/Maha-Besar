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
        return "Nama: " + nama + ", Nilai: " + nilai.getHasil() + ", Detail: " + nilai.toString();
    }

    public String getNama() {
        return nama;
    }

    public Lomba getNilai() {
        return nilai;
    }
}
