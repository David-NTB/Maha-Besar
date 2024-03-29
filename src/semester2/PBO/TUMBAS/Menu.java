package semester2.PBO.TUMBAS;

public class Menu {
    private DataManager database = new DataManager();

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
        for (Kelompok kelompok : database.loadData()) {
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
        database.searchKelompok();
        Util.pressEnter();
    }

    public void tambahKelompok() {
        header();
        database.addData();
        Util.pressEnter();
    }

    public void hapusKelompok() {
        header();
        database.deleteData();
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
                    subMenuLomba(new UIUX(0, 0, 0, 0));
                    break;

                case 2:
                    subMenuLomba(new Algo(0, 0, 0));
                    break;

                case 3:
                    subMenuLomba(new Data(0, 0, 0));
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

    public void subMenuLomba(Lomba lomba) {
        boolean loop = true;
        while (loop) {
            header();
            System.out.println("1. Daftar Lomba");
            System.out.println("2. Input Nilai");
            System.out.println("3. Tampilkan Nilai");
            System.out.println("0. Kembali");

            System.out.print("\nPilihan : ");
            int key = Util.inputInt();

            switch (key) {
                case 1:
                    daftarLomba(lomba);
                    break;

                case 2:
                    inputNilai(lomba);
                    break;

                case 3:
                    showNilai(lomba);
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

    public void daftarLomba(Lomba lomba) {
        header();
        database.setLomba(lomba);
        Util.pressEnter();
    }

    public void inputNilai(Lomba lomba) {
        header();
        database.addNilai(lomba);
        Util.pressEnter();
    }

    public void showNilai(Lomba lomba) {
        header();
        for (Kelompok kelompok : database.getListLomba(lomba)) {
            System.out.println(kelompok);
        }
        Util.pressEnter();
    }
}
