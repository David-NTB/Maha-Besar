package semester2.PBO.Polimorfism;

import java.util.Scanner;

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

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
    
    public void updateBarang(String kodeBarang, int harga) {
        if (noItem != 0) {
            for (int a = 0; a < noItem; a++) {
                if (kodeBarang.equals(arrBarang[a].getKodeBarang())){
                    arrBarang[a].setHarga(harga);
                    System.out.println(kodeBarang + " Diperbarui");
                    break;
                } else if (a == noItem-1) {
                    System.out.println(kodeBarang + " NOT FOUND");
                }
            }
        } else {
            System.out.println("Belum ada barang dalam list data");
        }
        System.out.println();
    }
    
    public void updateBarang(String kodeBarang, int harga, int jumlah) {
        if (noItem != 0) {
            for (int a = 0; a < noItem; a++) {
                if (kodeBarang.equals(arrBarang[a].getKodeBarang())){
                    arrBarang[a].setHarga(harga);
                    arrBarang[a].setJumlah(jumlah);
                    System.out.println(kodeBarang + " Diperbarui");
                    break;
                } else if (a == noItem-1) {
                    System.out.println(kodeBarang + " NOT FOUND");
                }
            }
        } else {
            System.out.println("Belum ada barang dalam list data");
        }
        System.out.println();
    }

    public void jualBarang(String kodeBarang, int jumlah) {
        if (noItem != 0) {
            for (int a = 0; a < noItem; a++) {
                if (kodeBarang.equals(arrBarang[a].getKodeBarang())){
                    if (arrBarang[a].getJumlah() != 0) {
                        int stok = arrBarang[a].getJumlah() - jumlah;
                        totalHarga = arrBarang[a].getHarga() * jumlah;
                        if (stok >= 0) {
                            arrBarang[a].setJumlah(stok);
                            System.out.println("Barang terjual, harga : " + totalHarga);
                        } else {
                            System.out.println("Stok tidak mencukupi, pembelian dibatalkan");
                        }
                    } else {
                        System.out.println("Stok barang habis, pembelian dibatalkan");
                    }
                    break;
                } else if (a == noItem-1) {
                    System.out.println(kodeBarang + " NOT FOUND");
                }
            }
        } else {
            System.out.println("Belum ada barang dalam list data");
        }
        System.out.println();
    }

    public void jualBarang(String kodeBarang, int jumlah, int diskon) {
        if (noItem != 0) {
            for (int a = 0; a < noItem; a++) {
                if (kodeBarang.equals(arrBarang[a].getKodeBarang())){
                    if (arrBarang[a].getJumlah() != 0) {
                        int stok = arrBarang[a].getJumlah() - jumlah;
                        totalHarga = arrBarang[a].getHarga() * jumlah * diskon / 100;
                        if (stok >= 0) {
                            arrBarang[a].setJumlah(stok);
                            System.out.println("Barang terjual, harga : " + totalHarga);
                        } else {
                            System.out.println("Stok tidak mencukupi, pembelian dibatalkan");
                        }
                    } else {
                        System.out.println("Stok barang habis, pembelian dibatalkan");
                    }
                    break;
                } else if (a == noItem-1) {
                    System.out.println(kodeBarang + " NOT FOUND");
                }
            }
        } else {
            System.out.println("Belum ada barang dalam list data");
        }
        System.out.println();
    }

    public void infoStockAllBarang() {
        System.out.println("===== DAFTAR BARANG =====");
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
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeBarang;
        int jumlah, diskon;
        Superstore st = new Superstore();

        System.out.println("===== MENAMBAH BARANG =====");
        st.tambahBarang("AO1000", "Susu Bendera", 50000);
        st.tambahBarang("BO1000", "Kertas HVS", 28000, 3);
        st.tambahBarang("CO1000", "Kacang Kedelai", 4700, 5);
        st.infoStockAllBarang();
        
        System.out.println("===== UPDATE BARANG =====");
        st.updateBarang("AO1000", 0);
        st.updateBarang("BO1000", 0, 0);
        st.infoStockAllBarang();
        
        System.out.println("===== PENJUALAN BARANG =====");
        System.out.print("Masukkan kode barang : ");
        kodeBarang = input.nextLine();
        System.out.print("Masukkan jumlah barang yg dijual : ");
        jumlah = input.nextInt();
        st.jualBarang(kodeBarang, jumlah);
        input.nextLine();
        
        System.out.print("Masukkan kode barang : ");
        kodeBarang = input.nextLine();
        System.out.print("Masukkan jumlah barang yg dijual : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan diskon(%) : ");
        diskon = input.nextInt();
        st.jualBarang(kodeBarang, jumlah, diskon);
        st.infoStockAllBarang();
    }
}
