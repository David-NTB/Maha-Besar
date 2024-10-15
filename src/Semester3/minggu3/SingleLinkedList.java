package Semester3.minggu4;

import java.io.*;

class Node {
    Barang data;
    Node next;

    Node(Barang b) {
        data = b;
        next = null;
    }
}

class Barang {
    private int id;
    private String nama;
    private int stok;

    public Barang(int id, String nama, int stok) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public String info() {
        return id + " " + nama + " " + stok;
    }
}

public class SingleLinkedList {
    Node head; // head of list
    /* Insert last tidak terurut */

    public int insert(Barang data) {
        Node nn = new Node(data);
        Node current = head;
        if (current == null) {
            nn.next = null;
            head = nn;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = nn;
        }
        System.out.println("Node baru " + data.getId() + " ditambahkan");
        return 0;
    }

    /* Insert sorted */
    public void insertSorted(Barang data) {
        Node nn = new Node(data); // node baru
        Node current = head;
        // Jika list kosong atau data lebih kecil dari head
        if (head == null || head.data.getId() >= nn.data.getId()) {
            nn.next = head;
            head = nn;
        } else {
            // Cari posisi yang tepat untuk menyisipkan node
            while (current.next != null && (current.next.data.getId() < nn.data.getId())) {
                current = current.next;
            }
            nn.next = current.next;
            current.next = nn;
        }
        System.out.println("Node baru " + data.getId() + " ditambahkan");
    } // eoinsertSorted

    /* Delete */
    public int delete(Barang data) {
        // Jika list kosong
        if (head == null) {
            System.out.println("List kosong");
            return 0;
        } else {
            // Cek apakah data yang dicar ada di head
            if (head.data == data) {
                head = head.next;
                System.out.println("Node " + data.getId() + " telah dihapus");
                return 0;
            } else {
                // jika data yang dicari bukan di head
                Node current = head;
                Node prec = head;
                boolean found = false;
                while (current != null) {
                    if (current.data == data) {
                        prec.next = current.next;
                        current.next = null;
                        System.out.println("Node " + data.getId() + " telah dihapus");
                        return 0;
                    }
                    prec = current;
                    current = current.next;
                }
            }
        }
        System.out.println("Node " + data.getId() + " tidak ditemukan");
        return 0;
    } // eodelete

    public void printList() {
        Node current = head;
        System.out.print("Single LinkedList: ");
        while (current != null) {
            System.out.print(current.data.getId() + " ");
            current = current.next;
        }
        System.out.println("\n");
    } // eoprintlist

    public int search(Barang data) {
        // Jika list kosong
        if (head == null) {
            System.out.println("List kosong");
            return 0;
        } else {
            // Cek apakah data yang dicar ada di head
            if (head.data == data) {
                System.out.println("Data " + data.getId() + " ditemukan pada urutan ke-1");
                return 0;
            } else {
                // jika data yang dicari bukan di head
                Node current = head;
                Node prec = head;
                boolean found = false;
                int n = 1;
                while (current != null) {
                    if (current.data == data) {
                        System.out.println("Data " + data.getId() + " ditemukan pada urutan ke-" + n);
                        return 0;
                    }
                    prec = current;
                    current = current.next;
                    n++;
                }
            }
        }
        System.out.println("Data " + data + " tidak ditemukan");
        return 0;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.runThis();
    }

    void runThis(){
        // runInsert();
        runInsertSorted();
        
        
        // printList();
        // delete(4);
        // delete(1);
        // delete(10);
        // delete(99);
        }

        void runInsert(){
            insert(new Barang(5, "So So", 55));
            insert(new Barang(2, "Clean", 22));
            insert(new Barang(1, "So", 11));
            insert(new Barang(8, "So So Clean", 88));
            insert(new Barang(3, "So Clean", 33));
            insert(new Barang(6, "Clean Clean", 66));
            insert(new Barang(7, "So Clean So Clean", 77));
            insert(new Barang(10, "Clean So So", 100));
            insert(new Barang(9, "So Clean Clean", 99));
            insert(new Barang(4, "Clean So", 44));

            printList();
        }

        void runInsertSorted(){
            insertSorted(new Barang(5, "So So", 17));
            insertSorted(new Barang(2, "Clean", 65));
            insertSorted(new Barang(1, "So", 15));
            insertSorted(new Barang(8, "So So Clean", 32));
            insertSorted(new Barang(3, "So Clean", 41));
            insertSorted(new Barang(6, "Clean Clean", 100));
            insertSorted(new Barang(7, "So Clean So Clean", 100));
            insertSorted(new Barang(10, "Clean So So", 30));
            insertSorted(new Barang(9, "So Clean Clean", 20));
            insertSorted(new Barang(4, "Clean So", 10));

            printList();
        }
}
