public class Node {
    private int value;

    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new Node(value);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(value);
            } else {
                this.right.insert(value);
            }
        }
    }

    public boolean find(int needle) {
        if (needle == this.value) {
            return true;
        }

        if (needle < this.value) {
            if (this.left == null) {
                return false;
            } else {
                return this.left.find(needle);
            }
        } else {
            if (this.right == null) {
                return false;
            } else {
                return this.right.find(needle);
            }
        }
    }

    public void printInOrder() {
        if (this.left != null) {
            this.left.printInOrder();
        }

        System.out.println(this.value);

        if (this.right != null) {
            this.right.printInOrder();
        }
    }
}
