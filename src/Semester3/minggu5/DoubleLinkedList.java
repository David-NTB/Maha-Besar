package semester3.minggu5;

import java.io.*;
import java.util.Scanner;

class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    Node1(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

public class DoubleLinkedList {
    Node1 head; // head of list
    Node1 tail; // tail of list
    Scanner inp = new Scanner(System.in);

    /* Insert last */
    public void insertEnd(int data) {
        Node1 nn = new Node1(data);
        if (tail == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
        System.out.println("Node baru " + data + " diposisi belakang");
    }

    /* Insert First */
    public void insertFirst(int data) {
        Node1 nn = new Node1(data);
        if (head == null) {
            head = tail = nn;
        } else {
            head.prev = nn;
            nn.next = head;
            head = nn;
        }
        System.out.println("Node baru " + data + " diposisi depan");
    }

    /* Insert sorted */
    public void insertSorted(int data) {
        Node1 newNode = new Node1(data);
        // Kasus 1. Jika List empty
        if (head == null) {
            head = tail = newNode;
            System.out.println("Node baru " + data + " paling depan");
            return;
        }
        // Kasus 2. Jika new node adalah angka paling kecil
        if (data <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            System.out.println("Node baru " + data + " paling depan");
            return;
        }
        // Kasus 3: jika new node angka paling besar
        if (data >= tail.data) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            System.out.println("Node baru " + data + " paling belakang");
            return;
        }
        // Kasus 4: diantara head dan tail
        Node1 current = head;
        while (current != null && current.data < data) {
            current = current.next;
        }
        // Insert the node before the current node
        newNode.next = current;
        newNode.prev = current.prev;
        if (current.prev != null) {
            current.prev.next = newNode;
        }
        current.prev = newNode;
        System.out.println("Node baru " + data + " di tengah");
    }

    // Delete node dengan data tertentu
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node1 current = head;
        // Case 1: Delete the head node
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null; // If the list becomes empty
            }
            return;
        }
        // Traverse to find the node to delete
        while (current != null && current.data != data) {
            current = current.next;
        }
        // Case 2: Node not found
        if (current == null) {
            System.out.println("Node " + data + " tidak ditemukan.");
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
        System.out.println("Node " + data + " telah dihapus.");
    }

    public void printListBackward() {
        Node1 current = head;
        System.out.print("Double LinkedList Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public void printListForward() {
        Node1 current = tail;
        System.out.print("Double LinkedList Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.tryThis();
    }

    void tryThis() {
        insertFirst(3);
        insertFirst(1);

        System.out.println();

        insertEnd(4);
        insertEnd(6);

        System.out.println();

        printListForward();
        printListBackward();

        System.out.println();

        insertSorted(2);
        insertSorted(5);

        System.out.println();

        printListForward();
        printListBackward();

        System.out.println();

        delete(4);
        printListForward();
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