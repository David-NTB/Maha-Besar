package semester2.PBO.Test;

public class DatabaseManager {

    public static void main(String[] args) {
        Kintil kintil = new Kintil();
        System.out.println("Nama : " + kintil.getClass().getSimpleName());
    }
}

class Kintil {
    String kintil = "Kintil";

    public String getKintil() {
        return kintil;
    }
}