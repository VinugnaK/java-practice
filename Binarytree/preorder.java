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

        public static void preorder(Node root) {// O(N)
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
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

    }
}
