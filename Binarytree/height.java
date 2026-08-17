package Binarytree;

class height {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class bt {
        public static int heigh(Node root) {
            if (root == null)
                return 0;
            int lh = heigh(root.left);
            int rh = heigh(root.right);
            return Math.max(lh, rh) + 1;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(bt.heigh(root));

    }
}
