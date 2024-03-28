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
        if(nilai.getClass().getName().equals("semester2.PBO.TUMBAS.Lomba")) {
            return "\nNama: " + nama + "\nJenis lomba: Belum memilih lomba" + "\nNilai: " + nilai.getHasil() + "\nDetail: " + nilai.toString();
        }
        return "\nNama: " + nama + "\nJenis lomba: " + nilai.getClass().getName() + "\nNilai: " + nilai.getHasil() + "\nDetail: " + nilai.toString();
    }

    public String toDatabaseString() {
        return nama + ", " + nilai.getClass().getName() +  ", " + nilai.getHasil() + ", " + nilai.toString();
    }

    public String getNama() {
        return nama;
    }

    public Lomba getNilai() {
        return nilai;
    }
}
