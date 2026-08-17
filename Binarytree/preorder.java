package Binarytree;

import java.util.*;

public class preorder {// TC O(N)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTreee {
        static int idx = -1;

        public static Node bt(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = bt(nodes);
            newnode.right = bt(nodes);
            return newnode;

        }

        // preorder(ROOT LEFT RIGHT)
        public static void preorder(Node root) {// O(N)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // inorder(LEFT ROOT RIGHT)
        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // post order(LEFT RIGHT ROOT)
        public static void postorder(Node root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order traversal..
        // while pushing the level nodes at the end we will push null and then while
        // removing null, we shd add next level elements
        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            // THIS LOOP WILL RUN TILL THE QUEUE GETS EMPTY
            while (!q.isEmpty()) {
                Node currnode = q.remove();
                // if current node is null means there are 2 possibilities, either that is the
                // end of that level and next level is there (or) that is the last node of the
                // tree
                if (currnode == null) {
                    System.out.println();
                    // if queue is empty
                    if (q.isEmpty()) {
                        break;
                    }
                    // if there are more elements in the next level
                    else {
                        q.add(null);
                    }
                } else {
                    // whenever we add data , we will check that specific node's left and right side
                    // and add them into the queue
                    System.out.print(currnode.data + " ");
                    if (currnode.left != null) {
                        q.add(currnode.left);
                    }
                    if (currnode.right != null) {
                        q.add(currnode.right);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreee xyz = new BinaryTreee();
        Node z = xyz.bt(nodes);
        System.out.println(z.data);
        xyz.preorder(z);
        System.out.println();
        xyz.inorder(z);
        System.out.println();
        xyz.postorder(z);
        System.out.println();
        xyz.levelorder(z);

    }
}
