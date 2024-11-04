package semester3.minggu6;

import java.io.*;
import java.util.Scanner;

class Node1 {
    Barang data;
    Node1 next;
    Node1 prev;

    Node1(Barang d) {
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

public class BarangStackList {
    Node1 top; // top of stack
    Scanner inp = new Scanner(System.in);

    public void push(Barang data) {
        Node1 newNode = new Node1(data);

        if (top == null) {
            // Kasus 1. Jika stack empty
            // maka top diisi dengan node baru
            top = newNode;
        } else {
            // Kasus 2. jika stack ada node
            // New node diletakkan paling, dan top lama menjadi next
            newNode.next = top;
            top = newNode;
        }
        System.out.println("PUSH " + data.getId());
    }

    public void pop() {
        Node1 node = null;
        // Kasus 1. Jika stack empty
        if (top == null) {
            // Jika stack kosong, berikan informasi stack kosong
            System.out.println("Stack kosong");
            ;
            return;
        } else {
            // Jika stack ada, node baru akan diisi dengan top
            // next dari top akan menjadi top baru
            // untuk membersihkan node baru, set next dengan null
            node = top;
            top = top.next;
            node.next = null;
        }
        System.out.println("POP " + node.data.getId());
    }

    public void delete(int data) {
        if (top == null) {
            // jika stack, tampilkan informasi stack kosong
            System.out.println("Stack kosong");
            ;
            return;
        }
        // Case 1: Delete the top node
        if (data == top.data.getId()) {
            // jika data yang dicari sama dengan data top
            if (top.next == null) {
                // jika node selanjutnya dari top adalah null
                top = null;
            } else {
                top = top.next;
            }
            System.out.println("DELETE : " + data);
            return;
        }
        Node1 current = top; // data iterasi yang akan dihapus
        Node1 prev = top; // node sebelumnya
        // Traverse untuk menemukan node
        while (current != null && current.data.getId() != data) {
            prev = current;
            current = current.next;
        }
        // jika node tidak ditemukan, posisi berada paling akhir
        if (current == null) {
            System.out.println("DELETE : " + data + " NOT FOUND");
            return;
        }
        // jika node ditemukan di pertengahan atau akhir
        if (current.next != null) {
            // jika node bukan bagian paling akhir
            // gunakan prev untuk menghubungkan node prev dan next node
            prev.next = current.next;
        } else {
            // Jika node paling akhir, set next dari prev dengan null
            top = null;
        }
        System.out.println("DELETE : " + data);
        current = null;
    }

    public void print() {
        if (top == null) {
            // jika stack kosong, tampilkan stack kosong
            System.out.println("Stack kosong");
            ;
            return;
        } else {
            Node1 current = top;
            System.out.print("Stack : ");
            // Ulang hingga node berada paling akhir
            while (current != null) {
                System.out.print("\n" + current.data.info());
                current = current.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        BarangStackList stl = new BarangStackList();
        stl.tryThis();
    }

    void tryThis() {
        push(new Barang(3, null, 0));
        push(new Barang(1, null, 0));
        push(new Barang(4, null, 0));
        push(new Barang(6, null, 0));

        System.out.println();

        print();

        System.out.println();

        push(new Barang(2, null, 0));
        push(new Barang(5, null, 0));

        System.out.println();

        print();

        System.out.println();

        delete(5);

        System.out.println();

        print();

        System.out.println();
    }
}