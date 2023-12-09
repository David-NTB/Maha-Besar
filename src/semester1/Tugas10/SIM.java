package semester1.Tugas10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SIM {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<DataSIM> data = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        SIM run = new SIM();
        run.menu();
    }

    private void menu() throws IOException {
        String ch;
        do {
            System.out.println("==============================");
            System.out.println("PENGOLAHAN DATA SIM");
            System.out.println("==============================");
            System.out.println("1. Buat SIM baru");
            System.out.println("2. Info SIM");
            System.out.println("3. Tampilkan semua SIM");
            System.out.println("0. Keluar");
            System.out.println("==============================");

            System.out.print("Pilihan : ");
            ch = input.readLine();
            cls();

            switch (ch) {
                case "1":
                    newSim();
                    cls();
                    break;

                case "2":
                    searchSim();
                    cls();
                    break;

                case "3":
                    showAll();
                    cls();
                    break;

                case "0":
                    System.out.println("Menutup aplikasi . . .");
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }
        } while (!ch.equals("0"));
    }

    private void newSim() throws IOException {
        System.out.println("==============================");
        System.out.println("PROSES INPUT DATA");
        System.out.println("==============================");

        System.out.println("Input Data Diri");
        System.out.print("Nama lengkap\t: ");
        String nama = input.readLine();
        System.out.print("Tempat lahir\t: ");
        String temL = input.readLine();
        System.out.print("Tanggal lahir\t: ");
        String tangL = input.readLine();
        System.out.print("Jenis kelamin\t: ");
        String jk = input.readLine();
        System.out.print("Golongan Darah\t: ");
        String gd = input.readLine();
        System.out.print("Alamat\t\t: ");
        String alamat = input.readLine();

        System.out.println("\nInput Data SIM");
        System.out.print("Jenis SIM\t   : ");
        char jsim = input.readLine().charAt(0);
        System.out.print("Kota terbit\t   : ");
        String koter = input.readLine();
        System.out.print("Tanggal kadaluarsa : ");
        String kdl = input.readLine();

        int no = 1;
            if (!data.isEmpty()) {
                no = data.get(data.size() - 1).getNo() + 1;
            }

        DataSIM newData = new DataSIM(jsim, jk, nama, temL, tangL, gd, alamat, kdl, koter, no);
        data.add(newData);
        System.out.println("\nData telah ditambahkan");
    }

    private void searchSim() throws IOException {
        if (data.isEmpty()) {
            System.out.println("Data masih kosong");
            System.out.println("Silahkan input data terlebih dahulu");
        } else {
            System.out.println("==============================");
            System.out.println("PENCARIAN DATA PEMILIK SIM");
            System.out.println("==============================");
            System.out.println("1. Cari Nama");
            System.out.println("2. Cari Nomor");
            System.out.println("==============================");
            System.out.print("Pilihan : ");
            String ch = input.readLine();

            if(ch.equals("1")){
                System.out.print("Masukkan nama : ");
                String nama = input.readLine();

                for(int i = 0; i < data.size(); i++){
                    if(data.get(i).getNama().equals(nama)){
                        showSim(i);
                        break;
                    } else if (i == data.size()-1) {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                // System.out.println(data.indexOf(nama));
                // showSim(data.indexOf(nama)+2);
                
            } else if (ch.equals("2")) {
                System.out.print("Masukkan nomor : ");
                String temp = input.readLine();
                int no = Integer.parseInt(temp);

                if(no>data.size() || no<=0){
                    System.out.println("Data tidak ditemukan");
                } else{
                    showSim(no-1);
                }
            } else{
                System.out.println("Pilihan tidak ditemukan");
            }

        }
    }
    
    private void showSim(int index){
        System.out.println("==============================");
        System.out.println("INFORMASI PEMILIK SIM");
        System.out.println("==============================");
        System.out.println("Nama lengkap\t: " + data.get(index).getNama());
        System.out.println("Tempat lahir\t: " + data.get(index).getTemL());
        System.out.println("Tanggal lahir\t: " + data.get(index).getTangL());
        System.out.println("Jenis kelamin\t: " + data.get(index).getJk());
        System.out.println("Golongan Darah\t: " + data.get(index).getGd());
        System.out.println("Alamat\t\t: " + data.get(index).getAlamat());
        System.out.println("Nomor SIM\t: " + data.get(index).getNo());
        System.out.println("Jenis SIM\t: " + data.get(index).getJsim());
        System.out.println("Kota terbit\t: " + data.get(index).getKoter());
        System.out.println("Kadaluarsa\t: " + data.get(index).getKdl());
    }

    private void showAll(){
        System.out.println("==============================");
        System.out.println("MENAMPILKAN SEMUA DATA");
        System.out.println("==============================");
        
        for(int i = 0; i < data.size(); i++){
            System.out.println((i+1) + ". Nama pemilik\t: " + data.get(i).getNama());
            System.out.println("   Jenis SIM\t: " + data.get(i).getJsim());
            System.out.println("==============================");
        }
    }

    private void cls() {
        try {
            System.out.println("==============================");
            System.out.print("\nTekan ENTER untuk lanjut");
            input.readLine();

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.err.println("Error messages : " + e);
        }
    }
}

class DataSIM {
    char jsim;
    String nama, temL, tangL, jk, gd, alamat, kdl, koter;
    int no;

    public DataSIM(char jsim, String jk, String nama, String temL, String tangL,
            String gd, String alamat, String kdl, String koter, int no) {
        this.jsim = jsim;
        this.jk = jk;
        this.nama = nama;
        this.temL = temL;
        this.tangL = tangL;
        this.gd = gd;
        this.alamat = alamat;
        this.kdl = kdl;
        this.koter = koter;
        this.no = no;
    }

    public int getNo(){
        return no;
    }

    public void setNo(int no){
        this.no = no;
    }

    public char getJsim() {
        return jsim;
    }

    public void setJsim(char jsim) {
        this.jsim = jsim;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTemL() {
        return temL;
    }

    public void setTemL(String temL) {
        this.temL = temL;
    }

    public String getTangL() {
        return tangL;
    }

    public void setTangL(String tangL) {
        this.tangL = tangL;
    }

    public String getGd() {
        return gd;
    }

    public void setGd(String gd) {
        this.gd = gd;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKdl() {
        return kdl;
    }

    public void setKdl(String kdl) {
        this.kdl = kdl;
    }

    public String getKoter() {
        return koter;
    }

    public void setKoter(String koter) {
        this.koter = koter;
    }

}