package semester2.PBO.GOJEK;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Member {
    private String id;
    private String nama;
    private String telepon;
    private double saldo;

    public Member(String id, String nama, String telepon, double saldo) {
        this.id = id;
        this.nama = nama;
        this.telepon = telepon;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public double getSaldo() {
        return saldo;
    }

    public void topUpSaldo(double amount) {
        saldo += amount;
    }

    @Override
    public String toString() {
        return "Member{id=" + id + ", nama=" + nama + ", saldo=" + saldo + ", telepon=" + telepon + '}';
    }
}

class Driver extends Member {
    private String platNo;
    private String jenisKendaraan;

    public Driver(String id, String nama, String telepon, String platNo, String jenisKendaraan, double saldo) {
        super(id, nama, telepon, saldo);
        this.platNo = platNo;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getPlatNo() {
        return platNo;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDriver{platNo=" + platNo + ", jenisKendaraan=" + jenisKendaraan + '}';
    }
}

class Customer extends Member {
    public Customer(String id, String nama, String telepon, String platNo, String jenisKendaraan, double saldo) {
        super(id, nama, telepon, saldo);
    }
}

public class Gojek {
    private List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        new Gojek().runThis();
    }

    void runThis() {
        addDriver("1", "Becky", "0811", "D 1 A", "Motor", 100000);
        addDriver("2", "Adrian", "0812", "B 15 A", "Motor", 50000);
        addDriver("3", "Begra", "0813", "J 45A LHO", "Motor", 0);
        System.out.println("==================================================");

        addCustomer("4", "Eva", "0814", 100000);
        addCustomer("5", "Celia", "0815", 0);
        addCustomer("6", "Latjuba", "0816", 200000);
        addCustomer("7", "Lesmana", "0817", 0);
        System.out.println("==================================================");

        topUpSaldo("1", 150000);
        topUpSaldo("3", 50000);
        topUpSaldo("4", 250000);
        topUpSaldo("5", 450000);
        topUpSaldo("6", 150000);
        topUpSaldo("9", 150000);
        System.out.println("==================================================");

        viewDriver("1");
        viewDriver("3");
        viewDriver("4");
        System.out.println("==================================================");

        viewCustomer("1");
        viewCustomer("4");
        viewCustomer("5");
        viewCustomer("8");
        System.out.println("==================================================");

        transaksi("1", "4", 50000);
        transaksi("3", "5", 50000);
        transaksi("4", "5", 50000);
        transaksi("1", "2", 50000);
        System.out.println("==================================================");

        System.out.println("\n5 Driver dengan Saldo Terbanyak:");
        showTopMembers("Driver", 5);
        System.out.println("==================================================");

        System.out.println("\n5 Customer dengan Saldo Terbanyak:");
        showTopMembers("Customer", 5);
        System.out.println("==================================================");

    }

    private void addDriver(String id, String nama, String telepon, String platNo, String jenisKendaraan, double saldo) {
        System.out.println();
        Driver driver = new Driver(id, nama, telepon, platNo, jenisKendaraan, saldo);
        members.add(driver);
        System.out.println("Penambahan Driver\n" + driver);
    }

    private void addCustomer(String id, String nama, String telepon, double saldo) {
        System.out.println();
        Member customer = new Member(id, nama, telepon, saldo);
        members.add(customer);
        System.out.println("Penambahan Customer\n" + customer);
    }

    private void topUpSaldo(String id, double amount) {
        System.out.println();
        Member member = findMemberById(id);
        if (member != null) {
            member.topUpSaldo(amount);
            System.out.println("Top Up Saldo\n" + member + "\n");
        } else {
            System.out.println("Top Up Saldo\nID: " + id + " tidak ditemukan");
        }
    }

    private void viewDriver(String id) {
        System.out.println();
        Member member = findMemberById(id);
        if (member instanceof Driver) {
            System.out.println("View Data Driver");
            System.out.println(member);
        } else if (member != null) {
            System.out.println("View Data Driver\nID: " + id + ". Bukan Driver");
        } else {
            System.out.println("View Data Driver\nID: " + id + " tidak ditemukan");
        }
    }

    private void viewCustomer(String id) {
        System.out.println();
        Member member = findMemberById(id);
        if (member instanceof Driver) {
            System.out.println("View Data Customer\nID: " + id + ". Bukan Customer");
        } else if (member != null) {
            System.out.println("View Data Customer");
            System.out.println(member);
        } else {
            System.out.println("View Data Customer\nID: " + id + " tidak ditemukan");
        }
    }

    private Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    private void transaksi(String driverId, String customerId, double amount) {
        System.out.println();
        Driver driver = (Driver) findMemberById(driverId);
        Member customer = findMemberById(customerId);
        if (driver != null && customer != null) {
            System.out.println("Transaksi");
            System.out.println("Driver: " + driver);
            System.out.println("Customer: " + customer);
            if (driver.getSaldo() >= amount) {
                driver.topUpSaldo(-amount);
                customer.topUpSaldo(amount);
                System.out.println("Transaksi berhasil");
            } else {
                System.out.println("Saldo driver tidak mencukupi untuk transaksi");
            }
        } else {
            System.out.println("Transaksi gagal, ID tidak valid");
        }
    }

    private void showTopMembers(String type, int limit) {
        System.out.println();
        members.sort(Comparator.comparingDouble(Member::getSaldo).reversed());
        int count = 0;
        for (Member member : members) {
            if (count >= limit)
                break;
            if ((type.equals("Driver") && member instanceof Driver) ||
                    (type.equals("Customer") && !(member instanceof Driver))) {
                System.out.println(member);
                count++;
            }
        }
    }
}
