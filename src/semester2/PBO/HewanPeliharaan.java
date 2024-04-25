package semester2.PBO;

public abstract class HewanPeliharaan {
    public String gerak;
    public String suara;

    public void setGerak(String gerak) {
        this.gerak = gerak;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void info() {
        System.out.println("Suara\t: " + this.suara);
        System.out.println("Gerak\t: " + this.gerak);
    }
}

class Ular extends HewanPeliharaan {
    String jenis;
    String berbisa;

    public void setBerbisa(int berbisa) {
        if (berbisa == 1){
            this.berbisa = "Ya";
            this.jenis = "Kobra";
            
        } else if (berbisa == 2) {
            this.berbisa = "Tidak";
            this.jenis = "Boa";
        }
    }

    @Override
    public void info() {
        System.out.println("Jenis\t: " + this.jenis);
        super.info();
        System.out.println("Berbisa\t: " + this.berbisa);
    }
    
}

class Sapi extends HewanPeliharaan {
    String jenis;
    String jenisProduk;

    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk = jenisProduk;
        if (jenisProduk.equalsIgnoreCase("daging")) {
            this.jenis = "Brangus";

        } else if (jenisProduk.equalsIgnoreCase("susu")) {
            this.jenis = "Friesian";
        }
    }

    @Override
    public void info() {
        System.out.println("Jenis\t: " + this.jenis);
        super.info();
        System.out.println("Jenis Produk\t: " + this.jenisProduk);
    }
    
}

class BurungBeo extends HewanPeliharaan {
    String kata;

    public void bersuaraMeniruSuara(String kata) {

    }

    @Override
    public void info() {
        super.info();
        if(this.kata != null) {
            System.out.println("Menirukan Suara\t: \"" + this.kata + "\"");
        }
    }
    
}

class Main {


    
}