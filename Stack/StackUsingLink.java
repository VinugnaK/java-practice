package Stack;

import java.util.*;

public class StackUsingLink {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // isempty
        static boolean isemptyy() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
            // or
            // return head==null;
        }

        // push
        static void push(int data) {
            Node newnode = new Node(data);
            if (isemptyy()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        // pop
        // as we are doing only add first ..we have to do remove first to mimic stack
        // behaviour
        static int pop() {
            if (isemptyy()) {
                System.out.println("it is empty bruhh");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        // peek
        static int peek() {
            if (isemptyy()) {
                System.out.println("ll is empty bruhhhhhh");
                return -1;
            }
            int top = head.data;
            return top;
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isemptyy()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
