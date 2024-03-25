import java.util.ArrayList;

class Pegawai{
    protected String nama;
    protected int gajiPokok;
    protected int hariKerja;
    protected int tunjanganTransport;

    Pegawai(String nama, int gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public int getTunjanganTransport() {
        return tunjanganTransport;
    }

    public int hitungGaji() {
        return (gajiPokok + (tunjanganTransport * hariKerja));
    }
}

class Staff extends Pegawai{
    public Staff() {
        super("Supri", 1000000);
    }
}

class Manajer extends Pegawai{
    protected int tunjanganKesehatan;

    public Manajer() {
        super("Mumun", 2000000);
    }

    public int getTunjanganKesehatan() {
        return 1000000;
    }

    public int hitungGaji() {
        return (gajiPokok + (tunjanganTransport * hariKerja) + tunjanganKesehatan);
    }
}

class Direktur extends Pegawai{
    protected int tunjanganKesehatan;
    protected int tunjanganBensin;

    public Direktur() {
        super("Mumun", 4000000);
    }

    public int getTunjanganKesehatan() {
        return 2000000;
    }

    public int getTunjanganBensin() {
        return 500000;
    }

    public int hitungGaji() {
        return (gajiPokok + (tunjanganTransport * hariKerja) + tunjanganKesehatan + tunjanganBensin);
    }
}

class Driver{
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        
        Pegawai pegawai = new Manajer();
    }
}