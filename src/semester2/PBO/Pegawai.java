package semester2.PBO;

import java.util.ArrayList;

public class Pegawai{
    protected String nama;
    protected int gajiPokok;
    protected int hariKerja;
    protected int tunjanganTransport;

    Pegawai(String nama, int gajiPokok, int hariKerja){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.hariKerja = hariKerja;
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
        return 50000;
    }

    public int hitungGaji() {
        return (getGajiPokok() + (getTunjanganTransport() * getHariKerja()));
    }
}

class Staff extends Pegawai{
    public Staff(String nama, int hariKerja) {
        super(nama, 1000000, hariKerja);
    }
}

class Manajer extends Pegawai{
    protected int tunjanganKesehatan;

    public Manajer(String nama, int hariKerja) {
        super(nama, 2000000, hariKerja);
    }

    public int getTunjanganKesehatan() {
        return 1000000;
    }

    @Override
    public int hitungGaji() {
        return (getGajiPokok() + (getTunjanganTransport() * getHariKerja()) + getTunjanganKesehatan());
    }
}

class Direktur extends Pegawai{
    protected int tunjanganKesehatan;
    protected int tunjanganBensin;

    public Direktur(String nama, int hariKerja) {
        super(nama, 4000000, hariKerja);
    }

    public int getTunjanganKesehatan() {
        return 2000000;
    }

    public int getTunjanganBensin() {
        return 500000;
    }

    @Override
    public int hitungGaji() {
        return (getGajiPokok() + (getTunjanganTransport() * getHariKerja()) + getTunjanganKesehatan() + getTunjanganBensin());
    }
}

class Driver2{
    public static void main(String[] args) {
        ArrayList<Pegawai> list = new ArrayList<>();
        
        Pegawai pegawai1 = new Manajer("Tono", 23);
        Pegawai pegawai2 = new Manajer("Joko", 23);
        Pegawai pegawai3 = new Direktur("Budi", 24);
        Pegawai pegawai4 = new Staff("Asep", 20);
        Pegawai pegawai5 = new Staff("Tini", 20);

        list.add(pegawai1);
        list.add(pegawai2);
        list.add(pegawai3);
        list.add(pegawai4);
        list.add(pegawai5);

        for (Pegawai pegawai : list) {
            System.out.println("Nama : " + pegawai.getNama());
            System.out.println("Gaji : " + pegawai.hitungGaji());
            System.out.println();
        }
    }
}