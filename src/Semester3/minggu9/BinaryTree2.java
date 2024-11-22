public class BinaryTree2 {
    Node2 root;

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        /*
         * lakukan proses penambahan data dengan memanggil method insert, ambil studi
         * kasus sebanyak n nilai
         * 
         */

        tree.insert(3, "yanto");
        tree.insert(1, "kep");
        tree.insert(2, "klepon");
        tree.insert(5, "hakim");
        tree.insert(4, "arap");


        int i = 5;
        boolean a = tree.search(i);
        Mahasiswa maxx = tree.findMax();

        tree.dataShow();
        System.out.print("\nSearch " + i + " : " + a);
        System.out.print("\nFind Max : \n" + maxx.toString());
    }

    public BinaryTree2() {
        root = null;
    }

    public void insert(int nim, String name) {
        Mahasiswa mhs = new Mahasiswa(nim, name);
        root = insertRecord(root, mhs);
    }

    private Node2 insertRecord(Node2 root, Mahasiswa mhs) {
        if (root == null) {
            root = new Node2(mhs);
            return root;
        }
        if (mhs.getNim() < root.mahasiswa.getNim())
            root.left = insertRecord(root.left, mhs);
        else if (mhs.getNim() > root.mahasiswa.getNim())
            root.right = insertRecord(root.right, mhs);
        return root;
    }

    public void dataShow() {
        System.out.println("\nInorder  : ");
        inorderRec(root);
        System.out.println("\nPreorder : ");
        preorderTraversal(root);
        System.out.println("\nPostorder : ");
        postorderTraversal(root);
    }

    /*
     * Inorder traversal
     * a. Traverse the left subtree
     * b. Visit the root.
     * c. Traverse the right subtree
     */
    private void inorderRec(Node2 root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.mahasiswa.toString());
            inorderRec(root.right);
        }
    }

    /*
     * Preorder traversal
     * a. Visit the root.
     * b. Traverse the left subtree
     * c. Traverse the right subtree
     */
    void preorderTraversal(Node2 node) {
        if (node == null)
            return;
        System.out.println(node.mahasiswa.toString());
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    /*
     * Postorder traversal
     * a. Traverse the left subtree
     * b. Traverse the right subtree
     * c. Visit the root.
     */
    void postorderTraversal(Node2 node) {
        if (node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.mahasiswa.toString());
    }

    // SEARCH

    public boolean search(int nim) {
        return searchRec(root, nim);
    }

    private boolean searchRec(Node2 root, int nim) {
        if (root == null)
            return false;
        if (nim == root.mahasiswa.getNim())
            return true;
        if (nim < root.mahasiswa.getNim())
            return searchRec(root.left, nim);
        else
            return searchRec(root.right, nim);
    }

    // SEARCH MAX

    public Mahasiswa findMax() {
        return findMaxRec(root);
    }

    private Mahasiswa findMaxRec(Node2 root) {
        if (root == null)
            throw new IllegalStateException("Empty Tree");

        /*
         * jika child kanan memiliki nilai null, berarti data ditemukan pada node
         * tersebut
         */
        if (root.right == null)
            return root.mahasiswa;
        /*
         * rekursif jika data child kanan masih memiliki nilai
         */
        return findMaxRec(root.right);
    }
}

// Node2 Class
// class Node2 {
//     int data;
//     Node2 left, right;

//     public Node2(int item) {
//         data = item;
//         left = right = null;
//     }
// }

// Node Class
class Node2 {
    Mahasiswa mahasiswa;
    Node2 left, right;

    public Node2(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}

class Mahasiswa {
    int nim;
    String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String toString() {
        return ("Nama : " + nama + "\nNIM  : " + nim);
    }
}