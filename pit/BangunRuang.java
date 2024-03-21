import java.util.ArrayList;

class SegiEmpat {
    protected double panjang, lebar;

    public SegiEmpat() {
        panjang = 0;
        lebar = 0;
    }

    public void setPanjang(double p) {
        panjang = p;
    }

    public void setLebar(double l) {
        lebar = l;
    }

    public double Luas() {
        return (panjang * lebar);
    }
}

class BujurSangkar extends SegiEmpat {
    protected double tinggi;

    public BujurSangkar() {
        super();
    }
}

class Balok extends SegiEmpat {
    protected double tinggi;

    public Balok() {
        super();
        tinggi = 0;
    }

    public void setTinggi(double t) {
        tinggi = t;
    }

    public double Volume() {
        return (panjang * lebar * tinggi);
    }
}

class Kubus extends SegiEmpat {
    protected double tinggi;

    public Kubus() {
        super();
        tinggi = 0;
    }

    public void setTinggi(double t) {
        tinggi = t;
    }

    public double Volume() {
        return (panjang * lebar * tinggi);
    }
}

// KELAS IMPLEMENTASI PROGRAM
class Driver {
    public static void main(String args[]) {
        ArrayList listBangun = new ArrayList<>();

        SegiEmpat segiEmpat = new SegiEmpat();
        segiEmpat.setPanjang(20);
        segiEmpat.setLebar(10);
        segiEmpat.Luas();
        listBangun.add(segiEmpat);

        BujurSangkar bujurSangkar = new BujurSangkar();
        bujurSangkar.setPanjang(20);
        bujurSangkar.setLebar(10);
        bujurSangkar.Luas();
        listBangun.add(bujurSangkar);

        Kubus kubus = new Kubus();
        kubus.setPanjang(20);
        kubus.setLebar(10);
        kubus.setTinggi(5);
        kubus.Volume();
        listBangun.add(kubus);

        Balok balok = new Balok();
        balok.setPanjang(21);
        balok.setLebar(4);
        balok.setLebar(5);
        balok.Volume();
        listBangun.add(balok);

        
        for(int i = 0; i < listBangun.size(); i++){
            System.out.println(listBangun.get(i).getClass());
        }
        
        /*
        SegiEmpat kotak = new SegiEmpat();
        Kubus kayu = new Kubus();
        kotak.setPanjang(21);
        kotak.setLebar(4);

        System.out.print("Luas = " + kotak.Luas());
        kayu.setPanjang(17);
        kayu.setLebar(8);
        kayu.setTinggi(45);
        System.out.println("\nVolume = " + kayu.Volume());
        */
    }
}