public class BinaryTree {
    Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        /*
         * lakukan proses penambahan data dengan memanggil method insert, ambil studi
         * kasus sebanyak n nilai
         * 
         */

        tree.insert(3);
        tree.insert(1);
        tree.insert(2);
        tree.insert(5);
        tree.insert(4);

        int i = 6;
        boolean a = tree.search(i);
        int maxx = tree.findMax();

        tree.dataShow();
        System.out.print("\nSearch " + i + " : " + a);
        System.out.print("\nFind Max : " + maxx);
    }

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRecord(root, data);
    }

    private Node insertRecord(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRecord(root.left, data);
        else if (data > root.data)
            root.right = insertRecord(root.right, data);
        return root;
    }

    public void dataShow() {
        System.out.print("\ninorder  : ");
        inorderRec(root);
        System.out.print("\nPreorder : ");
        preorderTraversal(root);
        System.out.print("\nPostorder : ");
        postorderTraversal(root);
    }

    /*
     * Inorder traversal
     * a. Traverse the left subtree
     * b. Visit the root.
     * c. Traverse the right subtree
     */
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    /*
     * Preorder traversal
     * a. Visit the root.
     * b. Traverse the left subtree
     * c. Traverse the right subtree
     */
    void preorderTraversal(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    /*
     * Postorder traversal
     * a. Traverse the left subtree
     * b. Traverse the right subtree
     * c. Visit the root.
     */
    void postorderTraversal(Node node) {
        if (node == null)
            return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    // SEARCH

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null)
            return false;
        if (data == root.data)
            return true;
        if (data < root.data)
            return searchRec(root.left, data);
        else
            return searchRec(root.right, data);
    }

    // SEARCH MAX

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(Node root) {
        if (root == null)
            throw new IllegalStateException("Empty Tree");

        /*
         * jika child kanan memiliki nilai null, berarti data ditemukan pada node
         * tersebut
         */
        if (root.right == null)
            return root.data;
        /*
         * rekursif jika data child kanan masih memiliki nilai
         */
        return findMaxRec(root.right);
    }
}

// Node Class
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
