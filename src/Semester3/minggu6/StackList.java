package semester3.minggu6;

import java.io.*;
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String d) {
        data = d;
        next = null;
    }
} 

public class StackList {
    Node top; // top of stack
    Scanner inp = new Scanner(System.in);

    public void push(String data) {
        Node newNode = new Node(data);

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
        System.out.println("PUSH " + data);
    }

    public void pop() {
        Node node = null;
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
        System.out.println("POP " + node.data);
    }

    public void delete(String data) {
        if (top == null) {
            // jika stack, tampilkan informasi stack kosong
            System.out.println("Stack kosong");
            ;
            return;
        }
        // Case 1: Delete the top node
        if (data == top.data) {
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
        Node current = top; // data iterasi yang akan dihapus
        Node prev = top; // node sebelumnya
        // Traverse untuk menemukan node
        while (current != null && current.data != data) {
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
            Node current = top;
            System.out.print("Stack : ");
            // Ulang hingga node berada paling akhir
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.runThis();
    }

    void runThis() {
        push("hari");
        push("ini");
        push("kita");
        push("mempelajari");
        push("materi");
        push("struktur");
        push("data");
        push("tentang");
        push("stack");
        print();
        pop();
        print();
        pop();
        print();
        delete("struktur");
        print();
        delete("kita");
        print();
        delete("stack");
        print();
    }
}