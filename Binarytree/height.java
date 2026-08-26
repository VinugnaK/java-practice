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

        public static int countofnode(Node root) {
            if (root == null) {
                return 0;
            }
            int leftcount = countofnode(root.left);
            int rightcount = countofnode(root.right);
            return leftcount + rightcount + 1;
        }

        public static int sumofnode(Node root) {
            if (root == null)
                return 0;
            int lc = sumofnode(root.left);
            int rc = sumofnode(root.right);
            return lc + rc + root.data;

        }

        // for calculating the diameter
        public static int diameter(Node root) { // TC:O(N^2)
            if (root == null) {
                return 0;
            }
            int ldiam = diameter(root.left);
            int rdiam = diameter(root.right);
            int lhig = heigh(root.left);
            int rhig = heigh(root.right);
            int self = lhig + rhig + 1;
            int ans = Math.max(ldiam, rdiam);
            return Math.max(ans, self);
        }

        static class Info {
            int dia, hei;

            public Info(int dia, int hei) {
                this.dia = dia;
                this.hei = hei;
            }
        }

        public static Info diamm(Node root) {// TTC: O(N)
            if (root == null)
                return new Info(0, 0);
            Info leftinfo = diamm(root.left);
            Info rightInfo = diamm(root.right);
            int di = Math.max(leftinfo.dia, Math.max(rightInfo.dia, leftinfo.hei + rightInfo.hei + 1));
            int ht = Math.max(leftinfo.hei, rightInfo.hei) + 1;
            return new Info(di, ht);
        }

        public static boolean issubtree(Node root, Node subroot) {
            // 1 check whether the subtree root matches with the current tree
            if (root == null) {
                return false;
            }

            if (isIdentical(root, subroot)) {
                return true;
            }
            // checking if left part is identical
            // boolean leftans = issubtree(root.left, subroot);
            // checking if right part is identical
            // boolean rightans = issubtree(root.right, subroot);
            return bt.issubtree(root.left, subroot) ||
                    bt.issubtree(root.right, subroot);
        }

        static boolean isIdentical(Node root, Node subroot) {
            // both are null
            if (root == null && subroot == null) {
                return true;
            }
            // either is null
            else if (root == null || subroot == null) {
                return false;
            }
            // to check if the root data an dsubroot data is same
            if (root.data != subroot.data) {
                return false;
            }
            // left part of root
            if (!isIdentical(root.left, subroot.left)) {
                return false;
            }
            // right part of root
            if (!isIdentical(root.right, subroot.right)) {
                return false;
            }
            return true;

        }
    }

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
        System.out.println(bt.countofnode(root));
        System.out.println(bt.sumofnode(root));
        System.out.println(bt.diameter(root));
        System.out.println(bt.diamm(root).dia);
        System.out.println(bt.diamm(root).hei);
        // subroot to check whether this is existing in the tree/not
        Node subroot = new Node(2);
        subroot.left = new Node(11);
        subroot.right = new Node(5);
        System.out.println(bt.issubtree(root, subroot));
    }
}
