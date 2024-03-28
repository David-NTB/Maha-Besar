package semester2.PBO.TUMBAS;

import java.util.ArrayList;

public class Menu {
    private DataManager database = new DataManager();
    private ArrayList<Kelompok> listKelompok = new ArrayList<>();

    Menu() {
        listKelompok = database.loadData();
    }

    public void header() {
        Util.cls();
        System.out.println("================================================");
        System.out.println("Telkom University Mencari Bakat Spesial (TUMBAS)");
        System.out.println("================================================");
    }

    // MAIN_MENU
    public void mainMenu() {
        boolean loop = true;
        while (loop) {
            header();
            System.out.println("1. Menu Kelompok");
            System.out.println("2. Menu Lomba");
            System.out.println("3. Tampilkan Semua Data");
            System.out.println("0. Keluar");

            System.out.print("\nPilihan : ");
            int key = Util.inputInt();

            switch (key) {
                case 1:
                    menuKelompok();
                    break;

                case 2:
                    menuLomba();
                    break;

                case 3:
                    showAllNilai();
                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.err.println("\nPilihan tidak ada");
                    Util.pressEnter();
                    break;
            }
        }
    }

    public void showAllNilai() {
        header();
        for (Kelompok kelompok : listKelompok) {
            System.out.println(kelompok);
        }
        Util.pressEnter();
    }
    
    // MENU_KELOMPOK
    public void menuKelompok() {
        boolean loop = true;
        while (loop) {
            header();
            System.out.println("1. Cari Kelompok");
            System.out.println("2. Tambah Kelompok");
            System.out.println("3. Hapus Kelompok");
            System.out.println("0. Kembali");

            System.out.print("\nPilihan : ");
            int key = Util.inputInt();

            switch (key) {
                case 1:
                    cariKelompok();
                    break;

                case 2:
                    tambahKelompok();
                    break;

                case 3:
                    hapusKelompok();
                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.err.println("\nPilihan tidak ada");
                    Util.pressEnter();
                    break;
            }
        }
    }

    public void cariKelompok() {
        header();
        database.searchKelompok(listKelompok);
        Util.pressEnter();
    }
    
    public void tambahKelompok() {
        header();
        database.addData(listKelompok);
        Util.pressEnter();
    }
    
    public void hapusKelompok() {
        header();
        database.deleteData(listKelompok);
        Util.pressEnter();
    }

    // MENU_LOMBA
    public void menuLomba() {
        boolean loop = true;
        while (loop) {
            header();
            System.out.println("1. UI/UX");
            System.out.println("2. Algoritma");
            System.out.println("3. Data Processing");
            System.out.println("0. Kembali");

            System.out.print("\nPilihan : ");
            int key = Util.inputInt();

            switch (key) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.err.println("\nPilihan tidak ada");
                    Util.pressEnter();
                    break;
            }
        }
    }

    public void subMenuLomba() {
        boolean loop = true;
        while (loop) {
            header();
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampulkan Nilai");
            System.out.println("0. Kembali");

            System.out.print("\nPilihan : ");
            int key = Util.inputInt();

            switch (key) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.err.println("\nPilihan tidak ada");
                    Util.pressEnter();
                    break;
            }
        }
    }

    public void inputNilai() {

    }

    public void showNilai() {

    }
}
