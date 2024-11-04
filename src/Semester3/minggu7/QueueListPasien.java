package semester3.minggu7;

// import java.io.*;

class Node5 {
    Pasien data;
    Node5 next;

    Node5(Pasien d) {
        data = d;
        next = null;
    }
}

class Pasien {
    int noUrut;
    String nama;

    Pasien(int nu, String nama) {
        this.noUrut = nu;
        this.nama = nama;
    }

    String info() {
        return noUrut + " " + nama;
    }

    int getNoUrut() {
        return noUrut;
    }
}

public class QueueListPasien {
    Node5 head; // head of list
    Node5 tail; // tail of list
    /* Tambah antrian */

    public int enqueue(String nama) {
        Node5 nn;
        if (head == null) {
            nn = new Node5(new Pasien(1, nama));
            head = nn;
            tail = nn;
        } else {
            nn = new Node5(new Pasien(tail.data.getNoUrut() + 1, nama));
            tail.next = nn;
            tail = nn;
        }
        System.out.println("Pasien " + nn.data.info() + " ditambahkan");
        return 0;

        // Pastikan bahwa no urut pasien akan selalu terurut, sehingga
        // Jika Queue kosong, no urut dari 1
        // Jika Queue tidak kosong, no urut diambil dari no urut last node +1
    }

    /* Ambil Urutan */
    public int dequeue() {
        Node5 current = head;
        if (head == null) {
            System.out.println("\nList kosong");
            return 0;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            current = head;
            head = current.next;
            current.next = null;
        }
        System.out.println("\nData diambil " + current.data.info());
        return 0;

        // Pengambilan node urutan dari yang paling ujung
    }

    /* jika no antrian depan tidak ada, maka ambil antrian yang ada */
    public int ambilAntrianTengah(int noUrut) {
        // Jika list kosong
        Node5 current = null;
        Node5 prev = null;
        if (head == null) {
            System.out.println("\nRS sepi mas, ga ada pasien");
            // Jika List kosong
            return 0;
        } else if ((head.data.getNoUrut() == noUrut) && (head == tail)) {
            System.out.println("\n" + head.data.info() + " pasien terakhir");
            // jika hanya ada 1 node
            return 0;
        } else {
            current = head.next;
            prev = head;
            while (current != null) {
                if (current.data.getNoUrut() == noUrut) {
                    prev.next = current.next;
                    current.next = null;
                    System.out.println("\nData diambil " + current.data.info());
                    break;
                }
                current = current.next;
                prev = prev.next;
            }

            // Jika pasien yang datang sesuai no urut tidak ada, maka akan diambil nextnya
            // sampai ketemu
            // Lakukan pemanggilan pasien sesuai urutan hingga ketemu atau hingga akhir
            // Queue
            return 0;
        }
    }

    public void printList() {
        Node5 current = head;
        System.out.println("\nDaftar antrian : ");
        while (current != null) {
            System.out.println(current.data.info());
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueListPasien sll = new QueueListPasien();
        // sll.runThis();
        sll.runThat();
    }

    void runThis() {
        enqueue("Gandalf The Grey");
        enqueue("Aragorn");
        enqueue("Legolas");
        enqueue("Gimli");
        enqueue("Boromir");
        enqueue("Frodo Baggins");
        enqueue("Samwise Gamgee");
        enqueue("Meri");
        enqueue("Pippin");
        printList();
        ambilAntrianTengah(5);
        printList();
        dequeue();
        printList();
        enqueue("Gandalf The White");
        printList();
    }

    void runThat() {
        printList();

        dequeue();
        enqueue("a");
        printList();

        dequeue();
        printList();

        ambilAntrianTengah(1);
        enqueue("b");
        ambilAntrianTengah(1);
        printList();
    }
}