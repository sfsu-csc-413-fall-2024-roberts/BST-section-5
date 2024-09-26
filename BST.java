public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int value) {
        // if root is null, create a new node and set it as root
        if (this.root == null) {
            this.root = new Node(value);
        } else {
            // otherwise, call the insert method on the root node
            this.root.insert(value);
        }
    }

    public boolean find(int needle) {
        // if root is null, return false
        if (this.root == null) {
            return false;
        }

        // otherwise, call the find method on the root node
        return this.root.find(needle);
    }

    public void printInOrder() {
        // if root is not null, call the printInOrder method on the root node
        if (this.root != null) {
            this.root.printInOrder();
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println("Looking for values:" + 5);
        System.out.println(bst.find(5)); // true
        System.out.println("Looking for values:" + 3);
        System.out.println(bst.find(3)); // true
        System.out.println("Looking for values:" + 7);
        System.out.println(bst.find(7)); // true
        System.out.println("Looking for values:" + 1);
        System.out.println(bst.find(1)); // false
        System.out.println("Looking for values:" + 9);
        System.out.println(bst.find(9)); // false

        bst.printInOrder(); // 2 3 4 5 6 7 8
    }
}
