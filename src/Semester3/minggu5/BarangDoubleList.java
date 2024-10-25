package semester3.minggu5;

import java.io.*;
import java.util.Scanner;

class Node {
    Barang data;
    Node next;
    Node prev;

    Node(Barang d) {
        data = d;
        next = null;
        prev = null;
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
        return "ID: " + id + ", Nama: " + nama + ", Stok: " + stok;
    }
}

public class BarangDoubleList {
    Node head; // head of list
    Node tail; // tail of list
    Scanner inp = new Scanner(System.in);

    /* Insert last */
    public void insertEnd(Barang data) {
        Node nn = new Node(data);
        if (tail == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        System.out.println("Barang baru " + data.getId() + " diposisi belakang");
    }

    /* Insert First */
    public void insertFirst(Barang data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            head.prev = nn;
            nn.next = head;
            head = nn;
        }
        System.out.println("Barang baru " + data.getId() + " diposisi depan");
    }

    /* Insert sorted */
    public void insertSorted(Barang data) {
        Node newNode = new Node(data);
        // Kasus 1. Jika List empty
        if (head == null) {
            head = tail = newNode;
            System.out.println("Barang baru " + data.getId() + " paling depan");
            return;
        }
        // Kasus 2. Jika new node adalah angka paling kecil
        if (data.getId() <= head.data.getId()) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println("Barang baru " + data.getId() + " paling depan");
            return;
        }
        // Kasus 3: jika new node angka paling besar
        if (data.getId() >= tail.data.getId()) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            System.out.println("Barang baru " + data.getId() + " paling belakang");
            return;
        }
        // Kasus 4: diantara head dan tail
        Node current = head;
        while (current != null && current.data.getId() < data.getId()) {
            current = current.next;
        }
        // Insert the node before the current node
        newNode.next = current;
        newNode.prev = current.prev;
        if (current.prev != null) {
            current.prev.next = newNode;
        }
        current.prev = newNode;
        System.out.println("Barang baru " + data.getId() + " di tengah");
    }

    // Delete node dengan data tertentu
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        // Case 1: Delete the head node
        if (head.data.getId() == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // If the list becomes empty
            }
            return;
        }
        // Traverse to find the node to delete
        while (current != null && current.data.getId() != data) {
            current = current.next;
        }
        // Case 2: Node not found
        if (current == null) {
            System.out.println("Barang " + data + " tidak ditemukan.");
            return;
        }
        // Case 3: Delete a middle node
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev; // jika node yang dihapus adalah tail
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        System.out.println("Barang " + data + " telah dihapus.");
    }

    public void printListBackward() {
        Node current = head;
        System.out.print("Double LinkedList Backward: ");
        while (current != null) {
            System.out.print("\n" + current.data.info());
            current = current.next;
        }
        System.out.println("");
    }

    public void printListForward() {
        Node current = tail;
        System.out.print("Double LinkedList Forward: ");
        while (current != null) {
            System.out.print("\n" + current.data.info());
            current = current.prev;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        BarangDoubleList dll = new BarangDoubleList();
        dll.tryThis();
    }

    void tryThis() {
        insertFirst(new Barang(3, null, 0));
        insertFirst(new Barang(1, null, 0));

        System.out.println();

        insertEnd(new Barang(4, null, 0));
        insertEnd(new Barang(6, null, 0));

        System.out.println();

        printListForward();

        System.out.println();

        printListBackward();

        System.out.println();

        insertSorted(new Barang(2, null, 0));
        insertSorted(new Barang(5, null, 0));

        System.out.println();

        printListForward();

        System.out.println();

        printListBackward();

        System.out.println();

        delete(5);

        System.out.println();

        printListForward();

        System.out.println();

        printListBackward();

        System.out.println();
    }

    // void runThis() {
    // // INSERT BIASA
    // insertFirst(1);
    // insertEnd(5);
    // insertEnd(3);
    // insertFirst(2);
    // insertFirst(7);
    // insertEnd(6);
    // insertFirst(9);
    // insertEnd(8);
    // printListBackward();
    // printListForward();

    // //INSERT SORTEd
    // insertSorted(1);
    // insertSorted(5);
    // insertSorted(3);
    // insertSorted(2);
    // insertSorted(7);
    // insertSorted(6);
    // insertSorted(9);
    // insertSorted(8);
    // printListBackward();
    // printListForward();

    // delete(6);
    // printListForward();
    // delete(1);
    // printListForward();
    // delete(9);
    // }
}