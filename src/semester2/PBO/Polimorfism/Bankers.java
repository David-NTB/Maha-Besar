package semester2.PBO.Polimorfism;

class Rekening {
    protected String noRekening;
    protected double saldo;

    public Rekening (String noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void informasiRekening() {
        System.out.println("Np Rekening     : " + getNoRekening());
        System.out.println("Saldo           : " + getSaldo());
    }
}

class Perorangan extends Rekening {
    protected String namaPemilik;
    protected String noIdentitas;
    
    public Perorangan (String noRekening, double saldo, String namaPemilik, String noIdentitas) {
        super(noIdentitas, saldo);
        this.namaPemilik = namaPemilik;
        this.noIdentitas = noIdentitas;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    @Override
    public void informasiRekening() {
        System.out.println("Jenis rekening : Perorangan");
        super.informasiRekening();
        System.out.println("Nama Pemilik    : " + getNamaPemilik());
        System.out.println("No Identitas    : " + getNoIdentitas());
    }
}

class Korporat extends Rekening {
    protected String namaPemilik;
    protected String namaPerusahaan;
    protected String noIdentitas;
    protected String noIzin;
    
    public Korporat (String noRekening, double saldo, String namaPemilik, String namaPerusahaan, String noIdentitas, String noIzin) {
        super(noIdentitas, saldo);
        this.namaPemilik = namaPemilik;
        this.namaPerusahaan = namaPerusahaan;
        this.noIdentitas = noIdentitas;
        this.noIzin = noIzin;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public String getNoIzin() {
        return noIzin;
    }

    @Override
    public void informasiRekening() {
        System.out.println("Jenis rekening : Perorangan");
        super.informasiRekening();
        System.out.println("Nama Pemilik    : " + getNamaPemilik());
        System.out.println("Nama Perusahaan : " + getNamaPemilik());
        System.out.println("No Identitas    : " + getNoIdentitas());
        System.out.println("No Ijin Usaha   : " + getNoIdentitas());
    }
}

class Bankers {
    public static void main(String[] args) {
        Rekening bk = new Perorangan(null, 0, null, null);
    }
}