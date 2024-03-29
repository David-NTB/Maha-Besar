package semester2.PBO.TUMBAS;

public class Kelompok {
    String nama;
    Lomba lomba;
    
    public Kelompok(String nama, Lomba lomba) {
        this.nama = nama;
        this.lomba = lomba;
    }

    @Override
    public String toString() {
        if(lomba.getClass().getName().equals("semester2.PBO.TUMBAS.Lomba")) {
            return "\nNama: " + nama + "\nJenis lomba: Belum memilih lomba" + "\nNilai: " + lomba.getHasil() + "\nDetail: " + lomba.toString();
        }
        return "\nNama: " + nama + "\nJenis lomba: " + lomba.getClass().getName() + "\nNilai: " + lomba.getHasil() + "\nDetail: " + lomba.toString();
    }

    public String toDatabaseString() {
        return nama + ", " + lomba.getClass().getName() +  ", " + lomba.getHasil() + ", " + lomba.toString();
    }

    public String getNama() {
        return nama;
    }

    public Lomba getLomba() {
        return lomba;
    }
}
