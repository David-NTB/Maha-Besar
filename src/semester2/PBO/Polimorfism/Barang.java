package semester2.PBO.Polimorfism;

class Barang {
    private String kodeBarang;
    private String namaBarang;
    private int harga = 0;
    private int jumlah = 0;

    Barang(String kodeBarang, String namaBarang, int harga, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    Barang(String kodeBarang, String namaBarang, int harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getKodeBarang() {
        return this.kodeBarang;
    }

    public String getNamaBarang() {
        return this.namaBarang;
    }

    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void infoBarang() {
        System.out.println("Kode 	: " + kodeBarang);
        System.out.println("Nama 	: " + namaBarang);
        System.out.println("Harga 	: " + harga);
        System.out.println("Jumlah  : " + jumlah);
    }
}

class Superstore {
    private Barang[] arrBarang = new Barang[1000];
    private int totalHarga;
    private int noItem = 0;

    public void tambahBarang(String kodeBarang, String namaBarang, int harga) {
        System.out.println("Menambahkan Daftar Barang Baru");
        arrBarang[(noItem)] = new Barang(kodeBarang, namaBarang, harga);
        arrBarang[noItem].infoBarang();
        System.out.println("Jumlah barang 0, lakukan penambahan stock sebelum melakukan penjualan");
        noItem++;
        System.out.println();
    }

    public void tambahBarang(String kodeBarang, String namaBarang, int harga, int jumlah) {
        System.out.println("Menambahkan Daftar Barang Baru");
        arrBarang[(noItem)] = new Barang(kodeBarang, namaBarang, harga, jumlah);
        arrBarang[noItem].infoBarang();
        noItem++;
        System.out.println();
    }
    
    public void updateBarang(int harga) {
        
    }
    
    public void updateBarang(int harga, int jumlah) {

    }

    public void jualBarang(int jumlah) {
        
    }

    public void jualBarang(int jumlah, int diskon) {
        
    }

    public void infoStockAllBarang() {
        System.out.println("Daftar Barang");
        if (noItem != 0) {
            for (int a = 0; a < noItem; a++) {
                System.out.println("\tKode Barang : " + arrBarang[a].getKodeBarang());
                System.out.println("\tNama Barang : " + arrBarang[a].getNamaBarang());
                System.out.println("\tHarga       : " + arrBarang[a].getHarga());
                System.out.println("\tJumlah      : " + arrBarang[a].getJumlah());
                System.out.println();
            }
        } else {
            System.out.println("Belum ada barang dalam list data");
        }
    }
} // end of class Superstore

class DriverSuperStore {
    public static void main(String[] args) {
        Superstore st = new Superstore();

        System.out.println("Menambah Barang");
        st.tambahBarang("AO1000", "Susu Bendera", 50000);
        st.tambahBarang("BO1000", "Kertas HVS", 28000, 3);
        st.tambahBarang("CO1000", "Kacang Kedelai", 4700, 5);
        st.infoStockAllBarang();
        
        System.out.println("Update Barang");
        st.updateBarang(0);
        st.updateBarang(0, 0);
        st.infoStockAllBarang();

        System.out.println("Penjualan Barang");
        st.jualBarang(0);
        st.jualBarang(0, 0);
    }
}
