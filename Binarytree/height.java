package Binarytree;

import java.util.*;

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

    static class info {
        Node node;
        int hd;

        public info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

    }

    public static void topview(Node root) {
        // level order
        Queue<info> q = new LinkedList<>();
        // to store things in hashmap
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new info(root, 0));
        q.add(null);
        // same as level order..if null is there then check whether queue is empty or
        // not and if queue is empty break...if queue is not empty add null
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    continue;
                }

            }
            // checking if the view already eists in the map and adding
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }
            // checking for the left node
            if (curr.node.left != null) {
                q.add(new info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }
            // checking for the right node
            if (curr.node.right != null) {
                q.add(new info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }
        // printing the map
        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data);
        }

    }

    // to find kth level elements
    public static void kthlevel(Node root, int level, int k) {
        if (root == null)
            return;
        if (level == k) {
            System.out.print(root.data + " ");
        }
        kthlevel(root.left, level + 1, k);
        kthlevel(root.right, level + 1, k);
    }

    static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if (foundleft || foundright)
            return true;
        path.remove(path.size() - 1);

        return false;
    }

    // to find least common ancestors..
    static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        // to calculate path for n1 and n2
        getpath(root, n1, path1);
        getpath(root, n2, path2);

        // to calculate least common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;

    }

    // lca -approach 2
    static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node lefts = lca2(root.left, n1, n2);
        Node rights = lca2(root.right, n1, n2);

        if (lefts == null)
            return rights;
        if (rights == null)
            return lefts;

        return root;
    }

    static int dis(Node root, int n) {
        if (root == null)
            return -1;
        if (root.data == n)
            return 0;

        int leftdis = dis(root.left, n);
        int rightdis = dis(root.right, n);

        if (leftdis == -1 && rightdis == -1)
            return -1;
        else if (rightdis == -1)
            return leftdis + 1;
        else
            return rightdis + 1;

    }

    static int mindist(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = dis(lca, n1);
        int dist2 = dis(lca, n2);

        return dist1 + dist2;
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
        System.out.println("top view elements");
        topview(root);
        System.out.println("Kth level elements");
        kthlevel(root, 1, 3);
        System.out.println();
        System.out.println("least common ancestor");
        System.out.println(lca(root, 4, 5).data);
        System.out.println(lca2(root, 4, 5).data);
        System.out.println("minimum distance");
        System.out.println(mindist(root, 4, 6));
    }
}
