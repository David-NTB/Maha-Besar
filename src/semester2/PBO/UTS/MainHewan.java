package semester2.PBO.UTS;

abstract class HewanPeliharaan {
    public String gerak;
    public String suara;

    public void setGerak(String gerak) {
        this.gerak = gerak;
    }

    public void setSuara(String suara) {
        this.suara = suara;
    }

    public void info() {
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Gerak\t\t: " + this.gerak);
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
        System.out.println("Jenis\t\t: " + this.jenis);
        super.info();
        System.out.println("Berbisa\t\t: " + this.berbisa);
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

        } else {
            System.out.println("Error, (1 = ya, 2 = tidak)");
        }
    }

    @Override
    public void info() {
        System.out.println("Jenis\t\t: " + this.jenis);
        super.info();
        System.out.println("Jenis Produk\t: " + this.jenisProduk);
    }
    
}

class BurungBeo extends HewanPeliharaan {
    String kata;

    public void bersuaraMeniruSuara(String kata) {
        this.kata = kata;
    }

    @Override
    public void info() {
        System.out.println("Jenis\t\t: Burung Beo");
        super.info();
        if(this.kata != null) {
            System.out.println("Menirukan Suara\t: \"" + this.kata + "\"");
        }
    }
    
}

public class MainHewan {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("            ULAR");
        System.out.println("==============================");
        
        Ular ular1 = new Ular();
        ular1.setSuara("Mendesis");
        ular1.setGerak("Merayap");
        ular1.setBerbisa(1);
        ular1.info();
        System.out.println();
        
        Ular ular2 = new Ular();
        ular2.setSuara("Mendesis");
        ular2.setGerak("Merayap");
        ular2.setBerbisa(2);
        ular2.info();
        System.out.println();

        System.out.println("==============================");
        System.out.println("            SAPI");
        System.out.println("==============================");
        
        Sapi sapi1 = new Sapi();
        sapi1.setSuara("Mooo");
        sapi1.setGerak("Berjalan");
        sapi1.setJenisProduk("Daging");
        sapi1.info();
        System.out.println();
        
        Sapi sapi2 = new Sapi();
        sapi2.setSuara("Mooo");
        sapi2.setGerak("Berjalan");
        sapi2.setJenisProduk("Susu");
        sapi2.info();
        System.out.println();

        System.out.println("==============================");
        System.out.println("          BURUNG BEO");
        System.out.println("==============================");
        
        BurungBeo beo1 = new BurungBeo();
        beo1.setSuara("Berkicau");
        beo1.setGerak("Terbang");
        beo1.info();
        System.out.println();
        
        BurungBeo beo2 = new BurungBeo();
        beo2.setSuara("Berkicau");
        beo2.setGerak("Terbang");
        beo2.bersuaraMeniruSuara("Ayo Belajar PBO");
        beo2.info();
        System.out.println();

        System.out.println("==============================");
    }
    
}



/*
Output:

            Ular
Jenis 	    	: Kobra
Suara 	    	: Mendesis
Gerak		    : Merayap
Berbisa 	    : ya

Jenis 	    	: Boa
Suara 	    	: Mendesis
Gerak	    	: Merayap
Berbisa 	    : tidak

            Sapi
Jenis 	    	: Brangus
Suara 	    	: Mooo
Gerak	    	: Berjalan
Jenis Produk 	: Daging

Jenis 		    : Friesian
Suara 		    : Mooo
Gerak		    : Berjalan
Jenis Produk 	: Susu

          Burung Beo
Jenis 	    	: Burung Beo
Suara 	    	: Berkicau
Gerak	    	: Terbang

Jenis 		    : Burung Beo
Suara 		    : Berkicau
Gerak		    : Terbang
Menirukan Suara : “Ayo Belajar PBO”
*/