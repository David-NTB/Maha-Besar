package semester3.minggu7;

// import java.io.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class QueueList {
    Node head; // head of list
    Node tail; // tail of list
    /* Insert last */

    public int enqueue(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        System.out.println("Node baru " + data + " ditambahkan");
        return 0;
    }

    /* Dequeue */
    public int dequeue() {
        // Jika list kosong
        Node current = head;
        if (head == null) {
            System.out.println("List kosong");
            return 0;
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            current = head;
            head = current.next;
            current.next = null;
        }
        System.out.println("Data diambil " + current.data);
        return 0;
    }

    public void printList() {
        Node current = head;
        System.out.print("Daftar antrian : ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        QueueList sll = new QueueList();
        sll.runThis();
    }

    void runThis() {
        enqueue(1);
        enqueue(5);
        enqueue(3);
        enqueue(2);
        enqueue(7);
        enqueue(6);
        enqueue(9);
        enqueue(8);
        printList();
        dequeue();
        printList();
        dequeue();
        printList();
        dequeue();
        printList();

    }
}
